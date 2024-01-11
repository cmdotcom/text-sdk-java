package com.cm.text.models.multichannel;

import com.google.gson.annotations.SerializedName;

/**
 * Class describing a media message (such as an image or video)
 */
public class MediaMessage implements IRichMessage {
    /**
     * The image or video of the message.
     */
    @SerializedName("media")
    private MediaContent media;

    /**
     * Default constructor
     */
    public MediaMessage()
    {
    }

    /**
     * Constructor setting values.
     * @param mediaName The name of the image, audio or video.
     * @param mediaUri The location of the image, audio or video.
     * @param mimeType The mimetype of the image, audio or video.
     */
    public MediaMessage(String mediaName, String mediaUri, String mimeType)
    {
        this.media = new MediaContent(mediaName, mediaUri, mimeType);
    }

    /**
     *
     * @return The image or video of the message.
     */
    public MediaContent getMedia() {
        return media;
    }

    /**
     *
     * @param media The image or video of the message.
     */
    public void setMedia(MediaContent media) {
        this.media = media;
    }
}
