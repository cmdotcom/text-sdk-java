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
