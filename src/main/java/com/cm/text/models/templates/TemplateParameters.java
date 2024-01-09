package com.cm.text.models.templates;

import com.cm.text.models.multichannel.MediaContent;
import com.google.gson.annotations.SerializedName;

public class TemplateParameters {
    /**
     * Describes the parameter type. Describes the parameter type. Possible values: text, currency, date_time, image, document.
     */
    @SerializedName("type")
    private String parameterType;
    @SerializedName("text")
    private String text;
    @SerializedName("media")
    private MediaContent media;

    public TemplateParameters() {
    }

     public TemplateParameters(String type, MediaContent mediaContent) {
        this.parameterType = type;
        this.media = mediaContent;
    }

    public TemplateParameters(String type, String text) {
        this.parameterType = type;
        this.text = text;
    }

    /**
     *
     * @return Describes the parameter type. Describes the parameter type. Possible values: text, currency, date_time, image, document.
     */
    public String getParameterType() {
        return parameterType;
    }

    /**
     * @param parameterType Describes the parameter type. Describes the parameter type. Possible values: text, currency, date_time, image, document.
     */
    public void setParameterType(String parameterType) {
        this.parameterType = parameterType;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
