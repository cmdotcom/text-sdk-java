package com.cmtelecom.text.sdk.utils;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class HttpHelper {
    private static String sendRequest( String method, String url, String data ) {
        HttpURLConnection conn = null;
        try {
            
            URL obj = new URL( url );
            conn = (HttpURLConnection) obj.openConnection();
            
            //add request header
            conn.setRequestMethod( method );
            
            conn.setRequestProperty( "Content-Type", "application/json" );
            
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

            System.out.println(response.toString());

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
    
    // HTTP POST request
    public static String post( String url, String urlParameters ) {
        return sendRequest( "POST", url, urlParameters );
    }
}