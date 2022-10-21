package com.cm.text.sdk.models.templates;

import com.google.gson.annotations.SerializedName;

public class WhatsAppTemplate {

    /// <summary>
    /// Source: https://developers.facebook.com/docs/whatsapp/api/messages/message-templates
    /// The namespace that will be used
    /// </summary>
    @SerializedName("namespace")
    public String Namespace;
    /// <summary>
    /// Source: https://developers.facebook.com/docs/whatsapp/api/messages/message-templates
    /// The element name that indicates which template to use within the namespace
    /// </summary>
    @SerializedName("element_name")
    public String Name;
    /// <summary>
    /// Source: https://developers.facebook.com/docs/whatsapp/api/messages/message-templates
    /// Allows for the specification of a deterministic or fallback language.
    /// 
    /// The language parameter sets the language policy for an Message Template;
    /// you can set it to either fallback or deterministic.
    /// </summary>
    @SerializedName("language")
    public TemplateLanguage Language;
    /// <summary>
    /// Source: https://developers.facebook.com/docs/whatsapp/api/messages/message-templates
    /// This field is an array of values to apply to variables in the template
    /// </summary>
    @SerializedName("localizable_params")
    public LocalizableParam[] LocalizableParams;

    /// <summary>
    /// Source: https://developers.facebook.com/docs/whatsapp/api/messages/message-templates
    /// This field is an array of values to apply to variables in the template
    /// </summary>
    @SerializedName("components")
    public TemplateComponents[] Components;

    /// <summary>
    ///  Default constructor
    /// </summary>
    public WhatsAppTemplate() {

    }
}
