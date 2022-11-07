package com.cm.text.models.multichannel;

import com.google.gson.annotations.SerializedName;

public class MediaMessage implements IRichMessage {
    /// <summary>
    ///     Default constructor.
    /// </summary>
    public MediaMessage()
    {
    }

    /// <summary>
    ///     Constructor setting values.
    /// </summary>
    /// <param name="mediaName"></param>
    /// <param name="mediaUri"></param>
    /// <param name="mimeType"></param>
    public MediaMessage(String mediaName, String mediaUri, String mimeType)
    {
        this.Media = new MediaContent(mediaName, mediaUri, mimeType);
    }

    /// <summary>
    ///     The image or video of the message.
    /// </summary>
    @SerializedName("media")
    public MediaContent Media;
}
