package utils;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class HttpHelper {
    private static String sendRequest(String method, String url, String data) {
        try {

            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();

            //add request header
            con.setRequestMethod(method);

            con.setRequestProperty("Content-Type", "application/json");


            if (data != null) {
                // Send request
                con.setDoOutput(true);
                try (DataOutputStream wr = new DataOutputStream(con.getOutputStream())) {
                    wr.writeBytes(data);
                }
            }

            StringBuilder response = new StringBuilder();
            try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
            }

            return response.toString();
        } catch (ConnectException ce) {
            System.out.println(ce.getMessage());
            return ce.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return e.toString();
        }
    }

    // HTTP POST request
    public static String post(String url, String urlParameters) {
        return sendRequest("POST", url, urlParameters);
    }

}
