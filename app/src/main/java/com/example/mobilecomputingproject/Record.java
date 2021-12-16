package com.example.mobilecomputingproject;

public class Record {
    private String length;
    private String weight;
    private String date;
    private String time;

    public Record(String length, String weight, String date, String time) {
        this.length = length;
        this.weight = weight;
        this.date = date;
        this.time = time;
    }

    public String getLength() {
        return length;
    }

    public String getWeight() {
        return weight;
    }


    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

}
