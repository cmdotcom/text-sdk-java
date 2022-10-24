package com.cm.text.models;

import com.google.gson.annotations.SerializedName;

public class Recipient {

    /// <summary>
    ///     This value should be in international format.
    ///     A single mobile number per request. Example: '00447911123456'
    /// </summary>
    @SerializedName("number")
    public String Number;
}

