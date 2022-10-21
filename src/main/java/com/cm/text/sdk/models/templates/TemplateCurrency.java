package com.cm.text.sdk.models.templates;

import com.google.gson.annotations.SerializedName;

public class TemplateCurrency {

    /// <summary>
    /// Currency code, for example USD or EUR
    /// </summary>
    @SerializedName("currency_code")
    public String CurrencyCode;
    /// <summary>
    /// Amount in currency_code times 1000
    /// </summary>
    /// <example>50110 EUR becomes €50.11 in the message</example>
    @SerializedName("amount_1000")
    public Long Amount;
}
