package com.example.appslibrary;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.MyViewHolder> {

    private ArrayList<Item> items;

    public ItemAdapter(ArrayList<Item> items) {
        this.items = items;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView title;
        TextView desc1;
        TextView desc2;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            this.image = itemView.findViewById(R.id.item_image);
            this.title = itemView.findViewById(R.id.item_title);
            this.desc1 = itemView.findViewById(R.id.item_description1);
            this.desc2 = itemView.findViewById(R.id.item_description2);
        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View homeItem = layoutInflater.inflate(R.layout.list_item, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(homeItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.image.setImageDrawable(items.get(position).getImage());
        holder.title.setText(items.get(position).getTitle());
        holder.desc1.setText(items.get(position).getDescription1());
        holder.desc2.setText(items.get(position).getDescription2());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
