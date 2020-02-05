package com.cmtelecom.text.sdk.models.templates;

import com.google.gson.annotations.SerializedName;

public class TemplateMessageContent {

    /// <summary>
    /// The WhatsApp template message
    /// </summary>
    /// <remarks>Templates need to be configured by CM and approved by Whatsapp before it is possible
    /// to send these messages.
    /// </remarks>
    @SerializedName("whatsapp")
    public WhatsAppTemplate WhatsAppTemplate;

    /// <summary>
    ///  Default constructor
    /// </summary>
    public TemplateMessageContent() {

    }

    /// <summary>
    ///  Constructor which sets values
    /// </summary>
    /// <param name="WhatsAppTemplate"></param>
    public TemplateMessageContent(WhatsAppTemplate WhatsAppTemplate) {
        this.WhatsAppTemplate = WhatsAppTemplate;
    }
}
