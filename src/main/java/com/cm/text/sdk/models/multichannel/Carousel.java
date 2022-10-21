package com.cm.text.sdk.models.multichannel;

import com.google.gson.annotations.SerializedName;

public class Carousel {
    /// <summary>
    ///     The cards of the carousel
    /// </summary>
        @SerializedName("cards")
    public RichCard[] Cards;

    /// <summary>
    ///     The width for the items of the carousel
    /// </summary>
    @SerializedName("cardWidth")
    public CarouselCardWidth CarouselCardWidth;
}
