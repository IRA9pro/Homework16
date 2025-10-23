package com.example.homework16;

public class ViewFoodPrice {
    public String name;
    public int price;
    public int image;

    public ViewFoodPrice(String name, int price, int image) {
        this.name = name;
        this.price = price;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getImageId() {
        return image;
    }
}
