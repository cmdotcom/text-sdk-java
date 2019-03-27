package com.cmtelecom.text.sdk;

import com.google.gson.Gson;
import com.cmtelecom.text.sdk.models.Message;
import com.cmtelecom.text.sdk.models.Request;
import com.cmtelecom.text.sdk.models.Response;
import com.cmtelecom.text.sdk.utils.HttpHelper;

public class MessagingClient {
    
    private String productToken;
    
    
    public MessagingClient( String productToken ) {
        this.productToken = productToken;
    }
    
    
    public Response.HttpResponseBody sendTextMessage( String messageText, String from, String[] to ) {
        
        MessageBuilder builder = new MessageBuilder( messageText, from, to );
        
        Message message = builder.Build();
        
        String body = GetHttpPostBody( productToken, message );
        
        String result = HttpHelper.post( Config.ApiUrl, body );
        
        return getResponseBody( result );
    }
    
    
    public Response.HttpResponseBody sendMessage( Message message ) {
        String body = GetHttpPostBody( productToken, message );
        String result = HttpHelper.post( Config.ApiUrl, body );
        return getResponseBody( result );
    }
    
    
    /// <summary>
    ///     Gets the HTTP post body.
    /// </summary>
    /// <param name="apiKey">The API key.</param>
    /// <param name="message">The message to send.</param>
    /// <returns></returns>
    protected static Response.HttpResponseBody getResponseBody( String body ) {
        try {
            Response.HttpResponseBody result = new Gson().fromJson( body, Response.HttpResponseBody.class );
            return result;
        }
        catch ( Exception e ) {
            throw new RuntimeException( "Invalid json response-body", e );
        }
    }
    
    
    /// <summary>
    ///     Gets the HTTP post body.
    /// </summary>
    /// <param name="apiKey">The API key.</param>
    /// <param name="message">The message to send.</param>
    /// <returns></returns>
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
