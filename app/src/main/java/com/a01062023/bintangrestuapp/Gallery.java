package com.a01062023.bintangrestuapp;

import java.io.Serializable;

public class Gallery implements Serializable{
    private final int img;

    public Gallery(int img) {
        this.img = img;

    }



    public int getImg() {
        return img;
    }
}
