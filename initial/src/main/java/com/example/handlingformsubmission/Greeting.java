package com.example.handlingformsubmission;

public class Greeting {
    //Attributes
    private long id; //student id
    private int month; //month
    private int day; //day
    private int year; //year
    private String content; //custom message

    //Setters & Getters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getMonth() { return month; }

    public void setMonth(int month) { this.month = month; }

    public int getDay() { return day; }

    public void setDay(int day) { this.day = day; }

    public int getYear() { return year; }

    public void setYear(int year) { this.year = year; }

}