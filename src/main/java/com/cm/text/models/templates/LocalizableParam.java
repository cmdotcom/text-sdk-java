package com.cm.text.models.templates;

import com.google.gson.annotations.SerializedName;

public class LocalizableParam {
    /// <summary>
        /// Source: https://developers.facebook.com/docs/whatsapp/api/messages/message-templates
        /// 
        /// Default text if localization fails
        /// </summary>
        @SerializedName("default")
        public String Default;

        /// <summary>
        /// Source: https://developers.facebook.com/docs/whatsapp/api/messages/message-templates
        /// 
        /// If the currency object is used, it contains required parameters currency_code and amount_1000.
        /// </summary>
        @SerializedName("currency")
        public TemplateCurrency Currency;

        /// <summary>
        /// Source: https://developers.facebook.com/docs/whatsapp/api/messages/message-templates
        /// 
        /// If the date_time object is used, further definition of the date and time is required. 
        /// </summary>
         @SerializedName("date_time")
        public TemplateDateTime DateTime;
         
         /// <summary>
         ///  Default constructor
         /// </summary>
         public LocalizableParam()
         {
         
         }
}
