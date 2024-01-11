package com.cm.text.models.templates;

import com.google.gson.annotations.SerializedName;

public class TemplateDateTimeComponent {

    /**
     * The day of the week.
     */
    @SerializedName("day_of_week")
    private String dayOfWeek;

    @SerializedName("day_of_month")
    private int dayOfMonth;

    @SerializedName("year")
    private int year;


    @SerializedName("month")
    private int month;

    /**
     * The hour (24 hour notation)
     */
    @SerializedName("hour")
    private int hour;

        @SerializedName("minute")
    private int minute;


    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public int getDayOfMonth() {
        return dayOfMonth;
    }

    public void setDayOfMonth(int dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    /**
     *
     * @return The hour (24 hour notation)
     */
    public int getHour() {
        return hour;
    }

    /**
     *
     * @param hour The hour (24 hour notation)
     */
    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }
}
