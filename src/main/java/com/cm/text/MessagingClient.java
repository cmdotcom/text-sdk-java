package com.cm.text;

import com.cm.text.models.Message;
import com.cm.text.models.Request;
import com.cm.text.models.Response;
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
        
        return getResponseBody( result );
    }

    /**
     * Sends the message towards an end user
     * @param message the message to send
     * @return message sending result
     */
    public Response.HttpResponseBody sendMessage( Message message ) {
        String body = GetHttpPostBody( productToken, message );
        String result = HttpHelper.post( Config.BusinessMessagingApiUrl, body );
        return getResponseBody( result );
    }

    /**
     * Gets the HTTP post response as an object.
     * @param body JSON input
     * @return Result object
     */
    protected static Response.HttpResponseBody getResponseBody( String body ) {
        try {
            return new Gson().fromJson( body, Response.HttpResponseBody.class );
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
    
}
