package com.cm.text;


import com.cm.text.models.Body;
import com.cm.text.models.Channel;
import com.cm.text.models.Message;
import com.cm.text.models.Recipient;
import com.cm.text.models.multichannel.IRichMessage;
import com.cm.text.models.multichannel.RichContent;
import com.cm.text.models.multichannel.Suggestion;
import com.cm.text.models.templates.TemplateMessage;

import java.util.ArrayList;
import java.util.List;

/**
 * Builder class to construct messages
 */
public class MessageBuilder {

    private final Message message;
    private RichContent richContent;

    /**
     * Creates a new MessageBuilder
     * @param messageText text to send in the message
     * @param from sender id
     * @param to recipients to send the messages towards
     */
    public MessageBuilder(String messageText, String from,String[] to)
    {
        List<Recipient> recipientList = new ArrayList<>();
        for (String number : to) {
            Recipient r = new Recipient();
            r.setNumber(number);
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

    /**
     *  Creates a new MessageBuilder
     * @param messageText text to send in the message
     * @param type encoding to use (use auto for auto detect encoding)
     * @param from sender id
     * @param to recipients to send the messages towards
     */
    public MessageBuilder(String messageText,  String type, String from,String[] to)
    {
        List<Recipient> recipientList = new ArrayList<>();
        for (String number : to) {
            Recipient r = new Recipient();
            r.setNumber(number);
            recipientList.add(r);

        }

        this.message = new Message(new Body(messageText, type), from, recipientList);
    }

    /**
     * Constructs the message
     * @return the message to send
     */
    public Message build()
    {
        this.message.setRichContent(this.richContent);
        return this.message;
    }

    /**
     * Adds the allowed channels field, which forces a message to only use certain routes.
     *  You can define a list of which channels you want your message to use.
     *  Not defining any channels will be interpreted as allowing all channels.
     *  Note that for channels other than SMS, CM needs to configure the out going flows. For those flows to work, we need to be contacted.
     * @param channels Define the list of which channels you want your message to use
     * @return this builder, for chaining
     */
    public MessageBuilder withAllowedChannels(Channel[] channels)
    {
        this.message.setAllowedChannels(channels);
        return this;
    }

    /**
     * Add a reference to the message.
     * @param reference the reference to use
     * @return this builder, for chaining
     */
    public MessageBuilder withReference(String reference)
    {
        this.message.setReference(reference);
        return this;
    }


    /**
     * Adds a message that replaces the body for channels that support rich content
     * @param richMessage the rich message to add
     * @return this builder, for chaining
     */
    public MessageBuilder withRichMessage(IRichMessage richMessage)
    {
        if (this.richContent == null)
            this.richContent = new RichContent();

        this.richContent.AddConversationPart(richMessage);
        return this;
    }

    /**
     * Adds suggestions to the message. It is dependent on the channel that is used which suggestions are supported.
     * @param suggestions suggestions to add
     * @return this builder, for chaining
     */
    public MessageBuilder withSuggestions(Suggestion[] suggestions)
    {
        if (this.richContent == null)
            this.richContent = new RichContent();

        this.richContent.setSuggestions(suggestions);
        return this;
    }

    /**
     * Adds a WhatsApp template message that replaces the body for WhatsApp messages
     * please note that you need to have approved wa templates.
     * @param template the template to add
     * @return this builder, for chaining
     */
    public MessageBuilder withTemplate(TemplateMessage template){
        if (this.richContent == null)
            this.richContent = new RichContent();           
           
        this.richContent.AddConversationPart(template);
        return this;
    }

    /**
     * Adds a custom DCS
     * @param dcs data coding scheme see <a href="https://developers.cm.com/messaging/docs/sms">Developer docs</a> for more information
     * @return this builder, for chaining
     */
    public MessageBuilder withDcs(int dcs)
    {
        this.message.setDcs(dcs);
        return this;
    }
}
