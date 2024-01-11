package com.cm.text.models.templates;

import com.google.gson.annotations.SerializedName;

public class WhatsAppTemplate {

    /**
     * The namespace that will be used
     *  Source <a href="https://developers.facebook.com/docs/whatsapp/api/messages/message-templates">Meta developer docs</a>
     */
    @SerializedName("namespace")
    private String namespace;

    /**
     * Source  <a href="https://developers.facebook.com/docs/whatsapp/api/messages/message-templates">Meta developer docs</a>
     */
    @SerializedName("element_name")
    private String name;

    @SerializedName("language")
    private TemplateLanguage language;

    /**
     * This field is an array of values to apply to variables in the template
     * Source  <a href="https://developers.facebook.com/docs/whatsapp/api/messages/message-templates">Meta developer docs</a>
     */
    @SerializedName("localizable_params")
    private LocalizableParam[] localizableParams;

    /**
     * This field is an array of values to apply to variables in the template
     * Source  <a href="https://developers.facebook.com/docs/whatsapp/api/messages/message-templates">Meta developer docs</a>
     */
    @SerializedName("components")
    private TemplateComponents[] components;

    public WhatsAppTemplate() {

    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TemplateLanguage getLanguage() {
        return language;
    }

    public void setLanguage(TemplateLanguage language) {
        this.language = language;
    }

    public LocalizableParam[] getLocalizableParams() {
        return localizableParams;
    }

    public void setLocalizableParams(LocalizableParam[] localizableParams) {
        this.localizableParams = localizableParams;
    }

    public TemplateComponents[] getComponents() {
        return components;
    }

    public void setComponents(TemplateComponents[] components) {
        this.components = components;
    }
}
