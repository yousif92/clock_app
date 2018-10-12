package com.example.org.customclockassignment.Model;

public class CustomTimeModel {

    private long timeElapsedInMillis = 0;


    private int currentDate;

    private int currentMonth;

    private int currentYear;


    public long getTimeElapsedInMillis() {
        return timeElapsedInMillis;
    }

    public void setTimeElapsedInMillis(long timeElapsedInMillis) {
        this.timeElapsedInMillis = timeElapsedInMillis;
    }

    public int getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(int currentDate) {
        this.currentDate = currentDate;
    }

    public int getCurrentMonth() {
        return currentMonth;
    }

    public void setCurrentMonth(int currentMonth) {
        this.currentMonth = currentMonth;
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public void setCurrentYear(int currentYear) {
        this.currentYear = currentYear;
    }
}
