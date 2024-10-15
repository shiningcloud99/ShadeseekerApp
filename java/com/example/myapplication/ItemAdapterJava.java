package com.example.myapplication.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.BrandsProduct;
import com.example.myapplication.Item;
import com.example.myapplication.R;
import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;
import java.util.List;

public class ItemAdapterJava extends RecyclerView.Adapter<ItemAdapterJava.MyViewHolder> {

    Context context;
    ArrayList<Item> itemArrayList;

    public void setSearchList (List<Item> dataSearchList) {
        this.itemArrayList = (ArrayList<Item>) dataSearchList;
        notifyDataSetChanged();
    }



    public ItemAdapterJava(Context context, ArrayList<Item> itemArrayList) {
        this.context = context;
        this.itemArrayList = itemArrayList;

    }

    @NonNull
    @Override
    public ItemAdapterJava.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.list_item_brand, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemAdapterJava.MyViewHolder holder, int position) {
        Item item = itemArrayList.get(position);
        holder.tvHeading.setText(item.heading);
        holder.titleImage.setImageResource(item.titleImage);

        holder.tvHeading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, BrandsProduct.class);

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return itemArrayList.size();
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvHeading;
        ShapeableImageView titleImage;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvHeading = itemView.findViewById(R.id.tvHeading);
            titleImage = itemView.findViewById(R.id.title_image);
        }
    }
}
