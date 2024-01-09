package com.cm.text.models.multichannel;

import com.google.gson.annotations.SerializedName;

/**
 * Suggestion to open a map with a specific location
 */
public class ViewLocationSuggestion extends Suggestion {

    /**
     * The location options
     */
    @SerializedName("location")
    private ViewLocationOptions locationOptions;

    /**
     * Constructor setting the location
     * @param locationOptions the location to display
     */
    public ViewLocationSuggestion(ViewLocationOptions locationOptions) {
        this.action = "viewLocation";
        this.locationOptions = locationOptions;
    }

    /**
     *
     * @return The location options
     */
    public ViewLocationOptions getLocationOptions() {
        return locationOptions;
    }

    /**
     *
     * @param locationOptions The location options
     */
    public void setLocationOptions(ViewLocationOptions locationOptions) {
        this.locationOptions = locationOptions;
    }
}
