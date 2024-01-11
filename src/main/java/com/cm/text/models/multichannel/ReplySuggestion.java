package com.cm.text.models.multichannel;

import com.google.gson.annotations.SerializedName;

/**
 * Suggestion to reply with a certain text
 */
public class ReplySuggestion extends Suggestion {

    /**
     * When the item is selected and the postback data is set, then the Postback data will be sent in a MO instead of the label
     */
    @SerializedName("postbackData")
    private String postbackData;

    public ReplySuggestion(String postbackData) {
        this.action = "reply";
        this.postbackData = postbackData;
    }

    /**
     *
     * @return When the item is selected and the postback data is set, then the Postback data will be sent in a MO instead of the label
     */
    public String getPostbackData() {
        return postbackData;
    }

    /**
     *
     * @param postbackData When the item is selected and the postback data is set, then the Postback data will be sent in a MO instead of the label
     */
    public void setPostbackData(String postbackData) {
        this.postbackData = postbackData;
    }
}
