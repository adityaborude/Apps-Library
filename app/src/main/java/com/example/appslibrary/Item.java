package com.example.appslibrary;

import android.graphics.drawable.Drawable;

public class Item {

    Drawable image;
    String title;
    String description1;
    String description2;

    public Item(Drawable image, String title, String description1, String description2) {
        this.image = image;
        this.title = title;
        this.description1 = description1;
        this.description2 = description2;
    }

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription1() {
        return description1;
    }

    public void setDescription1(String description1) {
        this.description1 = description1;
    }

    public String getDescription2() {
        return description2;
    }

    public void setDescription2(String description2) {
        this.description2 = description2;
    }
}
