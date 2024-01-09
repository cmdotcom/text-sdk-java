package com.cm.text.models.multichannel;

import com.google.gson.annotations.SerializedName;

public class Dial {
    /**
     * The number to call (in international format)
     */
    @SerializedName("phoneNumber")
    private String phoneNumber;

    /**
     *
     * @return The number to call (in international format)
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber The number to call (in international format)
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
