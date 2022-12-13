package com.example.kappehub;

public class CafeModel {
    String cafeName;
    String timing;
    String rating;
    int image;
    String description;
    String location;



    public CafeModel(String cafeName, String timing, String rating, int image, String description, String location) {
        this.cafeName = cafeName;
        this.timing = timing;
        this.rating = rating;
        this.image = image;
        this.description = description;
        this.location = location;
    }

    public String getCafeName() {
        return cafeName;
    }

    public String getTiming() {
        return timing;
    }

    public String getRating() {
        return rating;
    }

    public int getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }

    public String getLocation() {
        return location;
    }
}
