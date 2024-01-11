package com.cm.text.models.templates;

import com.google.gson.annotations.SerializedName;

/**
 * Represents a localize-able parameter in a template
 */
public class LocalizableParam {

    /**
     * Source: <a href="https://developers.facebook.com/docs/whatsapp/api/messages/message-templates">Meta docs</a>
     * Default text if localization fails
     */
    @SerializedName("default")
    private String defaultLanguage;

    /**
     * If the currency object is used, it contains required parameters currency_code and amount_1000.
     * Source: <a href="https://developers.facebook.com/docs/whatsapp/api/messages/message-templates">Meta docs</a>
     */
    @SerializedName("currency")
    private TemplateCurrency currency;

    /**
     * If the date_time object is used, further definition of the date and time is required.
     * Source: <a href="https://developers.facebook.com/docs/whatsapp/api/messages/message-templates">Meta docs</a>
     */
    @SerializedName("date_time")
    private TemplateDateTime dateTime;

    public LocalizableParam() {
    }

    /**
     * Source: <a href="https://developers.facebook.com/docs/whatsapp/api/messages/message-templates">Meta developer docs</a>
     *
     * @return Default text if localization fails
     */
    public String getDefaultLanguage() {
        return defaultLanguage;
    }

    /**
     * @param defaultLanguage Default text if localization fails, see also <a href="https://developers.facebook.com/docs/whatsapp/api/messages/message-templates">Meta developer docs</a>
     */
    public void setDefaultLanguage(String defaultLanguage) {
        this.defaultLanguage = defaultLanguage;
    }

    /**
     * @return If the currency object is used, it contains required parameters currency_code and amount_1000.
     */
    public TemplateCurrency getCurrency() {
        return currency;
    }

    /**
     * @param currency If the currency object is used, it contains required parameters currency_code and amount_1000.
     */
    public void setCurrency(TemplateCurrency currency) {
        this.currency = currency;
    }

    /**
     * @return If the date_time object is used, further definition of the date and time is required.
     */
    public TemplateDateTime getDateTime() {
        return dateTime;
    }

    /**
     * @param dateTime If the date_time object is used, further definition of the date and time is required.
     */
    public void setDateTime(TemplateDateTime dateTime) {
        this.dateTime = dateTime;
    }
}
