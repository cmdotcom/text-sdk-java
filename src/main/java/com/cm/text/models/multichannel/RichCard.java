package com.cm.text.models.multichannel;

import com.google.gson.annotations.SerializedName;

public class RichCard extends TextMessage{
    /**
     * Optional: the header for a rich card
     */
    @SerializedName("header")
    private String header;

    /**
     * The image or video of the card.
     */
    @SerializedName("media")
    private MediaContent media;

    /**
     *
     * @return the header for a rich card
     */
    public String getHeader() {
        return header;
    }

    /**
     *
     * @param header the header for a rich card
     */
    public void setHeader(String header) {
        this.header = header;
    }

    /**
     *
     * @return The image or video of the card.
     */
    public MediaContent getMedia() {
        return media;
    }

    /**
     *
     * @param media The image or video of the card.
     */
    public void setMedia(MediaContent media) {
        this.media = media;
    }
}
