package com.cm.text.models.multichannel;

import com.google.gson.annotations.SerializedName;

public class ViewLocationOptions {
    /// <summary>
    ///     Optional: The label to display at the pin
    /// </summary>
    @SerializedName("label")
    public String Label;

    /// <summary>
    ///     The latitude in degrees
    /// </summary>
    /// <example>51.603802</example>
    /// <remarks>Either Latitude and <see cref="Longitude" /> or <see cref="SearchQuery" /> is required </remarks>
    @SerializedName("latitude")
    public String Latitude;

    /// <summary>
    ///     The longitude in degrees
    /// </summary>
    /// <example>4.770821</example>
    /// <remarks>Either <see cref="Latitude" /> and Longitude or <see cref="SearchQuery" /> is required </remarks>
    @SerializedName("longitude")
    public String Longitude;

    /// <summary>
    ///     Search for this location instead of using the latitude/longitude.
    /// </summary>
    /// <remarks>Either <see cref="Latitude" /> and <see cref="Longitude" /> or SearchQuery is required </remarks>
    @SerializedName("searchQuery")
    public String SearchQuery;
}

