package com.cmtelecom.text.sdk.models;

public enum  Channel {
    /// <summary>
    ///     Messages will be sent as SMS text messages
    /// </summary>
    SMS,

    /// <summary>
    ///     Send messages using WhatsApp for business
    /// </summary>
    /// <remarks>
    ///     Note that CM needs to configure this for you to work.
    /// </remarks>
    WhatsApp,

    /// <summary>
    ///     Sends messages to push using Hybrid messages.
    ///     See also https://docs.cmtelecom.com/en/hybrid-messaging/v2.0.0
    /// </summary>
    /// <remarks>Works only when <see cref="Message.HybridAppKey" /> is set</remarks>
    Push,

    /// <summary>
    ///     Messages will be sent over RCS.
    /// </summary>
    /// <remarks>
    ///     Note that CM needs to configure this for you to work.
    /// </remarks>
    RCS,

    /// <summary>
    ///     Messages will be sent over Viber.
    /// </summary>
    /// <remarks>
    ///     Note that CM needs to configure this for you to work.
    /// </remarks>
    Viber,

    /// <summary>
    ///     Messages will be sent using text to speech.
    /// </summary>
    /// <remarks>
    ///     Note that CM needs to configure this for you to work.
    /// </remarks>
    Voice,

    /// <summary>
    ///     Messages will be sent over Apple Business Chat.
    /// </summary>
    /// <remarks>
    ///     Note that CM needs to configure this for you to work.
    /// </remarks>
    // ReSharper disable once InconsistentNaming
    iMessage,

    /// <summary>
    ///     Messages will be sent over Line.
    /// </summary>
    /// <remarks>
    ///     Note that CM needs to configure this for you to work.
    /// </remarks>
    Line,

    /// <summary>
    ///     Messages will be sent over Twitter.
    /// </summary>
    /// <remarks>
    ///     Note that CM needs to configure this for you to work.
    /// </remarks>
    Twitter,

    /// <summary>
    ///     Messages will be sent over MobilePush.
    /// </summary>
    /// <remarks>
    ///     This channel is the successor of the "Push" channel.
    ///     Contact CM for information on how to migrate your current Push integration
    /// </remarks>
    MobilePush,

    /// <summary>
    ///     Messages will be sent over Facebook Messenger.
    /// </summary>
    /// <remarks>
    ///     Note that CM needs to configure this for you to work.
    /// </remarks>
    @SerializedName("Facebook Messenger")
    FacebookMessenger,

    /// <summary>
    ///     Messages will be sent over Google Business Messages.
    /// </summary>
    /// <remarks>
    ///     Note that CM needs to configure this for you to work.
    /// </remarks>
    @SerializedName("Google Business Messages")
    GoogleBusinessMessages
}