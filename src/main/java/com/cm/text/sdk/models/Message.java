package com.cm.text.sdk.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Message {
    /// <summary>
    ///     The allowed channels field forces a message to only use certain routes.
    ///     In this field you can define a list of which channels you want your message to use.
    ///     Not defining any channels will be interpreted as allowing all channels.
    /// </summary>
    /// <remarks>
    ///     Note that for channels other than SMS, CM needs to configure the out going flows.
    ///     For those flows to work, we need to be contacted.
    /// </remarks>
    @SerializedName("allowedChannels")
    public Channel[] AllowedChannels;

    /// <summary>
    ///     Required: The actual text body of the message.
    /// </summary>
    @SerializedName("body")
    public Body Body ;

    /// <summary>
    ///     The custom grouping field is an optional field that can be used to tag messages.
    ///     These tags are be used by CM products, like the Transactions API.
    ///     Applying custom grouping names to messages helps filter your messages.
    ///     With up to three levels of custom grouping fields that can be set, subsets of messages can be
    ///     further broken down. The custom grouping name can be up to 100 characters of your choosing.
    ///     It’s recommended to limit the number of unique custom groupings to 1000.
    ///     Please contact support in case you would like to exceed this number.
    /// </summary>
    @SerializedName("customGrouping")
    public String CustomGrouping = "text-sdk-java";

    /// <summary>
    ///     The custom grouping2 field, like <see cref="CustomGrouping" /> is an optional field that can be used to tag
    ///     messages.
    ///     These tags are be used by CM products, like the Transactions API.
    ///     Applying custom grouping names to messages helps filter your messages.
    ///     With up to three levels of custom grouping fields that can be set, subsets of messages can be
    ///     further broken down. The custom grouping name can be up to 100 characters of your choosing.
    ///     It’s recommended to limit the number of unique custom groupings to 1000.
    ///     Please contact support in case you would like to exceed this number.
    /// </summary>
    @SerializedName("customGrouping2")
    public String CustomGrouping2;

    /// <summary>
    ///     The custom grouping3 field, like <see cref="CustomGrouping" /> and <see cref="CustomGrouping2" /> is an optional
    ///     field that can be used to tag messages.
    ///     These tags are be used by CM products, like the Transactions API.
    ///     Applying custom grouping names to messages helps filter your messages.
    ///     With up to three levels of custom grouping fields that can be set, subsets of messages can be
    ///     further broken down. The custom grouping name can be up to 100 characters of your choosing.
    ///     It’s recommended to limit the number of unique custom groupings to 1000.
    ///     Please contact support in case you would like to exceed this number.
    /// </summary>
    /// <remarks>Default value within this SDK is <see cref="Common.Constant.TextSdkReference" /></remarks>
    @SerializedName("customGrouping3")
    public String CustomGrouping3;

    /// <summary>
    ///     Required: This is the sender name.
    ///     The maximum length is 11 alphanumerical characters or 16 digits. Example: 'CM Telecom'
    /// </summary>
    @SerializedName("from")
    public String From;



    /// <summary>
    ///     Used when sending multipart or concatenated SMS messages and always used together with
    ///     <see cref="MinimumNumberOfMessageParts" />.
    ///     Indicate the minimum and maximum of message parts that you allow the gateway to send for this
    ///     message.
    ///     Technically the gateway will first check if a message is larger than 160 characters, if so, the
    ///     message will be cut into multiple 153 characters parts limited by these parameters.
    /// </summary>
    @SerializedName("maximumNumberOfMessageParts")
    public Integer MaximumNumberOfMessageParts;

    /// <summary>
    ///     Used when sending multipart or concatenated SMS messages and always used together with
    ///     <see cref="MaximumNumberOfMessageParts" />.
    ///     Indicate the minimum and maximum of message parts that you allow the gateway to send for this
    ///     message.
    ///     Technically the gateway will first check if a message is larger than 160 characters, if so, the
    ///     message will be cut into multiple 153 characters parts limited by these parameters.
    /// </summary>
    @SerializedName("minimumNumberOfMessageParts")
    public Integer MinimumNumberOfMessageParts;

    /// <summary>
    ///     Required: The destination mobile numbers.
    ///     This value should be in international format.
    ///     A single mobile number per request. Example: '00447911123456'
    /// </summary>
    @SerializedName("to")
    public List<Recipient> Recipients;

    /// <summary>
    ///     Optional: For each message you send, you can set a reference.
    ///     The given reference will be used in the status reports and MO replies for the message,
    ///     so you can link the messages to the sent batch.
    ///     For more information on status reports, see:
    ///     https://docs.cmtelecom.com/business-messaging/v1.0#/status_report_webhook
    ///     The given reference must be between 1 - 32 alphanumeric characters, and will not work using demo accounts.
    /// </summary>
    @SerializedName("reference")
    public String Reference;

    @SerializedName("richContent")
    public com.cmtelecom.text.sdk.models.multichannel.RichContent RichContent;
    
    /// <summary>
    ///     Optional: For each message you send, you can set a validity.
    ///     Specify a time at which a delayed message can be considered irrelevant, you can supply an absolute date & time 
    ///     or a relative offset. A message is considered failed if it was not successfully delivered before that time. 
    ///     And via a Status Report we inform you this was the case.
    ///     For more information on status reports, see:
    ///     https://docs.cmtelecom.com/business-messaging/v1.0#/status_report_webhook
    ///     You can supply the time zone for the validity period using either of the following formats:
    ///     
    ///     Absolute date and time:
    ///     
    ///     2017-04-20 11:50:05 GMT
    ///     2017-04-20 11:50:05+8
    ///     2017-04-20 11:55:05-07:00
    ///     If no time zone was specified, CE(S)T will be used. (CM local time)
    ///     
    ///     Relative offset in hour(H) or minute(M)
    ///     
    ///     2h
    ///     30m
    ///     You can set the validity in either hours or minutes. A combination of both is not supported.
    /// </summary>
    @SerializedName("validity")
    public String Validity;


    public Message(Body body, String from, List<Recipient> recipientList) {
        this.Body = body;
        this.From = from;
        this.Recipients = recipientList;
    }
}
