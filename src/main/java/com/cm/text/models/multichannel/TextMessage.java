package com.cm.text.models.multichannel;

import com.google.gson.annotations.SerializedName;

/**
 * A simple text message to send
 */
public class TextMessage implements IRichMessage{

    /**
     * The text to display.
     */
    @SerializedName("text")
    private String text;

    /**
     * Construct an empty text message.
     */
    public TextMessage()
    {
    }

    /**
     * Constructs the message with the text
     * @param text text for the end user
     */
    public TextMessage(String text)
    {
        this.text = text;
    }

    /**
     *
     * @return The text to display.
     */
    public String getText() {
        return text;
    }

    /**
     *
     * @param text The text to display.
     */
    public void setText(String text) {
        this.text = text;
    }
}
