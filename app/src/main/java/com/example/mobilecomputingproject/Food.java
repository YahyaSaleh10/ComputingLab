package com.example.mobilecomputingproject;

public class Food {
    private String name;
    private String calory;
    private String category;
    private String photo;

    public Food(String name, String calory, String category, String photo) {
        this.name = name;
        this.calory = calory;
        this.category = category;
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public String getCalory() {
        return calory;
    }

    public String getCategory() {
        return category;
    }

    public String getPhoto() {
        return photo;
    }
}
