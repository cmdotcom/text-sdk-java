package com.cmtelecom.text.sdk.models.templates;

import com.cmtelecom.text.sdk.models.multichannel.IRichMessage;
import com.google.gson.annotations.SerializedName;

public class TemplateMessage implements IRichMessage {
     /// <summary>
     /// The Content of the WhatsApp template message
        /// </summary>
        /// <remarks>Templates need to be configured by CM and approved by Whatsapp before it is possible
        /// to send these messages.
        /// </remarks>
    @SerializedName("template")
    public TemplateMessageContent Content;
    
     /// <summary>
    ///  Default constructor
    /// </summary>
    public TemplateMessage()
    {
    
    }
    
     /// <summary>
    ///  Constructor which sets values
    /// </summary>
    /// <param name="TemplateMessageContent"></param>
    public TemplateMessage(TemplateMessageContent content)
    {
        this.Content = content;
    }
}
