package com.example.mvvm.model;

public class Product {

    private int imageResId;
    private String name;
    private String price;
    private String description;

    public Product(int imageResId, String name, String price) {
        this(imageResId, name, price, "");
    }

    public Product(int imageResId, String name, String price, String description) {
        this.imageResId = imageResId;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public int getImageResId() {
        return imageResId;
    }

    public void setImageResId(int imageResId) {
        this.imageResId = imageResId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
