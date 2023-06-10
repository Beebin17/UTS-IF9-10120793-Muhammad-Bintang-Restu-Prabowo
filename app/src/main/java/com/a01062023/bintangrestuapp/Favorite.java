package com.a01062023.bintangrestuapp;

import java.io.Serializable;

public class Favorite implements Serializable{
    private final int img;
    private final String name;



    private final int img_fav;

    public Favorite(int img, String name, int img_fav) {
        this.img = img;
        this.name = name;
        this.img_fav = img_fav;
    }

    public String getName() {
        return name;
    }

    public int getImg() {
        return img;
    }

    public int getImg_fav() {
        return img_fav;
    }
}
