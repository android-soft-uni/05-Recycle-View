package com.softuni.recviewdemo.data;

import java.util.Arrays;
import java.util.List;

public class ZooDatabase {

    private static List<BaseModel> database;

    public static List<BaseModel> getDatabase() {
        if(database == null) {
            database = generateData();
        }
        return database;
    }

    private static List<BaseModel> generateData() {
        return Arrays.asList(
                new Accessory(
                        "Toothbrush",
                        "Super soft cat toothbrush.",
                        "https://i2.wp.com/best1x.com/wp-content/uploads/2017/05/Best-Cat-Toothbrush-Toothpaste.jpg?w=1000&ssl=1"),
                new Accessory("Shampoo",
                        "Best feather-fluffing shampoo for penguins.",
                        "http://78.media.tumblr.com/61a73343131b873f1e26734e3dafd2c6/tumblr_mo5jyk66ZW1qzya49o1_500.jpg"),
                new Accessory(
                        "Toothbrush",
                        "Super soft cat toothbrush.",
                        "https://i2.wp.com/best1x.com/wp-content/uploads/2017/05/Best-Cat-Toothbrush-Toothpaste.jpg?w=1000&ssl=1"),
                new Accessory("Shampoo",
                        "Best feather-fluffing shampoo for penguins.",
                        "http://78.media.tumblr.com/61a73343131b873f1e26734e3dafd2c6/tumblr_mo5jyk66ZW1qzya49o1_500.jpg"),
                new Promotion("https://www.w3schools.com/w3css/img_fjords.jpg"),
                new Accessory(
                        "Toothbrush",
                        "Super soft cat toothbrush.",
                        "https://i2.wp.com/best1x.com/wp-content/uploads/2017/05/Best-Cat-Toothbrush-Toothpaste.jpg?w=1000&ssl=1"),
                new Accessory("Shampoo",
                        "Best feather-fluffing shampoo for penguins.",
                        "http://78.media.tumblr.com/61a73343131b873f1e26734e3dafd2c6/tumblr_mo5jyk66ZW1qzya49o1_500.jpg"),
                new Accessory(
                        "Toothbrush",
                        "Super soft cat toothbrush.",
                        "https://i2.wp.com/best1x.com/wp-content/uploads/2017/05/Best-Cat-Toothbrush-Toothpaste.jpg?w=1000&ssl=1"),
                new Accessory("Shampoo",
                        "Best feather-fluffing shampoo for penguins.",
                        "http://78.media.tumblr.com/61a73343131b873f1e26734e3dafd2c6/tumblr_mo5jyk66ZW1qzya49o1_500.jpg"), new Accessory(
                        "Toothbrush",
                        "Super soft cat toothbrush.",
                        "https://i2.wp.com/best1x.com/wp-content/uploads/2017/05/Best-Cat-Toothbrush-Toothpaste.jpg?w=1000&ssl=1"),
                new Accessory("Shampoo",
                        "Best feather-fluffing shampoo for penguins.",
                        "http://78.media.tumblr.com/61a73343131b873f1e26734e3dafd2c6/tumblr_mo5jyk66ZW1qzya49o1_500.jpg")



        );
    }
}
