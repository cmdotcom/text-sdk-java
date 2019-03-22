import com.google.gson.Gson;
import models.Channel;
import models.Message;
import models.Request;

import utils.HttpHelper;

import java.util.ArrayList;
import java.util.List;

public class MessagingClient {

    private String productToken;

    public MessagingClient(String productToken){
        this.productToken = productToken;
    }


    public void sendTextMessage(String messageText, String from,String[] to){

        try{
            MessageBuilder builder = new MessageBuilder("Message Text", "Souff", new String[] {"0614134569"});

            Message message = builder.Build();

            String body = GetHttpPostBody(productToken, message);

            HttpHelper.post(Config.ApiUrl, body);
        }

        catch (Exception e){
            System.out.println("Please check your request body.");
        }
    }


    public void sendMessage(Message message) {

    try{
          String body = GetHttpPostBody(productToken, message);

          HttpHelper.post(Config.ApiUrl, body);
        }

        catch (Exception e ){
      System.out.println("Please check your request body.");
    }
    }


    /// <summary>
    ///     Gets the HTTP post body.
    /// </summary>
    /// <param name="apiKey">The API key.</param>
    /// <param name="message">The message to send.</param>
    /// <returns></returns>
    protected static String GetHttpPostBody(String productToken, Message message)
    {
        Request.Messages messages = new Request.Messages();
        Request.MessagesEnvelope request = new Request.MessagesEnvelope();
        request.setAuthentication(new Request.Authentication(productToken));
        Message[] msg = new Message[]{message};
        request.setMessages(msg);
        messages.setMessages(request);
        return new Gson().toJson(messages);
    }

}