package com.example.mobilecomputingproject;

import java.util.UUID;

public class SingleUser {
    private UUID uuid;
    private String name;
    private String password;
    private String length;
    private String weight;
    private String date;
    private boolean isMale;

    public SingleUser() {
    }

    public SingleUser(String length, String weight, String date, boolean isMale) {
        this.length = length;
        this.weight = weight;
        this.date = date;
        this.isMale = isMale;
        this.uuid = UUID.randomUUID();
    }

    public String getUuid() {
        return uuid.toString();
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
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

    public boolean isMale() {
        return isMale;
    }


}
