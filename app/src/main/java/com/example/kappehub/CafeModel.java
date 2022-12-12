package com.example.kappehub;

public class CafeModel {
    String cafeName;
    String timing;
    String rating;
    int image;

    public CafeModel(String cafeName, String timing, String rating, int image) {
        this.cafeName = cafeName;
        this.timing = timing;
        this.rating = rating;
        this.image = image;
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
}
