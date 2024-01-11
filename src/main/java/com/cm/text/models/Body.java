package com.cm.text.models;

import com.google.gson.annotations.SerializedName;

/**
 * The body of the message
 */
public class Body {

    /***
     * The actual text body of the message.
     * By default, the CM gateway interprets messages as if sent with the standard 7 bit GSM encoding.
     * If you want to send messages using e.g. Arabic, Cyrillic of Greek characters
     * you will need to use the unicode UCS2 encoding.
     * Set the type to Auto to let the gateway do the encoding detection.
     * Please note that there are a few limitations to using unicode encoded messages:
     * Unicode messages can contain up to 70 characters. In the case of multipart messages, this becomes 66 characters per
     * part.
     * You will need to POST the XML or JSON file. A HTTP GET request cannot handle the Unicode characters
     * Another note is that not all operators in the world are able to handle Unicode messages, so you will need to test
     * for which operators it works.
     */
    @SerializedName("content")
    private String content;

    /**
    *     When the type is set to 'auto' then the gateway will do the encoding detection.
    *     In case it detects characters that are not part of the GSM character set,
    *     the message will be delivered as Unicode.
    *     If the message contains more than 70 characters in Unicode format it will be split into a
    *     multipart message.
    *     You can limit the number of parts by setting the maximum number of message parts.
    */
    @SerializedName("type")
    private String type;

    /**
     *
     * @param content The actual text body of the message.
     *      By default, the CM gateway interprets messages as if sent with the standard 7 bit GSM encoding.
     *      If you want to send messages using e.g. Arabic, Cyrillic of Greek characters
     *      you will need to use the unicode UCS2 encoding.
     *      Set the type to Auto to let the gateway do the encoding detection.
     *      Please note that there are a few limitations to using unicode encoded messages:
     *      Unicode messages can contain up to 70 characters. In the case of multipart messages, this becomes 66 characters per
     *      part.
     */
    public Body(String content) {
        this.content = content;
    }

    /**
     *
     * @param content The actual text body of the message.
     * By default, the CM gateway interprets messages as if sent with the standard 7 bit GSM encoding.
     * If you want to send messages using e.g. Arabic, Cyrillic of Greek characters
     * you will need to use the unicode UCS2 encoding.
     * Set the type to Auto to let the gateway do the encoding detection.
     * Please note that there are a few limitations to using unicode encoded messages:
     * Unicode messages can contain up to 70 characters. In the case of multipart messages, this becomes 66 characters per
     * part.
     * @param type When the type is set to 'auto' then the gateway will do the encoding detection.
     * In case it detects characters that are not part of the GSM character set,
     * the message will be delivered as Unicode.
     * If the message contains more than 70 characters in Unicode format it will be split into a
     * multipart message.
     * You can limit the number of parts by setting the maximum number of message parts.
     */
     public Body(String content, String type) {
        this.content = content;
        this.type = type;
    }

    /**
     *
     * @return The actual text body of the message.
     * By default, the CM gateway interprets messages as if sent with the standard 7 bit GSM encoding.
     * If you want to send messages using e.g. Arabic, Cyrillic of Greek characters
     * you will need to use the unicode UCS2 encoding.
     * Set the type to Auto to let the gateway do the encoding detection.
     * Please note that there are a few limitations to using unicode encoded messages:
     * Unicode messages can contain up to 70 characters. In the case of multipart messages, this becomes 66 characters per
     * part.
     */
    public String getContent() {
        return content;
    }

    /**
     *
     * @param content The actual text body of the message.
     * By default, the CM gateway interprets messages as if sent with the standard 7 bit GSM encoding.
     * If you want to send messages using e.g. Arabic, Cyrillic of Greek characters
     * you will need to use the unicode UCS2 encoding.
     * Set the type to Auto to let the gateway do the encoding detection.
     * Please note that there are a few limitations to using unicode encoded messages:
     * Unicode messages can contain up to 70 characters. In the case of multipart messages, this becomes 66 characters per
     * part.
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     *
     * @return When the type is set to 'auto' then the gateway will do the encoding detection.
     * In case it detects characters that are not part of the GSM character set,
     * the message will be delivered as Unicode.
     * If the message contains more than 70 characters in Unicode format it will be split into a
     * multipart message.
     * You can limit the number of parts by setting the maximum number of message parts.
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type When the type is set to 'auto' then the gateway will do the encoding detection.
     * In case it detects characters that are not part of the GSM character set,
     * the message will be delivered as Unicode.
     * If the message contains more than 70 characters in Unicode format it will be split into a
     * multipart message.
     * You can limit the number of parts by setting the maximum number of message parts.
     */
    public void setType(String type) {
        this.type = type;
    }
}
