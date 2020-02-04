/*
 * The MIT License
 *
 * Copyright 2020 soufyan.bargach.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.cmtelecom.text.sdk.models.templates;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author soufyan.bargach
 */
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
     public WhatsAppTemplate() 
     {
        
     }  
}
