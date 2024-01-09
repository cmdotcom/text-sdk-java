package com.cm.text.utils;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class HttpHelper {

    /**
     * Used to send the HTTP request
     * @param url url to send data to
     * @param data data to be sent, as JSON
     * @return the response (when successful)
     */
    private static String sendRequest( String url, String data ) {
        return sendRequest(url, data, null);
    }
    /**
     * Used to send the HTTP request
     * @param url url to send data to
     * @param data data to be sent, as JSON
     * @param productTokenHeader when set: X-CM-ProductToken header
     * @return the response (when successful)
     */
    private static String sendRequest( String url, String data, String productTokenHeader ) {
        HttpURLConnection conn = null;
        try {
            
            URL obj = new URL( url );
            conn = (HttpURLConnection) obj.openConnection();
            
            //add request header
            conn.setRequestMethod("POST");
            
            conn.setRequestProperty( "Content-Type", "application/json" );
            if (productTokenHeader != null) {
                conn.setRequestProperty("X-CM-ProductToken", productTokenHeader);
            }
            
            if ( data != null ) {
                // Send request    
                conn.setDoOutput( true );
                try ( DataOutputStream wr = new DataOutputStream( conn.getOutputStream() ) ) {
                    wr.write( data.getBytes(StandardCharsets.UTF_8) );
                }
            }
            
            StringBuilder response = new StringBuilder();
            try ( BufferedReader in = new BufferedReader( new InputStreamReader( conn.getInputStream() ) ) ) {
                String inputLine;
                while ( (inputLine = in.readLine()) != null ) {
                    response.append( inputLine );
                }
            }

            return response.toString();
        }
        catch ( Exception e ) {
            throw new RuntimeException( String.format( "Error sending request to url: %s with data: %s", url, data ), e );
        }
        finally {
            if ( conn != null ) {
                conn.disconnect();
            }
        }
    }


    /**
     * HTTP POST request
     * @param url url to send to
     * @param urlParameters parameters to use
     * @return JSON result
     */
    public static String post( String url, String urlParameters ) {
        return sendRequest(url, urlParameters );
    }
}
