package com.cmtelecom.text.sdk.models;

import com.google.gson.annotations.SerializedName;

public class Request {

    public static class Messages
    {
        @SerializedName("messages")
        private MessagesEnvelope messages;

        public MessagesEnvelope getMessages() {
            return messages;
        }

        public void setMessages(MessagesEnvelope messages) {
            this.messages = messages;
        }
    }

    public static class MessagesEnvelope
    {
        @SerializedName("authentication")
        private Authentication Authentication ;

        @SerializedName("msg")
        private Message[] Messages ;

        public Message[] getMessages() {
            return Messages;
        }

        public void setMessages(Message[] messages) {
            Messages = messages;
        }

        public Request.Authentication getAuthentication() {
            return Authentication;
        }

        public void setAuthentication(Request.Authentication authentication) {
            Authentication = authentication;
        }
    }

    public static class Authentication
    {
        @SerializedName("producttoken")
        private String ProductToken ;

        public String getProductToken() {
            return ProductToken;
        }

        public void setProductToken(String productToken) {
            ProductToken = productToken;
        }

        public Authentication(String productToken)
        {
            this.ProductToken = productToken;
        }
    }
}
