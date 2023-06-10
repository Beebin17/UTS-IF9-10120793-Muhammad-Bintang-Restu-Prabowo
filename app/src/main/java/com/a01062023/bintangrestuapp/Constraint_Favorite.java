package com.a01062023.bintangrestuapp;
import java.util.ArrayList;

public class Constraint_Favorite {
    public static ArrayList<Favorite> getFavoriteData() {
        ArrayList<Favorite> favorite
                = new ArrayList<Favorite>();
        Favorite emp1 = new Favorite(R.drawable.baseline_queue_music_24,
                "Tiara Andini - Merasa Indah",R.drawable.img_favorite);
        favorite.add(emp1);
        Favorite emp2
                = new Favorite(R.drawable.baseline_queue_music_24, "Taylor Swift - Anti-Hero",R.drawable.img_favorite);
        favorite.add(emp2);
        Favorite emp3 = new Favorite(R.drawable.baseline_queue_music_24,
                "Lyodra - Pesan Terakhir",R.drawable.img_favorite);
        favorite.add(emp3);
        return favorite;
    }

}
