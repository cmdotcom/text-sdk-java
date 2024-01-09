package com.cm.text.models.multichannel;

import com.google.gson.annotations.SerializedName;

/**
 * Displays a location
 */
public class ViewLocationOptions {
    /**
     * Optional: The label to display at the pin
     */
    @SerializedName("label")
    private String label;

    /**
     * The latitude in degrees
     */
    @SerializedName("latitude")
    private String latitude;

    /**
     * The longitude in degrees
     */
    @SerializedName("longitude")
    private String longitude;

    /**
     * Search for this location instead of using the latitude/longitude.
     */
    @SerializedName("searchQuery")
    private String searchQuery;

    /**
     *
     * @return The label to display at the pin
     */
    public String getLabel() {
        return label;
    }

    /**
     *
     * @param label Optional: The label to display at the pin
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     *
     * @return The latitude in degrees
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     *
     * @param latitude The latitude in degrees
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     *
     * @return The longitude in degrees
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     *
     * @param longitude The longitude in degrees
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /**
     *
     * @return Search for this location instead of using the latitude/longitude
     */
    public String getSearchQuery() {
        return searchQuery;
    }

    /**
     *
     * @param searchQuery Search for this location instead of using the latitude/longitude
     */
    public void setSearchQuery(String searchQuery) {
        this.searchQuery = searchQuery;
    }
}

