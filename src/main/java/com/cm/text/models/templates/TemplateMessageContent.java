package com.cm.text.models.templates;

import com.google.gson.annotations.SerializedName;

public class TemplateMessageContent {

    @SerializedName("whatsapp")
    private WhatsAppTemplate whatsAppTemplate;

    public TemplateMessageContent() {

    }

    public TemplateMessageContent(WhatsAppTemplate WhatsAppTemplate) {
        this.whatsAppTemplate = WhatsAppTemplate;
    }

    public WhatsAppTemplate getWhatsAppTemplate() {
        return whatsAppTemplate;
    }

    public void setWhatsAppTemplate(WhatsAppTemplate whatsAppTemplate) {
        this.whatsAppTemplate = whatsAppTemplate;
    }
}
