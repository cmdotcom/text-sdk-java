package com.cmtelecom.text.sdk.models.templates;

import com.google.gson.annotations.SerializedName;

public class TemplateLanguage {

    /// <summary>
    /// Source: https://developers.facebook.com/docs/whatsapp/api/messages/message-templates
    /// The code of the language or locale to use — Accepts both language and language_locale formats (e.g., en and en_US).
    /// </summary>
    @SerializedName("code")
    public String Code;

    /// <summary>
    /// Source: https://developers.facebook.com/docs/whatsapp/api/messages/message-templates
    /// Options: fallback, deterministic
    /// The language policy the message should follow
    /// </summary>
    @SerializedName("policy")
    public String Policy;

    /// <summary>
    ///  Default constructor
    /// </summary>
    public TemplateLanguage() {

    }

    /// <summary>
    ///     Constructor which sets values
    /// </summary>
    /// <param name="Code"></param>
    /// <param name="Poliy"></param>
    public TemplateLanguage(String code, String policy) {
        this.Code = code;
        this.Policy = policy;
    }
}
