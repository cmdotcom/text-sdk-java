package com.cm.text.models.templates;

public class TemplateDateTime {

    /**
     * The date component as described in Source: <a href="https://developers.facebook.com/docs/whatsapp/api/messages/message-templates">Meta developer docs</a>
     */
    private TemplateDateTimeComponent component;

    /**
     *
     * @return The date component
     */
    public TemplateDateTimeComponent getComponent() {
        return component;
    }

    /**
     *
     * @param component The date component
     */
    public void setComponent(TemplateDateTimeComponent component) {
        this.component = component;
    }
}
