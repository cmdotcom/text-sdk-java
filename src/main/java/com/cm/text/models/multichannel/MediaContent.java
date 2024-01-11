package com.cm.text.models.multichannel;

/**
 * Content of one media item (such as an image or a video)
 */
public class MediaContent {

    /**
     * The name of the image, audio or video.
     */
    private String mediaName;

    /**
     * The location of the image, audio or video.
     */
    private String mediaUri;

    /**
     * The mimetype of the image, audio or video.
     */
    private String mimeType;

    /**
     * Default constructor
     */
    public MediaContent()
    {
    }



    /**
     * Constructor which initializes values
     * @param mediaName The name of the image, audio or video.
     * @param mediaUri The location of the image, audio or video.
     * @param mimeType The mimetype of the image, audio or video.
     */
    public MediaContent(String mediaName, String mediaUri, String mimeType)
    {
        this.mediaName = mediaName;
        this.mediaUri = mediaUri;
        this.mimeType = mimeType;
    }

    /**
     *
     * @return The name of the image, audio or video.
     */
    public String getMediaName() {
        return mediaName;
    }

    /**
     *
     * @param mediaName The name of the image, audio or video.
     */
    public void setMediaName(String mediaName) {
        this.mediaName = mediaName;
    }

    /**
     *
     * @return The location of the image, audio or video.
     */
    public String getMediaUri() {
        return mediaUri;
    }

    /**
     *
     * @param mediaUri The location of the image, audio or video.
     */
    public void setMediaUri(String mediaUri) {
        this.mediaUri = mediaUri;
    }

    /**
     *
     * @return The mimetype of the image, audio or video.
     */
    public String getMimeType() {
        return mimeType;
    }

    /**
     *
     * @param mimeType The mimetype of the image, audio or video.
     */
    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

}
