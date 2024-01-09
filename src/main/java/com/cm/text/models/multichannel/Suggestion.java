package com.cm.text.models.multichannel;

import com.google.gson.annotations.SerializedName;


public abstract class Suggestion {
    /// <summary>
    ///     The action of this suggestion
    /// </summary>
    @SerializedName("action")
    protected String action;

    /// <summary>
    ///     The text the end user will see
    /// </summary>
    @SerializedName("label")
    public String Label;
}
