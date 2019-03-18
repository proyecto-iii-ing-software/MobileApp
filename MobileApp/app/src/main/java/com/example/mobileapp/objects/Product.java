package com.example.mobileapp.objects;

public class Product {

    private int id;
    private String site;
    private String distance;
    private double rating;
    private int image;

    public Product(int id, String business, String location, double v, double rating, int image) {
        this.id = id;
        this.site = business;
        this.distance = location;
        this.rating = rating;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getBusiness() {
        return site;
    }

    public String getLocation() {
        return distance;
    }

    public double getRating() {
        return rating;
    }

    public int getImage() {
        return image;
    }
}

