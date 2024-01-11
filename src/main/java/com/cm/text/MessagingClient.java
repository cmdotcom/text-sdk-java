package com.cm.text;

import com.cm.text.models.Message;
import com.cm.text.models.Request;
import com.cm.text.models.Response;
import com.cm.text.models.identity.OtpCheck;
import com.cm.text.models.identity.OtpRequest;
import com.cm.text.models.identity.OtpResponse;
import com.cm.text.utils.HttpHelper;
import com.google.gson.Gson;

public class MessagingClient {

    /**
     * Product token to use when sending a message
     */
    private final String productToken;


    /**
     * Initializes a new instance of the class
     * @param productToken The API key/product token to use
     */
    public MessagingClient( String productToken ) {
        this.productToken = productToken;
    }


    /**
     * Send a simple message
     * @param messageText message content
     * @param from sender id
     * @param to recipient
     * @return response message
     */
    public Response.HttpResponseBody sendTextMessage( String messageText, String from, String[] to ) {
        
        MessageBuilder builder = new MessageBuilder( messageText, from, to );
        
        Message message = builder.build();
        
        String body = GetHttpPostBody( productToken, message );
        
        String result = HttpHelper.post( Config.BusinessMessagingApiUrl, body );
        
        return getResponseBody( result, Response.HttpResponseBody.class );
    }

    /**
     * Sends the message towards an end user
     * @param message the message to send
     * @return message sending result
     */
    public Response.HttpResponseBody sendMessage( Message message ) {
        String body = GetHttpPostBody( productToken, message );
        String result = HttpHelper.post( Config.BusinessMessagingApiUrl, body );
        return getResponseBody( result, Response.HttpResponseBody.class );
    }

    /**
     * Sends a One Time Password
     * @param request The request to send
     * @return response with the identifier to use during verification
     */
    public OtpResponse sendOtpRequest(OtpRequest request) {
        String body = GetHttpPostBody(request);
        String result = HttpHelper.post(Config.OtpRequestEndpoint, body, productToken);

        return getResponseBody(result, OtpResponse.class);
    }

    /**
     * Checks one otp request
     * @param id the id to use
     * @param code the code to check
     * @return the result of the check
     */
    public OtpResponse verifyOtpRequest(String id, String code) {
        return verifyOtpRequest(new OtpCheck(id, code));
    }

    /**
     * Checks one otp request
     * @param otpCheck the id and code of the check
     * @return the result of the check
     */
    public OtpResponse verifyOtpRequest(OtpCheck otpCheck) {
        String body = GetHttpPostBody(otpCheck);
        String url = String.format(Config.OtpVerifyEndpointFormatter, otpCheck.getId());
        String result = HttpHelper.post(url, body, productToken);

        return getResponseBody(result, OtpResponse.class);
    }


    /**
     * Gets the HTTP post response as an object.
     * @param body JSON input
     * @return Result object
     */
    protected static <T> T getResponseBody( String body, Class<T> classOfT ) {
        try {
            return new Gson().fromJson( body, classOfT );
        }
        catch ( Exception e ) {
            throw new RuntimeException( "Invalid json response-body", e );
        }
    }

    /**
     * Transforms the message into JSON
     * @param productToken token to add to the JSON
     * @param message content to send
     * @return JSON body to send
     */
    protected static String GetHttpPostBody( String productToken, Message message ) {
        Request.Messages messages = new Request.Messages();
        Request.MessagesEnvelope request = new Request.MessagesEnvelope();
        request.setAuthentication( new Request.Authentication( productToken ) );
        Message[] msg = new Message[]{ message };
        request.setMessages( msg );
        messages.setMessages( request );
        try {
            return new Gson().toJson( messages );
        }
        catch ( Exception e ) {
            throw new RuntimeException( "Invalid request body", e );
        }
    }

    protected static String GetHttpPostBody( OtpRequest request ) {
        try {
            return new Gson().toJson( request );
        }
        catch ( Exception e ) {
            throw new RuntimeException( "Invalid request body", e );
        }
    }

    protected static String GetHttpPostBody( OtpCheck request ) {
        try {
            return new Gson().toJson( request );
        }
        catch ( Exception e ) {
            throw new RuntimeException( "Invalid request body", e );
        }
    }
    
}
