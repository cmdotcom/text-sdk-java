package com.cm.text.models.multichannel;

import com.google.gson.annotations.SerializedName;

/**
 * Suggestion for opening an url
 */
public class OpenUrlSuggestion extends Suggestion {
    /**
     * The url of this suggestion
     */
    @SerializedName("url")
    private String url;


    /**
     * Constructor initializing this suggestion
     * @param label the label to show
     * @param url url to open
     */
    public OpenUrlSuggestion( String label, String url)
    {
        this.action = "openUrl";
        this.label = label;
        this.url = url;
    }

    /**
     *
     * @return The url of this suggestion
     */
    public String getUrl() {
        return url;
    }

    /**
     *
     * @param url The url of this suggestion
     */
    public void setUrl(String url) {
        this.url = url;
    }
}
