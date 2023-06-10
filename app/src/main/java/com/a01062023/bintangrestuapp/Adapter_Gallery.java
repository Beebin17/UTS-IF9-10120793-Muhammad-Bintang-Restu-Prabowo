package com.a01062023.bintangrestuapp;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class Adapter_Gallery extends RecyclerView.Adapter<Adapter_Gallery.MyViewHolder> {
    private final ArrayList<Gallery> dataGallery;


    public Adapter_Gallery(ArrayList<Gallery> dataGallery) {
        this.dataGallery = dataGallery;
    }

    @NonNull
    @Override
    public Adapter_Gallery.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_gallery_list, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter_Gallery.MyViewHolder holder, int position) {

        Gallery currentGallery = dataGallery.get(position);

        Glide.with(holder.itemView.getContext())
                .load(currentGallery.getImg())
                .into(holder.img);
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView img;

        public MyViewHolder(View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.imgGallery);
        }
    }

    @Override
    public int getItemCount() {
        return dataGallery.size();
    }
}
