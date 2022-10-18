package com.cmtelecom.text.sdk.models.multichannel;

import com.google.gson.annotations.SerializedName;

import java.util.Arrays;

public class RichContent {
    /// <summary>
    ///     Initializes a rich content object
    /// </summary>
    public RichContent()
    {
        this.Conversation = null;
        this.Suggestions = null;
    }

    /// <summary>
    ///     The messages.
    /// </summary>
    @SerializedName("conversation")
    public IRichMessage[] Conversation ;

    /// <summary>
    ///     The suggestions
    /// </summary>
    @SerializedName("suggestions")
    public Suggestion[] Suggestions;

    /// <summary>
    ///     Adds a message, such as a <see cref="RichCard" /> or <see cref="TextMessage" />.
    /// </summary>
    /// <param name="part"></param>
    public void AddConversationPart(IRichMessage part)
    {
        if (this.Conversation == null)
            this.Conversation = new IRichMessage[] {part};
        else
        {
            IRichMessage[] newArr = this.Conversation;
            newArr = Arrays.copyOf(newArr, this.Conversation.length + 1 );
            newArr[newArr.length - 1] = part;
            this.Conversation = newArr;
        }
    }

    /// <summary>
    ///     Adds a suggestion
    /// </summary>
    /// <param name="suggestion"></param>
    public void AddSuggestion(Suggestion suggestion)
    {
        if (this.Suggestions == null)
            this.Suggestions = new Suggestion[] {suggestion};
        else
        {
            Suggestion[] newArr = this.Suggestions;
            newArr = Arrays.copyOf(newArr, this.Conversation.length + 1 );
            newArr[newArr.length - 1] = suggestion;
            this.Suggestions = newArr;
        }
    }
}
