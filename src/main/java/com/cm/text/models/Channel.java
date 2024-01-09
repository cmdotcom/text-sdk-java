package com.cm.text.models;

import com.google.gson.annotations.SerializedName;

/**
 * Represents a Channel to use when sending messages
 */
public enum Channel {

    /**
     * Messages will be sent as SMS text messages
     */
    SMS,

    /**
     * Send messages using WhatsApp for business.
     * Note that a WhatsApp profile at CM.com is required
     */
    WhatsApp,
    /**
     * Messages will be sent over RCS.
     * Note that CM.Com needs to configure this for you to work
     */
    RCS,

    /**
     * Messages will be sent over Viber.
     * Note that CM.Com needs to configure this for you to work.
     */
    Viber,

    /**
     * Messages will be sent using text to speech.
     * Note that CM.Com needs to configure this for you to work.
     */
    Voice,

    /**
     * Messages will be sent over Apple Messages for Business.
     * Note that CM.Com needs to configure this for you to work.
     */
    @SerializedName("Apple Messages for Business")
    AppleMessagesForBusiness,

    /// <summary>
    ///     Messages will be sent over Line.
    /// </summary>
    /// <remarks>
    ///     Note that CM.Com needs to configure this for you to work.
    /// </remarks>
    /**
     * Messages will be sent over Line.
     * Note that CM.Com needs to configure this for you to work.
     */
    Line,


    /**
     * Messages will be sent over Twitter.
     * Note that CM.Com needs to configure this for you to work.
     */
    Twitter,

    /// </remarks>
    /**
     * Messages will be sent over MobilePush.
     * This channel is the successor of the "Push" channel.
     */
    MobilePush,

    /**
     * Messages will be sent over Facebook Messenger.
     * Note that CM.Com needs to configure this for you to work.
     */
    @SerializedName("Facebook Messenger")
    FacebookMessenger,

    /**
     * Messages will be sent over Google Business Messages.
     * Note that CM.Com needs to configure this for you to work.
     */
    @SerializedName("Google Business Messages")
    GoogleBusinessMessages,

    /**
     * Messages will be sent over Instagram.
     * Note that CM.Com needs to configure this for you to work.
     */
    Instagram
}
