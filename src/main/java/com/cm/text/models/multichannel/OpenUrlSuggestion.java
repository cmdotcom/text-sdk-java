package com.cm.text.models.multichannel;

import com.google.gson.annotations.SerializedName;

public class OpenUrlSuggestion extends Suggestion {
    /// <summary>
    ///     The url of this suggestion
    /// </summary>
    @SerializedName("url")
    public String Url;


    public OpenUrlSuggestion( String label, String url)
    {
        this.Action = "openUrl";
        this.Label = label;
        this.Url = url;
    }

}
