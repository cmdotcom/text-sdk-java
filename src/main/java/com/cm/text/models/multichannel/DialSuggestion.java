package com.cm.text.models.multichannel;

import com.google.gson.annotations.SerializedName;

/**
 * A suggestion, used in RCS When you want to enable the user can call you, or listen to a recorded spoken message,
 * this suggestion can be applied. When clicked starts a new call.
 */
public class DialSuggestion extends Suggestion {

    /**
     * The dial options
     */
    @SerializedName("dial")
    private Dial dial;

    /**
     *
     * @param dial The dial options to use
     */
    public DialSuggestion(Dial dial) {
        this.action = "reply";
       this.dial = dial;
    }

    /**
     *
     * @return The dial options
     */
    public Dial getDial() {
        return dial;
    }

    /**
     * @param dial The dial options
     */
    public void setDial(Dial dial) {
        this.dial = dial;
    }

}
