package com.cm.text.models.templates;

import com.google.gson.annotations.SerializedName;

public class TemplateLanguage {

    /**
     * The code of the language or locale to use — Accepts both language and language_locale formats (e.g., en and en_US).
     *  <a href="https://developers.facebook.com/docs/whatsapp/api/messages/message-templates">Meta developer docs</a>
     */
    @SerializedName("code")
    private String code;


    /**
     *
     * The language policy the message should follow Options: fallback, deterministic
     *  <a href="https://developers.facebook.com/docs/whatsapp/api/messages/message-templates">Meta developer docs</a>
     */
    @SerializedName("policy")
    private String policy;

    public TemplateLanguage() {

    }

    /**
     *
     * @param code The code of the language or locale to use — Accepts both language and language_locale formats (e.g., en and en_US).
     * @param policy The language policy the message should follow Options: fallback, deterministic
     */
    public TemplateLanguage(String code, String policy) {
        this.code = code;
        this.policy = policy;
    }

    /**
     *
     * @return The code of the language or locale to use — Accepts both language and language_locale formats (e.g., en and en_US).
     */
    public String getCode() {
        return code;
    }

    /**
     *
     * @param code The code of the language or locale to use — Accepts both language and language_locale formats (e.g., en and en_US).
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     *
     * @return The language policy the message should follow Options: fallback, deterministic
     */
    public String getPolicy() {
        return policy;
    }

    /**
     *
     * @param policy The language policy the message should follow Options: fallback, deterministic
     */
    public void setPolicy(String policy) {
        this.policy = policy;
    }
}
