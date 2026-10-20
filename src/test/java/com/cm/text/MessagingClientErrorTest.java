package com.cm.text;

import com.sun.net.httpserver.HttpServer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Makes sure that a failing request never leaks the product token, recipients or message content
 */
public class MessagingClientErrorTest {

    private static final String PRODUCT_TOKEN = "POC-PRODUCT-TOKEN-NOT-REAL-0001";
    private static final String RECIPIENT = "00316012345678";
    private static final String MESSAGE_TEXT = "PoC body: card number 4111-1111-1111-1111";

    private String originalUrl;

    @Before
    public void rememberUrl() {
        originalUrl = Config.BusinessMessagingApiUrl;
    }

    @After
    public void restoreUrl() {
        Config.BusinessMessagingApiUrl = originalUrl;
    }

    @Test
    public void connectionFailureDoesNotLeakRequestBody() throws Exception {
        // Reserve a port and release it again, so nothing is listening on it
        int closedPort;
        try ( ServerSocket socket = new ServerSocket( 0, 1, InetAddress.getLoopbackAddress() ) ) {
            closedPort = socket.getLocalPort();
        }
        Config.BusinessMessagingApiUrl = "http://127.0.0.1:" + closedPort + "/v1.0/message";

        assertSendFailsWithoutLeaking();
    }

    @Test
    public void errorResponseDoesNotLeakRequestBody() throws Exception {
        HttpServer server = HttpServer.create( new InetSocketAddress( InetAddress.getLoopbackAddress(), 0 ), 0 );
        server.createContext( "/v1.0/message", exchange -> {
            exchange.sendResponseHeaders( 500, -1 );
            exchange.close();
        } );
        server.start();
        try {
            Config.BusinessMessagingApiUrl = "http://127.0.0.1:" + server.getAddress().getPort() + "/v1.0/message";

            assertSendFailsWithoutLeaking();
        }
        finally {
            server.stop( 0 );
        }
    }

    private static void assertSendFailsWithoutLeaking() {
        try {
            new MessagingClient( PRODUCT_TOKEN ).sendTextMessage( MESSAGE_TEXT, "Sender", new String[]{ RECIPIENT } );
            fail( "Expected the request to fail" );
        }
        catch ( RuntimeException e ) {
            assertTrue( e.getMessage().startsWith( "Error sending request to url: " ) );
            for ( Throwable t = e; t != null; t = t.getCause() ) {
                String text = String.valueOf( t.getMessage() );
                assertFalse( "product token leaked in: " + t, text.contains( PRODUCT_TOKEN ) );
                assertFalse( "recipient leaked in: " + t, text.contains( RECIPIENT ) );
                assertFalse( "message text leaked in: " + t, text.contains( MESSAGE_TEXT ) );
            }
        }
    }
}
