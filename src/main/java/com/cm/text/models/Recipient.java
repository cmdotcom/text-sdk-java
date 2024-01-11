package com.cm.text.models;

import com.google.gson.annotations.SerializedName;

/**
 * Class representing one end user
 */
public class Recipient {

    /**
     * This value should be in international format.
     * A single mobile number per request. Example: '00447911123456'
     */
    @SerializedName("number")
    private String number;

    /**
     *
     * @return End user number in international format. Example: '00447911123456'
     */
    public String getNumber() {
        return number;
    }

    /**
     *
     * @param number End user number in international format. Example: '00447911123456'
     */
    public void setNumber(String number) {
        this.number = number;
    }
}

