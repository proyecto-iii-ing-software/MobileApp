package com.example.mobileapp.objects;

public class Product {

    private int id;
    private String business;
    private String location;
    private double rating;
    private int image;

    public Product(int id, String business, String location, double v, double rating, int image) {
        this.id = id;
        this.business = business;
        this.location = location;
        this.rating = rating;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getBusiness() {
        return business;
    }

    public String getLocation() {
        return location;
    }

    public double getRating() {
        return rating;
    }

    public int getImage() {
        return image;
    }
}

