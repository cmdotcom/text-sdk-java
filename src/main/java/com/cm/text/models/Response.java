package com.cm.text.models;



public class Response {

    public static class HttpResponseBody
    {
        
        public String details ;

        
        public int errorCode ;

        
        public ResponseMessageDetail[] messages ;
    }

    public class ResponseMessageDetail
    {
            
        public String messageDetails ;

            
        public String messageErrorCode;

            
        public int parts;

            
        public String reference;

            
        public String status;

            
        public String to;
    }

}
