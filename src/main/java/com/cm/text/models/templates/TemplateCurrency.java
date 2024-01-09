package com.cm.text.models.templates;

import com.google.gson.annotations.SerializedName;

/**
 * Represents an amount in a specific currency
 */
public class TemplateCurrency {

    /**
     * Currency code, for example USD or EUR
     */
    @SerializedName("currency_code")
    private String currencyCode;

    /**
     * Amount in currency_code times 1000, Example: 50110 EUR becomes €50.11 in the message
     */
    @SerializedName("amount_1000")
    private Long amount;

    /**
     *
     * @return Currency code, for example USD or EUR
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     *
     * @param currencyCode Currency code, for example USD or EUR
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     *
     * @return Amount in currency_code times 1000, Example: 50110 EUR becomes €50.11 in the message
     */
    public Long getAmount() {
        return amount;
    }

    /**
     *
     * @param amount Amount in currency_code times 1000, Example: 50110 EUR becomes €50.11 in the message
     */
    public void setAmount(Long amount) {
        this.amount = amount;
    }
}
