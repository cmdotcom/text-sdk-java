package com.cm.text.models.identity;

import com.google.gson.annotations.SerializedName;

public class OtpRequest {

    /***
     * Required: This is the sender name.
     * The maximum length is 11 alphanumerical characters or 16 digits. Example: 'MyCompany'
     */
    @SerializedName("from")
    private String from;

    /***
     * Required: The destination mobile numbers.
     *         This value should be in international format.
     *         A single mobile number per request. Example: '+316012345678'
     */
    @SerializedName("to")
    private String to;

    /**
     * The length of the code (min 4, max 10). default: 5.
     */
    @SerializedName("digits")
    private Integer digits;

    /**
     * The expiry in seconds (min 10, max 3600). default: 60 seconds.
     */
    @SerializedName("expiry")
    private Integer expiry;

    /**
     * The channel to send the code.
     * Supported values: auto, sms, push, whatsapp, voice, email.
     * Channel auto is only available with a SOLiD subscription.
     */
    @SerializedName("channel")
    private String channel;

    /**
     * The locale, for WhatsApp supported values: en, nl, fr, de, it, es.
     * Default: en
     * For Voice: the spoken language in the voice call,
     * supported values: de-DE, en-AU, en-GB, en-IN, en-US, es-ES, fr-CA, fr-FR, it-IT, ja-JP, nl-NL
     * Default: en-GB.
     * For Email: The locale for the email template.
     */
    @SerializedName("locale")
    public String locale;

    /**
     * The app key, when Channel is 'push'
     */
    @SerializedName("pushAppKey")
    private String pushAppKey;

    /**
     * For WhatsApp, set a custom message. You can use the placeholder {code}, this will be replaced by the actual code.
     * Example: Your code is: {code}. This is only used as a fallback in case the message could not be delivered via WhatsApp.
     * For email, Set a custom message to be used in the email message. Do not include the {code} placeholder.
     */
    @SerializedName("message")
    private String message;

    public OtpRequest() {
        channel = "sms";
    }

    /**
     * @return This is the sender name.
     * The maximum length is 11 alphanumerical characters or 16 digits. Example: 'MyCompany'
     */
    public String getFrom() {
        return from;
    }

    /**
     * This is the sender name.
     * @param from The maximum length is 11 alphanumerical characters or 16 digits. Example: 'MyCompany'
     */
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     *
     * @return The destination mobile number.
     */
    public String getTo() {
        return to;
    }

    /**
     * Required: The destination mobile number.
     *  This value should be in international format. single mobile number per request. Example: '+316012345678'
     * @param to This value should be in international format. single mobile number per request. Example: '+316012345678'
     */
    public void setTo(String to) {
        this.to = to;
    }

    /**
     * @return The length of the code (min 4, max 10). default: 5.
     */
    public Integer getDigits() {
        return digits;
    }

    /**
     * @param digits The length of the code (min 4, max 10). default: 5.
     */
    public void setDigits(Integer digits) {
        this.digits = digits;
    }

    /**
     * @return The expiry in seconds (min 10, max 3600). default (when null): 60 seconds.
     */
    public Integer getExpiry() {
        return expiry;
    }

    /**
     * @param expiry The expiry in seconds (min 10, max 3600). (default: 60 seconds.)
     */
    public void setExpiry(Integer expiry) {
        this.expiry = expiry;
    }

    /**
     * The channel to send the code.
     * Supported values: auto, sms, push, whatsapp, voice, email.
     * Channel auto is only available with a SOLiD subscription.
      * @return The channel to send the code
     */
    public String getChannel() {
        return channel;
    }

    /**
     * @param channel The channel to send the code.
     * Supported values: auto, sms, push, whatsapp, voice, email.
     * Channel auto is only available with a SOLiD subscription.
     */
    public void setChannel(String channel) {
        this.channel = channel;
    }

    /**
     * The locale, for WhatsApp supported values: en, nl, fr, de, it, es.
     * Default: en
     * For Voice: the spoken language in the voice call,
     * supported values: de-DE, en-AU, en-GB, en-IN, en-US, es-ES, fr-CA, fr-FR, it-IT, ja-JP, nl-NL
     * Default: en-GB.
     * For Email: The locale for the email template.
     * @return the locale
     */
    public String getLocale() {
        return locale;
    }

    /**
     * @param locale The locale, for WhatsApp supported values: en, nl, fr, de, it, es.
     * Default: en
     * For Voice: the spoken language in the voice call,
     * supported values: de-DE, en-AU, en-GB, en-IN, en-US, es-ES, fr-CA, fr-FR, it-IT, ja-JP, nl-NL
     * Default: en-GB.
     * For Email: The locale for the email template.
     */
    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     * @return The app key, when Channel is 'push'
     */
    public String getPushAppKey() {
        return pushAppKey;
    }

    /**
     * @param pushAppKey The app key, when Channel is 'push'
     */
    public void setPushAppKey(String pushAppKey) {
        this.pushAppKey = pushAppKey;
    }

    /**
     * For WhatsApp/SMS, set a custom message. You can use the placeholder {code}, this will be replaced by the actual code.
     *      Example: Your code is: {code}. This is only used as a fallback in case the message could not be delivered via WhatsApp.
     *      For email, Set a custom message to be used in the email message. Do not include the {code} placeholder
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * For WhatsApp/SMS, set a custom message. You can use the placeholder {code}, this will be replaced by the actual code.
     * Example: Your code is: {code}. This is only used as a fallback in case the message could not be delivered via WhatsApp.
     * For email, Set a custom message to be used in the email message. Do not include the {code} placeholder.
     * @param message the custom message
     */
    public void setMessage(String message) {
        this.message = message;
    }


}
