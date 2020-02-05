package com.cmtelecom.text.sdk.models.templates;

import com.google.gson.annotations.SerializedName;

public class TemplateComponents {

    /// <summary>
    /// Source: https://developers.facebook.com/docs/whatsapp/api/messages/message-templates
    /// 
    /// Required, describes the component type. Possible values: header, content, footer.
    /// </summary>
    @SerializedName("type")
    public String Type;
    /// <summary>
    /// Source: https://developers.facebook.com/docs/whatsapp/api/messages/message-templates
    /// Can be empty. Array containing the dynamic content of the message.
    /// </summary>
    @SerializedName("parameters")
    public TemplateParameters[] Parameters;

    /// <summary>
    ///  Default constructor
    /// </summary>
    public TemplateComponents() {

    }

    /// <summary>
    ///     Constructor which sets values
    /// </summary>
    /// <param name="Type"></param>
    /// <param name="Parameters"></param>
    public TemplateComponents(String type, TemplateParameters[] parameters) {
        this.Type = type;
        this.Parameters = parameters;
    }
}
