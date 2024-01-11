package com.cm.text.models.identity;

import com.google.gson.annotations.SerializedName;

/**
 * Used to check whether the OTP code is valid
 */
public class OtpCheck {

    /**
     * id of the OTP to check
     */
    private transient final String id;
    /**
     * The code to check
     */
    @SerializedName("code")
    private final String code;

    /**
     * @param id id of the OTP to check
     * @param code The code to check
     */
    public OtpCheck(String id, String code) {
        this.id = id;
        this.code = code;
    }

    /**
     * @return id of the OTP to check
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @return The code to check
     */
    public String getCode() {
        return code;
    }
}
