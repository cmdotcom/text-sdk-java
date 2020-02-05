package com.cmtelecom.text.sdk.models.templates;

import com.cmtelecom.text.sdk.models.templates.TemplateParameters;
import com.google.gson.annotations.SerializedName;


public class TemplateComponents {
    /// <summary>
    /// Source: https://developers.facebook.com/docs/whatsapp/api/messages/message-templates
    /// 
    /// Default text if localization fails
    /// </summary>
    @SerializedName("type")
    public String Type;
    /// <summary>
    /// Source: https://developers.facebook.com/docs/whatsapp/api/messages/message-templates
    /// This field is an array of values to apply to variables in the template
    /// </summary>
    @SerializedName("parameters")
    public TemplateParameters[] Parameters;
     
    /// <summary>
    ///  Default constructor
    /// </summary>
    public TemplateComponents()
    {
        
    }
    
    /// <summary>
    ///     Constructor which sets values
    /// </summary>
    /// <param name="Type"></param>
    /// <param name="Parameters"></param>
    public TemplateComponents(String type, TemplateParameters[] parameters)
    {
        this.Type = type;
        this.Parameters = parameters;
    }
  }

