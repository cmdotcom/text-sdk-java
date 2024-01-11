package com.cm.text.models.multichannel;

import com.google.gson.annotations.SerializedName;

public class Carousel {

    /**
     * The cards of the carousel
     */
    @SerializedName("cards")
    private RichCard[] cards;

    /**
     * The width for the items of the carousel
     */
    @SerializedName("cardWidth")
    private CarouselCardWidth carouselCardWidth;

    /**
     *
     * @return The cards of the carousel
     */
    public RichCard[] getCards() {
        return cards;
    }

    /**
     *
     * @param cards The cards of the carousel
     */
    public void setCards(RichCard[] cards) {
        this.cards = cards;
    }

    /**
     *
     * @return The width for the items of the carousel
     */
    public CarouselCardWidth getCarouselCardWidth() {
        return carouselCardWidth;
    }

    /**
     *
     * @param carouselCardWidth The width for the items of the carousel
     */
    public void setCarouselCardWidth(CarouselCardWidth carouselCardWidth) {
        this.carouselCardWidth = carouselCardWidth;
    }

}
