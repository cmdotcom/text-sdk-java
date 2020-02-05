package com.cmtelecom.text.sdk.models.templates;

import com.cmtelecom.text.sdk.models.multichannel.MediaContent;
import com.google.gson.annotations.SerializedName;


public class TemplateParameters {
    @SerializedName("type")
    public String Type;
    @SerializedName("text")
    public String Text;
    @SerializedName("media")
    public MediaContent Media;
    
    /// <summary>
    ///  Default constructor
    /// </summary>
    public TemplateParameters()
    {
        
    }
    
    /// <summary>
    ///  Constructor which sets values for rich media template
    /// </summary>
    /// <param name="Type"></param>
    /// <param name="Text"></param>
    /// <param name="MediaContent"></param>
    public TemplateParameters(String type, MediaContent mediaContent)
    {
        this.Type = type;
        this.Media = mediaContent;
    }
    
    /// <summary>
    ///  Constructor which sets values for a text template
    /// </summary>
    /// <param name="Type"></param>
    /// <param name="Text"></param>
    /// <param name="MediaContent"></param>
    public TemplateParameters(String type, String text)
    {
        this.Type = type;
        this.Text = text;
    }
}
