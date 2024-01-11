package com.cm.text.models;

import com.cm.text.models.multichannel.RichContent;
import com.google.gson.annotations.SerializedName;

import java.util.List;


/**
 * Class representing one message
 */
public class Message {

    /**
     * The allowed channels field forces a message to only use certain routes.
     * In this field you can define a list of which channels you want your message to use.
     * Not defining any channels will be interpreted as allowing all channels.
     * Note that for channels other than SMS, CM.Com needs to configure the outgoing flows.
     * For those flows to work, we need to be contacted.
     */
    @SerializedName("allowedChannels")
    private Channel[] allowedChannels;

    /**
     * Required: The actual text body of the message.
     */
    @SerializedName("body")
    private Body body ;

    /**
     * The custom grouping field is an optional field that can be used to tag messages.
     * These tags are be used by CM products, like the Transactions API.
     * Applying custom grouping names to messages helps filter your messages.
     * With up to three levels of custom grouping fields that can be set, subsets of messages can be
     * further broken down. The custom grouping name can be up to 100 characters of your choosing.
     * It’s recommended to limit the number of unique custom groupings to 1000.
     * Please contact support in case you would like to exceed this number.
     */
    @SerializedName("customGrouping")
    private String customGrouping = "text-sdk-java";

    /**
     * Similar with the customGrouping field
     * The custom grouping2 field is an optional field that can be used to tag messages.
     * These tags are be used by CM products, like the Transactions API.
     * Applying custom grouping names to messages helps filter your messages.
     * With up to three levels of custom grouping fields that can be set, subsets of messages can be
     * further broken down. The custom grouping name can be up to 100 characters of your choosing.
     * It’s recommended to limit the number of unique custom groupings to 1000.
     * Please contact support in case you would like to exceed this number.
     */
    @SerializedName("customGrouping2")
    private String customGrouping2;

    /**
     * Similar with the other customGrouping fields
     * The custom grouping field is an optional field that can be used to tag messages.
     * These tags are be used by CM products, like the Transactions API.
     * Applying custom grouping names to messages helps filter your messages.
     * With up to three levels of custom grouping fields that can be set, subsets of messages can be
     * further broken down. The custom grouping name can be up to 100 characters of your choosing.
     * It’s recommended to limit the number of unique custom groupings to 1000.
     * Please contact support in case you would like to exceed this number.
     */
    @SerializedName("customGrouping3")
    private String customGrouping3;

    /**
     * Required: This is the sender name. The maximum length is 11 alphanumerical characters or 16 digits. Example: 'CM Telecom'
     */
    @SerializedName("from")
    private String from;


    /**
     * Used when sending multipart or concatenated SMS messages and always used together with MinimumNumberOfMessageParts.
     * Indicate the minimum and maximum of message parts that you allow the gateway to send for this
     * message.
     * Technically the gateway will first check if a message is larger than 160 characters, if so, the
     * message will be cut into multiple 153 characters parts limited by these parameters.
     */
    @SerializedName("maximumNumberOfMessageParts")
    private Integer maximumNumberOfMessageParts;

    /**
     * Used when sending multipart or concatenated SMS messages and always used together with MaximumNumberOfMessageParts.
     * Indicate the minimum and maximum of message parts that you allow the gateway to send for this message.
     * Technically the gateway will first check if a message is larger than 160 characters, if so, the
     * message will be cut into multiple 153 characters parts limited by these parameters.
     */
    @SerializedName("minimumNumberOfMessageParts")
    private Integer minimumNumberOfMessageParts;

    /**
     * The destination mobile numbers. This value should be in international format.A single mobile number per request. Example: '00447911123456'
     */
    @SerializedName("to")
    private List<Recipient> recipients;

    /**
     *  Optional: For each message you send, you can set a reference.
     *     The given reference will be used in the status reports and MO replies for the message,
     *     so you can link the messages to the message that was sent.
     *     For more information on status reports, see:
     *     <a href="https://developers.cm.com/messaging/docs/incoming-status-report">Developer docs</a>
     *     The given reference must be between 1 - 32 alphanumeric characters.
     */
    @SerializedName("reference")
    private String reference;

    /**
     * Can be used by channels that support rich content (all channels except SMS at the moment)
     */
    @SerializedName("richContent")
    private com.cm.text.models.multichannel.RichContent richContent;

    /**
     *     Optional: For each message you send, you can set a validity.
     *     Specify a time at which a delayed message can be considered irrelevant, you can supply an absolute date & time
     *     or a relative offset. A message is considered failed if it was not successfully delivered before that time.
     *     And via a Status Report we inform you this was the case.
     *     For more information on status reports, see:
     *     <a href="https://developers.cm.com/messaging/docs/incoming-status-report">Status report developer docs</a>
     *     You can supply the time zone for the validity period using either of the following formats:
     *     Absolute date and time:
     *     2017-04-20 11:50:05 GMT
     *     2017-04-20 11:50:05+8
     *     2017-04-20 11:55:05-07:00
     *     If no time zone was specified, CE(S)T will be used. (CM local time)
     *     Relative offset in hour(H) or minute(M)
     *     2h
     *     30m
     *     You can set the validity in either hours or minutes. A combination of both is not supported.
     */
    @SerializedName("validity")
    private String validity;

    /**
     * Optional: If you set DCS to '0' or do not include the parameter, the messages uses standard GSM encoding.
     * To set your message up for unicode messaging set the value of dcs to 8
     * <a href="https://developers.cm.com/messaging/docs/sms#custom-dcs">DCS</a>
     */
    @SerializedName("dcs")
    private int dcs = 0;

    /**
     * Initializes a new message
     * @param body The actual text body of the message.
     * @param from This is the sender name. The maximum length is 11 alphanumerical characters or 16 digits. Example: 'CM Telecom'
     * @param recipientList The destination mobile numbers. This value should be in international format.A single mobile number per request. Example: '00447911123456'
     */
    public Message(Body body, String from, List<Recipient> recipientList) {
        this.body = body;
        this.from = from;
        this.recipients = recipientList;
    }

    /**
     * The actual text body of the message.
     * @return The actual text body of the message.
     */
    public Body getBody() {
        return body;
    }

    /**
     *
     * @param body The actual text body of the message.
     */
    public void setBody(Body body) {
        this.body = body;
    }

    /**
     *
     * @return This is the sender name. The maximum length is 11 alphanumerical characters or 16 digits. Example: 'CM Telecom'
     */
    public String getFrom() {
        return from;
    }

    /**
     *
     * @param from This is the sender name. The maximum length is 11 alphanumerical characters or 16 digits. Example: 'CM Telecom'
     */
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     *
     * @return The destination mobile numbers. This value should be in international format.A single mobile number per request. Example: '00447911123456'
     */
    public List<Recipient> getRecipients() {
        return recipients;
    }

    /**
     *
     * @param recipients The destination mobile numbers. This value should be in international format.A single mobile number per request. Example: '00447911123456'
     */
    public void setRecipients(List<Recipient> recipients) {
        this.recipients = recipients;
    }

    /**
     *
     * @return The allowed channels field forces a message to only use certain routes.
     * In this field you can define a list of which channels you want your message to use.
     * Not defining any channels will be interpreted as allowing all channels.
     * Note that for channels other than SMS, CM.Com needs to configure the outgoing flows.
     * For those flows to work, we need to be contacted.
     */
    public Channel[] getAllowedChannels() {
        return allowedChannels;
    }

    /**
     *
     * @param allowedChannels The allowed channels field forces a message to only use certain routes.
     * In this field you can define a list of which channels you want your message to use.
     * Not defining any channels will be interpreted as allowing all channels.
     * Note that for channels other than SMS, CM.Com needs to configure the outgoing flows.
     * For those flows to work, we need to be contacted.
     */
    public void setAllowedChannels(Channel[] allowedChannels) {
        this.allowedChannels = allowedChannels;
    }

    /**
     * @return The custom grouping field is an optional field that can be used to tag messages.
     * These tags are be used by CM products, like the Transactions API.
     * Applying custom grouping names to messages helps filter your messages.
     * With up to three levels of custom grouping fields that can be set, subsets of messages can be
     * further broken down. The custom grouping name can be up to 100 characters of your choosing.
     * It’s recommended to limit the number of unique custom groupings to 1000.
     * Please contact support in case you would like to exceed this number.
     */
    public String getCustomGrouping() {
        return customGrouping;
    }

    /**
     * @param customGrouping The custom grouping field is an optional field that can be used to tag messages.
     * These tags are be used by CM products, like the Transactions API.
     * Applying custom grouping names to messages helps filter your messages.
     * With up to three levels of custom grouping fields that can be set, subsets of messages can be
     * further broken down. The custom grouping name can be up to 100 characters of your choosing.
     * It’s recommended to limit the number of unique custom groupings to 1000.
     * Please contact support in case you would like to exceed this number.
     */
    public void setCustomGrouping(String customGrouping) {
        this.customGrouping = customGrouping;
    }

    /**
     *
     * @return The custom grouping2 field is an optional field that can be used to tag messages.
     * These tags are be used by CM products, like the Transactions API.
     * Applying custom grouping names to messages helps filter your messages.
     * With up to three levels of custom grouping fields that can be set, subsets of messages can be
     * further broken down. The custom grouping name can be up to 100 characters of your choosing.
     * It’s recommended to limit the number of unique custom groupings to 1000.
     * Please contact support in case you would like to exceed this number.
     */
    public String getCustomGrouping2() {
        return customGrouping2;
    }

    /**
     *
     * @param customGrouping2 The custom grouping2 field is an optional field that can be used to tag messages.
     * These tags are be used by CM products, like the Transactions API.
     * Applying custom grouping names to messages helps filter your messages.
     * With up to three levels of custom grouping fields that can be set, subsets of messages can be
     * further broken down. The custom grouping name can be up to 100 characters of your choosing.
     * It’s recommended to limit the number of unique custom groupings to 1000.
     * Please contact support in case you would like to exceed this number.
     */
    public void setCustomGrouping2(String customGrouping2) {
        this.customGrouping2 = customGrouping2;
    }

    /**
     * @return The custom grouping3 field is an optional field that can be used to tag messages.
     * These tags are be used by CM products, like the Transactions API.
     * Applying custom grouping names to messages helps filter your messages.
     * With up to three levels of custom grouping fields that can be set, subsets of messages can be
     * further broken down. The custom grouping name can be up to 100 characters of your choosing.
     * It’s recommended to limit the number of unique custom groupings to 1000.
     * Please contact support in case you would like to exceed this number.
     */
    public String getCustomGrouping3() {
        return customGrouping3;
    }

    /**
     * @param customGrouping3 The custom grouping3 field is an optional field that can be used to tag messages.
     * These tags are be used by CM products, like the Transactions API.
     * Applying custom grouping names to messages helps filter your messages.
     * With up to three levels of custom grouping fields that can be set, subsets of messages can be
     * further broken down. The custom grouping name can be up to 100 characters of your choosing.
     * It’s recommended to limit the number of unique custom groupings to 1000.
     * Please contact support in case you would like to exceed this number.
     */
    public void setCustomGrouping3(String customGrouping3) {
        this.customGrouping3 = customGrouping3;
    }

    /**
     * @return Used when sending multipart or concatenated SMS messages and always used together with MinimumNumberOfMessageParts.
     * Indicate the minimum and maximum of message parts that you allow the gateway to send for this
     * message.
     * Technically the gateway will first check if a message is larger than 160 characters, if so, the
     * message will be cut into multiple 153 characters parts limited by these parameters.
     */
    public Integer getMaximumNumberOfMessageParts() {
        return maximumNumberOfMessageParts;
    }

    /**
     * @param maximumNumberOfMessageParts Used when sending multipart or concatenated SMS messages and always used together with MinimumNumberOfMessageParts.
     * Indicate the minimum and maximum of message parts that you allow the gateway to send for this
     * message.
     * Technically the gateway will first check if a message is larger than 160 characters, if so, the
     * message will be cut into multiple 153 characters parts limited by these parameters.
     */
    public void setMaximumNumberOfMessageParts(Integer maximumNumberOfMessageParts) {
        this.maximumNumberOfMessageParts = maximumNumberOfMessageParts;
    }

    /**
     *
     * @return Used when sending multipart or concatenated SMS messages and always used together with MaximumNumberOfMessageParts.
     * Indicate the minimum and maximum of message parts that you allow the gateway to send for this message.
     * Technically the gateway will first check if a message is larger than 160 characters, if so, the
     * message will be cut into multiple 153 characters parts limited by these parameters.
     */
    public Integer getMinimumNumberOfMessageParts() {
        return minimumNumberOfMessageParts;
    }

    /**
     *
     * @param minimumNumberOfMessageParts Used when sending multipart or concatenated SMS messages and always used together with MaximumNumberOfMessageParts.
     * Indicate the minimum and maximum of message parts that you allow the gateway to send for this message.
     * Technically the gateway will first check if a message is larger than 160 characters, if so, the
     * message will be cut into multiple 153 characters parts limited by these parameters.
     */
    public void setMinimumNumberOfMessageParts(Integer minimumNumberOfMessageParts) {
        this.minimumNumberOfMessageParts = minimumNumberOfMessageParts;
    }

    /**
     *
     * @return For each message you send, you can set a reference.
     *      The given reference will be used in the status reports and MO replies for the message,
     *      so you can link the messages to the message that was sent.
     *      For more information on status reports, see:
     *      <a href="https://developers.cm.com/messaging/docs/incoming-status-report">Developer docs</a>
     */
    public String getReference() {
        return reference;
    }

    /**
     *
     * @param reference For each message you send, you can set a reference.
     *      The given reference will be used in the status reports and MO replies for the message,
     *      so you can link the messages to the message that was sent.
     *      For more information on status reports, see:
     *      <a href="https://developers.cm.com/messaging/docs/incoming-status-report">Developer docs</a>
     */
    public void setReference(String reference) {
        this.reference = reference;
    }

    /**
     * @return Specifies a time at which a delayed message can be considered irrelevant, you can supply an absolute date & time
     * or a relative offset. A message is considered failed if it was not successfully delivered before that time.
     * And via a Status Report we inform you this was the case.
     * For more information on status reports, see:
     * <a href="https://developers.cm.com/messaging/docs/incoming-status-report">Status report developer docs</a>
     * You can supply the time zone for the validity period using either of the following formats:
     * Absolute date and time:
     * 2017-04-20 11:50:05 GMT
     * 2017-04-20 11:50:05+8
     * 2017-04-20 11:55:05-07:00
     * If no time zone was specified, CE(S)T will be used. (CM local time)
     * Relative offset in hour(H) or minute(M)
     * 2h
     * 30m
     * You can set the validity in either hours or minutes. A combination of both is not supported.
     */
    public String getValidity() {
        return validity;
    }

    /**
     * @param validity a time at which a delayed message can be considered irrelevant, you can supply an absolute date & time
     * or a relative offset. A message is considered failed if it was not successfully delivered before that time.
     * And via a Status Report we inform you this was the case.
     * For more information on status reports, see:
     * <a href="https://developers.cm.com/messaging/docs/incoming-status-report">Status report developer docs</a>
     * You can supply the time zone for the validity period using either of the following formats:
     * Absolute date and time:
     * 2017-04-20 11:50:05 GMT
     * 2017-04-20 11:50:05+8
     * 2017-04-20 11:55:05-07:00
     * If no time zone was specified, CE(S)T will be used. (CM local time)
     * Relative offset in hour(H) or minute(M)
     * 2h
     * 30m
     * You can set the validity in either hours or minutes. A combination of both is not supported.
     */
    public void setValidity(String validity) {
        this.validity = validity;
    }

    /**
     * @return The rich content to be sent to the end user
     */
    public RichContent getRichContent() {
        return richContent;
    }

    /**
     * @param richContent The rich content to be sent to the end user
     */
    public void setRichContent(RichContent richContent) {
        this.richContent = richContent;
    }

    /**
     * @return If you set DCS to '0' or do not include the parameter, the messages uses standard GSM encoding.
     * To set your message up for unicode messaging set the value of dcs to 8
     * <a href="https://developers.cm.com/messaging/docs/sms#custom-dcs">DCS</a>
     */
    public int getDcs() {
        return dcs;
    }

    /**
     * @param dcs If you set DCS to '0' or do not include the parameter, the messages uses standard GSM encoding.
     * To set your message up for unicode messaging set the value of dcs to 8
     * <a href="https://developers.cm.com/messaging/docs/sms#custom-dcs">DCS</a>
     */
    public void setDcs(int dcs) {
        this.dcs = dcs;
    }
}
