package models.multichannel;

import com.google.gson.annotations.SerializedName;

public class ReplySuggestion extends Suggestion {

    /// <summary>
    ///     When the item is selected and the postback data is set, then the Postback data will be
    ///     sent in a MO instead of the <see cref="Label" />.
    /// </summary>
    @SerializedName("postbackData")
    public String PostbackData;

    public ReplySuggestion(String postbackData) {
        this.Action = "reply";
        this.PostbackData = postbackData;
    }
}
