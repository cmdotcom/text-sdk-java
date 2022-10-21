package com.cm.text.sdk;


import com.cm.text.sdk.models.Body;
import com.cm.text.sdk.models.Channel;
import com.cm.text.sdk.models.Message;
import com.cm.text.sdk.models.Recipient;
import com.cm.text.sdk.models.multichannel.IRichMessage;
import com.cm.text.sdk.models.multichannel.RichContent;
import com.cm.text.sdk.models.multichannel.Suggestion;
import com.cm.text.sdk.models.templates.TemplateMessage;

import java.util.ArrayList;
import java.util.List;

public class MessageBuilder {

    private Message message;
    private RichContent richContent;


    /// <summary>
    ///     Creates a new MessageBuilder
    /// </summary>
    /// <param name="messageText"></param>
    /// <param name="from"></param>
    /// <param name="to"></param>
    public MessageBuilder(String messageText, String from,String[] to)
    {
        List<Recipient> recipientList = new ArrayList<>();
        for (String number : to) {
            Recipient r = new Recipient();
            r.Number = number;
            recipientList.add(r);

        }

        this.message = new Message(new Body(messageText), from, recipientList);
    }

    /// <summary>
    ///  Creates a new MessageBuilder with auto detect encoding
    /// </summary>
    /// <param name="messageText"></param>
    /// <param name="from"></param>
    /// <param name="to"></param>
     public MessageBuilder(String messageText,  String type, String from,String[] to)
    {
        List<Recipient> recipientList = new ArrayList<>();
        for (String number : to) {
            Recipient r = new Recipient();
            r.Number = number;
            recipientList.add(r);

        }

        this.message = new Message(new Body(messageText, type), from, recipientList);
    }

    /// <summary>
    ///     Constructs the message.
    /// </summary>
    /// <returns></returns>
    public Message Build()
    {
        this.message.RichContent = this.richContent;
        return this.message;
    }

    /// <summary>
    ///     Adds the allowed channels field, which forces a message to only use certain routes.
    ///     You can define a list of which channels you want your message to use.
    ///     Not defining any channels will be interpreted as allowing all channels.
    /// </summary>
    /// <remarks>
    ///     Note that for channels other than SMS, CM needs to configure the out going flows.
    ///     For those flows to work, we need to be contacted.
    /// </remarks>
    public MessageBuilder WithAllowedChannels(Channel[] channels)
    {
        this.message.AllowedChannels = channels;
        return this;
    }

    /// <summary>
    ///     Add a reference to the message.
    /// </summary>
    /// <param name="reference"></param>
    /// <returns></returns>
    public MessageBuilder WithReference(String reference)
    {
        this.message.Reference = reference;
        return this;
    }

    /// <summary>
    ///     Adds a message that replaces the <see cref="Message.Body" /> for channels that support
    ///     rich content (all channels except <see cref="Channel.SMS" />, <see cref="Channel.Voice" />
    ///     and <see cref="Channel.Push" /> at this moment)
    /// </summary>
    /// <param name="richMessage"></param>
    /// <returns></returns>
    public MessageBuilder WithRichMessage(IRichMessage richMessage)
    {
        if (this.richContent == null)
            this.richContent = new RichContent();

        this.richContent.AddConversationPart(richMessage);
        return this;
    }

    /// <summary>
    ///     Adds suggestions to the message. It is dependent on the channel that is used which
    ///     suggestions are supported.
    /// </summary>
    /// <param name="suggestions"></param>
    /// <returns></returns>
    public MessageBuilder WithSuggestions(Suggestion[] suggestions)
    {
        if (this.richContent == null)
            this.richContent = new RichContent();

        this.richContent.Suggestions = suggestions;
        return this;
    }
    
    public MessageBuilder WithTemplate(TemplateMessage template){
        if (this.richContent == null)
            this.richContent = new RichContent();           
           
        this.richContent.AddConversationPart(template);
        return this;
    }
}
