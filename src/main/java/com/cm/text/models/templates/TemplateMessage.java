package com.cm.text.models.templates;

import com.cm.text.models.multichannel.IRichMessage;
import com.google.gson.annotations.SerializedName;

public class TemplateMessage implements IRichMessage {
    /**
     * The Content of the WhatsApp template message.
     */
    @SerializedName("template")
    private TemplateMessageContent content;

    public TemplateMessage() {

    }

    /**
     *
     * @param content The Content of the WhatsApp template message.
     */
    public TemplateMessage(TemplateMessageContent content) {
        this.content = content;
    }

    /**
     *
     * @return The Content of the WhatsApp template message.
     */
    public TemplateMessageContent getContent() {
        return content;
    }

    /**
     * @param content The Content of the WhatsApp template message.
     */
    public void setContent(TemplateMessageContent content) {
        this.content = content;
    }
}
