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

public class Adapter_DailyActivity extends RecyclerView.Adapter<Adapter_DailyActivity.MyViewHolder> {
    private final ArrayList<DailyActivityList> dataDailyActivityList;


    public Adapter_DailyActivity(ArrayList<DailyActivityList> dataDailyActivityList) {
        this.dataDailyActivityList = dataDailyActivityList;
    }

    @NonNull
    @Override
    public Adapter_DailyActivity.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_friends_list, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter_DailyActivity.MyViewHolder holder, int position) {

        DailyActivityList currentdataDailyActivityList = dataDailyActivityList.get(position);
        holder.name.setText(currentdataDailyActivityList.getName());

        Glide.with(holder.itemView.getContext())
                .load(currentdataDailyActivityList.getImg())
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
        return dataDailyActivityList.size();
    }
}
