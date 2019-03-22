package models.multichannel;

import com.google.gson.annotations.SerializedName;

/// <summary>
///     A suggestion, used in <see cref="Channel.RCS" />
///     When you want to enable the user can call you, or listen to a recorded spoken message,
///     this suggestion can be applied. When clicked starts a new call.
/// </summary>
public class DialSuggestion extends Suggestion {

    /// <summary>
    ///     The dial options
    /// </summary>
    @SerializedName("dial")
    public Dial Dial;

    public DialSuggestion(Dial dial) {
        this.Action = "reply";
       this.Dial = dial;
    }
}
