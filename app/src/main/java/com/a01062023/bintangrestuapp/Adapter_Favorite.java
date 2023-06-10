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

public class Adapter_Favorite extends RecyclerView.Adapter<Adapter_Favorite.MyViewHolder> {
    private final ArrayList<Favorite> dataFavorite;


    public Adapter_Favorite(ArrayList<Favorite> dataFavorite) {
        this.dataFavorite = dataFavorite;
    }

    @NonNull
    @Override
    public Adapter_Favorite.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_favorites_list, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter_Favorite.MyViewHolder holder, int position) {

        Favorite currentFavorite = dataFavorite.get(position);
        holder.name.setText(currentFavorite.getName());

        Glide.with(holder.itemView.getContext())
                .load(currentFavorite.getImg())
                .into(holder.img);

        Glide.with(holder.itemView.getContext())
                .load(currentFavorite.getImg_fav())
                .into(holder.img_fav);
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView name;
        private ImageView img;

        private ImageView img_fav;

        public MyViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.tvSong);
            img = itemView.findViewById(R.id.imgMusic);
            img_fav = itemView.findViewById(R.id.imgFavorite);
        }
    }

    @Override
    public int getItemCount() {
        return dataFavorite.size();
    }
}
