package com.cm.text.models.identity;

import com.google.gson.annotations.SerializedName;

import java.time.LocalDateTime;

public class OtpResponse {
    /**
     * The identifier of the OTP.
     */
    @SerializedName("id")
    private String id;
    /**
     * The channel used to send the code.
     */
    @SerializedName("channel")
    private String channel;

    /**
     * Indicates if the code was valid.
     */
    @SerializedName("verified")
    private boolean verified;

    /**
     * The date the OTP was created.
     */
    @SerializedName("createdAt")
    private LocalDateTime createdAt;

    /**
     * The date the OTP will expire.
     */
    @SerializedName("expiresAt")
    private LocalDateTime expiresAt;

    /**
     * @return The identifier of the OTP, should be used to verify.
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id The identifier of the OTP
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return The channel used to send the code.
     */
    public String getChannel() {
        return channel;
    }

    /**
     * @param channel The channel used to send the code.
     */
    public void setChannel(String channel) {
        this.channel = channel;
    }

    /**
     *
     * @return Indicates if the code was valid.
     */
    public boolean isVerified() {
        return verified;
    }

    /**
     *
     * @param verified Indicates if the code was valid.
     */
    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    /**
     * @return The date the OTP was created.
     */
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }


    /**
     * @param createdAt The date the OTP was created.
     */
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return The date the OTP will expire.
     */
    public LocalDateTime getExpiresAt() {
        return expiresAt;
    }

    /**
     * @param expiresAt The date the OTP will expire.
     */
    public void setExpiresAt(LocalDateTime expiresAt) {
        this.expiresAt = expiresAt;
    }
}
