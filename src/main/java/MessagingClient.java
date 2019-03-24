import com.google.gson.Gson;
import models.Message;
import models.Request;

import models.Response;
import utils.HttpHelper;

public class MessagingClient {

    private String productToken;


    public MessagingClient(String productToken) {
        this.productToken = productToken;
    }


    public Response.HttpResponseBody sendTextMessage(String messageText, String from, String[] to) {

        try {
            MessageBuilder builder = new MessageBuilder(messageText, from, to);

            Message message = builder.Build();

            String body = GetHttpPostBody(productToken, message);

            String result = HttpHelper.post(Config.ApiUrl, body);

            return getResponseBody(result);

        } catch (Exception e) {
            System.out.println("Please check your request body.");
            throw e;
        }
    }


    public Response.HttpResponseBody sendMessage(Message message) {

        try {
            String body = GetHttpPostBody(productToken, message);

            String result = HttpHelper.post(Config.ApiUrl, body);

            return getResponseBody(result);
        } catch (Exception e) {
            System.out.println("Please check your request body.");
            throw e;
        }
    }


    /// <summary>
    ///     Gets the HTTP post body.
    /// </summary>
    /// <param name="apiKey">The API key.</param>
    /// <param name="message">The message to send.</param>
    /// <returns></returns>
    protected static Response.HttpResponseBody getResponseBody(String body) {
        Response.HttpResponseBody result = new Gson().fromJson(body, Response.HttpResponseBody.class);
        return result;
    }


    /// <summary>
    ///     Gets the HTTP post body.
    /// </summary>
    /// <param name="apiKey">The API key.</param>
    /// <param name="message">The message to send.</param>
    /// <returns></returns>
    protected static String GetHttpPostBody(String productToken, Message message) {
        Request.Messages messages = new Request.Messages();
        Request.MessagesEnvelope request = new Request.MessagesEnvelope();
        request.setAuthentication(new Request.Authentication(productToken));
        Message[] msg = new Message[]{message};
        request.setMessages(msg);
        messages.setMessages(request);
        return new Gson().toJson(messages);
    }

}
