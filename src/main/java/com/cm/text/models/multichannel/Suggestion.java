package com.cm.text.models.multichannel;

import com.google.gson.annotations.SerializedName;

/**
 * A suggestion represents one option which the end user can use.
 */
public abstract class Suggestion {

    /**
     * The action of this suggestion
     */
    @SerializedName("action")
    protected String action;

    /**
     * The text the end user will see
     */
    @SerializedName("label")
    protected String label;


    /**
     *
     * @return The text the end user will see
     */
    public String getLabel() {
        return label;
    }

    /**
     *
     * @param label The text the end user will see
     */
    public void setLabel(String label) {
        this.label = label;
    }
}
