package com.example.homework16;

import android.media.Image;

public class ViewFood {
    public String Name;
    public int Image;

    public ViewFood(String Name, int image) {
        this.Name = Name;
        Image = image;
    }


    public String getFoodName() { return Name; }

    public int getFoodImageId() { return Image; }
}
