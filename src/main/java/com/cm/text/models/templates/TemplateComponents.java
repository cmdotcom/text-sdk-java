package com.cm.text.models.templates;

import com.google.gson.annotations.SerializedName;

public class TemplateComponents {

    /**
     * Required, describes the component type. Possible values: header, content, footer.
     * Source: <a href="https://developers.facebook.com/docs/whatsapp/api/messages/message-templates">Meta developer docs</a>
     */
    @SerializedName("type")
    private String componentType;
    /**
     * Array containing the dynamic content of the message (can be empty)
     * Source: <a href="https://developers.facebook.com/docs/whatsapp/api/messages/message-templates">Meta developer docs</a>
     */
    @SerializedName("parameters")
    public TemplateParameters[] templateParameters;

    public TemplateComponents() {

    }

    /**
     * @param type Required, describes the component type. Possible values: header, content, footer.
     * @param templateParameters Array containing the dynamic content of the message (can be empty)
     */
   public TemplateComponents(String type, TemplateParameters[] templateParameters) {
        this.componentType = type;
        this.templateParameters = templateParameters;
    }

    /**
     *
     * @return describes the component type. Possible values: header, content, footer.
     */
    public String getComponentType() {
        return componentType;
    }

    /**
     *
     * @param componentType describes the component type. Possible values: header, content, footer.
     */
    public void setComponentType(String componentType) {
        this.componentType = componentType;
    }

    /**
     *
     * @return Array containing the dynamic content of the message (can be empty)
     */
    public TemplateParameters[] getTemplateParameters() {
        return templateParameters;
    }

    /**
     *
     * @param templateParameters Array containing the dynamic content of the message (can be empty)
     */
    public void setTemplateParameters(TemplateParameters[] templateParameters) {
        this.templateParameters = templateParameters;
    }
}
