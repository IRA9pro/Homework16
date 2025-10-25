package com.example.homework16;

import android.media.Image;

public class ViewFood {
    public String name;
    public int image;

    public ViewFood(String name, int image) {
        this.name = name;
        this.image = image;
    }


    public String getFoodName() { return name; }

    public int getFoodImageId() { return image; }
}
