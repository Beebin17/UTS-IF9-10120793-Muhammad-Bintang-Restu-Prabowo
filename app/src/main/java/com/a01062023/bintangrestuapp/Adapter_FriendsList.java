package com.a01062023.bintangrestuapp;
import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
public class Adapter_FriendsList extends RecyclerView.Adapter<Adapter_FriendsList.MyViewHolder> {
    private final ArrayList<FriendsList> dataFriendsList;


    public Adapter_FriendsList(ArrayList<FriendsList> dataFriendsList) {
        this.dataFriendsList = dataFriendsList;
    }

    @NonNull
    @Override
    public Adapter_FriendsList.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_friends_list, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter_FriendsList.MyViewHolder holder, int position) {

        FriendsList currentFriendList = dataFriendsList.get(position);
        holder.name.setText(currentFriendList.getName());

        Glide.with(holder.itemView.getContext())
                .load(currentFriendList.getImg())
                .into(holder.img);
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView name;
        private ImageView img;

        public MyViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.tvNama);
            img = itemView.findViewById(R.id.imgFriend);
        }
    }

    @Override
    public int getItemCount() {
        return dataFriendsList.size();
    }
}
