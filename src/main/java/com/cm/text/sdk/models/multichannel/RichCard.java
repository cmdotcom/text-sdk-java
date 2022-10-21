package com.cm.text.sdk.models.multichannel;

import com.google.gson.annotations.SerializedName;

public class RichCard extends TextMessage{
    // <summary>
    ///     Optional: the header for a rich card
    /// </summary>
    @SerializedName("header")
    public String Header;

    /// <summary>
    ///     The image or video of the card.
    /// </summary>
    @SerializedName("media")
    public MediaContent Media;
}
