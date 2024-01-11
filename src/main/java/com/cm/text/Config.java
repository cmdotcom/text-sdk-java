package com.cm.text;

public class Config {
    /**
     * Api url for the business messaging api
     */
    public static String BusinessMessagingApiUrl = "https://gw.messaging.cm.com/v1.0/message";

    /**
     * Url used to request a new OTP
     */
    public static String OtpRequestEndpoint = "https://api.cm.com/otp/v2/otp";
    /**
     * Url formatter used to get the link to verify OTP code
     */
    public static String OtpVerifyEndpointFormatter = "https://api.cm.com/otp/v2/otp/%s/verify";
}
