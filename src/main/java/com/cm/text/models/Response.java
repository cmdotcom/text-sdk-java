package com.cm.text.models;


import com.google.gson.annotations.SerializedName;

public class Response {

    public static class HttpResponseBody
    {
        @SerializedName("details")
        private String details;

        @SerializedName("errorCode")
        private int errorCode;

        @SerializedName("messages")
        private ResponseMessageDetail[] messages;

        public String getDetails() {
            return details;
        }

        public void setDetails(String details) {
            this.details = details;
        }

        public int getErrorCode() {
            return errorCode;
        }

        public void setErrorCode(int errorCode) {
            this.errorCode = errorCode;
        }

        public ResponseMessageDetail[] getMessages() {
            return messages;
        }

        public void setMessages(ResponseMessageDetail[] messages) {
            this.messages = messages;
        }
    }

    public static class ResponseMessageDetail
    {
        @SerializedName("messageDetails")
        private String messageDetails ;

        @SerializedName("messageErrorCode")
        private String messageErrorCode;

        @SerializedName("parts")
        private int parts;

        @SerializedName("reference")
        private String reference;

        @SerializedName("status")
        private String status;

        @SerializedName("to")
        private String to;

        public String getMessageDetails() {
            return messageDetails;
        }

        public void setMessageDetails(String messageDetails) {
            this.messageDetails = messageDetails;
        }

        public String getMessageErrorCode() {
            return messageErrorCode;
        }

        public void setMessageErrorCode(String messageErrorCode) {
            this.messageErrorCode = messageErrorCode;
        }

        public int getParts() {
            return parts;
        }

        public void setParts(int parts) {
            this.parts = parts;
        }

        public String getReference() {
            return reference;
        }

        public void setReference(String reference) {
            this.reference = reference;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getTo() {
            return to;
        }

        public void setTo(String to) {
            this.to = to;
        }
    }

}
