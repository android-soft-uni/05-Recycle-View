package com.softuni.recviewdemo.data;

import com.softuni.recviewdemo.data.BaseModel;

public class Promotion extends BaseModel {

    private String imageUrl;

    public Promotion(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
