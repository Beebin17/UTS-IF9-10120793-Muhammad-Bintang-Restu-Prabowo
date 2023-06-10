package com.a01062023.bintangrestuapp;
import java.util.ArrayList;

public class Constraint_Gallery {
    public static ArrayList<Gallery> getGalleryData() {
        ArrayList<Gallery> gallery
                = new ArrayList<Gallery>();
        Gallery img1 = new Gallery(R.drawable.self);
        gallery.add(img1);
        Gallery img2 = new Gallery(R.drawable.self2);
        gallery.add(img2);
        Gallery img3 = new Gallery(R.drawable.basket2);
        gallery.add(img3);
        Gallery img4 = new Gallery(R.drawable.basket3);
        gallery.add(img4);
        Gallery img5 = new Gallery(R.drawable.basket5);
        gallery.add(img5);
        Gallery img6 = new Gallery(R.drawable.basket6);
        gallery.add(img6);


        return gallery;
    }

}
