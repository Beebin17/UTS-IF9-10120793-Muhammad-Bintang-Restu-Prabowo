package com.a01062023.bintangrestuapp;

import java.io.Serializable;

public class DailyActivityList implements Serializable{
    private final int img;
    private final String name;

    public DailyActivityList(int img, String name) {
        this.img = img;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getImg() {
        return img;
    }
}
