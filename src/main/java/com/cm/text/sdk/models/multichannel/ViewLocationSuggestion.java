package com.cm.text.sdk.models.multichannel;

import com.google.gson.annotations.SerializedName;

public class ViewLocationSuggestion extends Suggestion {


    /// <summary>
    ///     The location options
    /// </summary>
    @SerializedName("location")
    private ViewLocationOptions locationOptions;

    public ViewLocationSuggestion(ViewLocationOptions locationOptions) {
        this.Action = "CreateCalendarEvent";
        this.locationOptions = locationOptions;
    }
}
