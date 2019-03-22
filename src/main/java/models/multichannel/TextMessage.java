package models.multichannel;

import com.google.gson.annotations.SerializedName;

public class TextMessage implements IRichMessage{
    /// <summary>
    ///     Construct an empty text message.
    /// </summary>
    public TextMessage()
    {
    }

    /// <summary>
    ///     Construct a text message and initialise the <see cref="Text" />
    /// </summary>
    /// <param name="text"></param>
    public TextMessage(String text)
    {
        this.Text = text;
    }

    /// <summary>
    ///     The text to display.
    /// </summary>
    @SerializedName("text")
    public String Text;
}
