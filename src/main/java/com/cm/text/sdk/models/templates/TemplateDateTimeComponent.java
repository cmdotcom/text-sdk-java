package com.cm.text.sdk.models.templates;

import com.google.gson.annotations.SerializedName;

public class TemplateDateTimeComponent {
    /// <summary>
    /// The day of the week.
    /// </summary>
    /// <remarks>There will be no checking whether this is correct,</remarks>

    @SerializedName("day_of_week")
    public String DayOfWeek;

    /// <summary>
    /// The day of the month.
    /// </summary>
    @SerializedName("day_of_month")
    public int DayOfMonth;

    /// <summary>
    /// The year.
    /// </summary>
    @SerializedName("year")
    public int Year;

    /// <summary>
    /// The month.
    /// </summary>
    @SerializedName("month")
    public int Month;

    /// <summary>
    /// The hour (24 hour notation)
    /// </summary>
    @SerializedName("hour")
    public int Hour;

    /// <summary>
    /// The minute of the hour.
    /// </summary>
    @SerializedName("minute")
    public int Minute;
}
