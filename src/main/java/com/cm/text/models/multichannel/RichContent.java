package com.cm.text.models.multichannel;

import com.google.gson.annotations.SerializedName;

import java.util.Arrays;

public class RichContent {

    /**
     * The messages
     */
    @SerializedName("conversation")
    private IRichMessage[] conversation;

    /**
     * The suggestions
     */
    @SerializedName("suggestions")
    private Suggestion[] suggestions;

    /**
     * Initializes the rich content
     */
    public RichContent()
    {
        this.conversation = null;
        this.suggestions = null;
    }

    /**
     * Adds a message, such as a RichCard or TextMessage
     * @param part the message to add
     */
    public void AddConversationPart(IRichMessage part)
    {
        if (this.conversation == null)
            this.conversation = new IRichMessage[] {part};
        else
        {
            IRichMessage[] newArr = this.conversation;
            newArr = Arrays.copyOf(newArr, this.conversation.length + 1 );
            newArr[newArr.length - 1] = part;
            this.conversation = newArr;
        }
    }

    /**
     * Adds a suggestion
     * @param suggestion the suggestion to add
     */
    public void addSuggestion(Suggestion suggestion)
    {
        if (this.suggestions == null)
            this.suggestions = new Suggestion[] {suggestion};
        else
        {
            Suggestion[] newArr = this.suggestions;
            newArr = Arrays.copyOf(newArr, this.suggestions.length + 1 );
            newArr[newArr.length - 1] = suggestion;
            this.suggestions = newArr;
        }
    }

    /**
     * The messages
     * @return The messages
     */
    public IRichMessage[] getConversation() {
        return conversation;
    }

    /**
     * The suggestions
     * @return The suggestions
     */
    public Suggestion[] getSuggestions() {
        return suggestions;
    }

    /**
     *
     * @param suggestions The suggestions to use
     */
    public void setSuggestions(Suggestion[] suggestions) {
        this.suggestions = suggestions;
    }
}
