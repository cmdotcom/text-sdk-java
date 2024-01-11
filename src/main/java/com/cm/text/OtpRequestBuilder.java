package com.cm.text;

import com.cm.text.models.identity.OtpRequest;

/**
 * Builder class to construct an OTP request
 */
public class OtpRequestBuilder {

    private final OtpRequest otpRequest;

    /**
     *
     * @param from The maximum length is 11 alphanumerical characters or 16 digits. Example: 'MyCompany'
     * @param to This value should be in international format. single mobile number per request. Example: '+316012345678'
     */
    public OtpRequestBuilder(String from, String to) {
        otpRequest = new OtpRequest();
        otpRequest.setFrom(from);
        otpRequest.setTo(to);
    }

    /**
     * @param channel The channel to send the code.
     * Supported values: auto, sms, push, whatsapp, voice, email.
     * Channel auto is only available with a SOLiD subscription.
     * @return This builder object for chaining
     */
    public OtpRequestBuilder withChannel(String channel) {
        otpRequest.setChannel(channel);
        return this;
    }

    /**
     *
     * @param digits The length of the code (min 4, max 10). default: 5.
     * @return This builder object for chaining
     */
    public OtpRequestBuilder withDigits(int digits) {
        otpRequest.setDigits(digits);
        return this;
    }


    /**
     * @param expiryInSeconds The expiry in seconds (min 10, max 3600). (default: 60 seconds.)
     * @return This builder object for chaining
     */
    public OtpRequestBuilder withExpiry(int expiryInSeconds) {
        otpRequest.setExpiry(expiryInSeconds);
        return this;
    }

    /**
     *
     * @param locale The locale, for WhatsApp supported values: en, nl, fr, de, it, es.
     *      * Default: en
     *      * For Voice: the spoken language in the voice call,
     *      * supported values: de-DE, en-AU, en-GB, en-IN, en-US, es-ES, fr-CA, fr-FR, it-IT, ja-JP, nl-NL
     *      * Default: en-GB.
     *      * For Email: The locale for the email template.
     * @return This builder object for chaining
     */
    public OtpRequestBuilder withLocale(String locale) {
        otpRequest.setLocale(locale);
        return this;
    }

    /**
     *
     * @param pushAppKey The app key, when Channel is 'push'
     * @return This builder object for chaining
     */
    public OtpRequestBuilder withPushAppKey(String pushAppKey) {
        otpRequest.setPushAppKey(pushAppKey);
        return this;
    }

    /**
     *  For WhatsApp/SMS, set a custom message. You can use the placeholder {code}, this will be replaced by the actual code.
     *      Example: Your code is: {code}. This is only used as a fallback in case the message could not be delivered via WhatsApp.
     *      For email, Set a custom message to be used in the email message. Do not include the {code} placeholder.
     * @param message the custom message
     * @return This builder object for chaining
     */
    public OtpRequestBuilder withMessage(String message) {
        otpRequest.setMessage(message);
        return this;
    }
}
