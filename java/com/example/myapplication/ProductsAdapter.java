package com.example.myapplication.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.ItemModel;
import com.example.myapplication.R;

import java.util.ArrayList;

public class ProductsAdapter extends RecyclerView.Adapter<ProductsAdapter.ViewHolder> {

    ArrayList<ItemModel> dataItem;

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView textBrandName;
        TextView textProductName;
        TextView textShade;
        ImageView productImage;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textBrandName = itemView.findViewById(R.id.txt_brand);
            textProductName = itemView.findViewById(R.id.txtproduct_name);
            textShade = itemView.findViewById(R.id.txt_shade);
            productImage = itemView.findViewById(R.id.products);

        }

    }

    public ProductsAdapter(ArrayList<ItemModel> data) {
        this.dataItem = data;
    }

    @NonNull
    @Override
    public ProductsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_grid_layout,parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductsAdapter.ViewHolder holder, int position) {

        TextView txt_brand = holder.textBrandName;
        TextView txtproduct_name = holder.textProductName;
        TextView txt_shade = holder.textShade;
        ImageView products = holder.productImage;

        txt_brand.setText(dataItem.get(position).getBrandname());
        txtproduct_name.setText(dataItem.get(position).getProductname());
        txt_shade.setText(dataItem.get(position).getShade());
        products.setImageResource(dataItem.get(position).getProductimage());

    }

    @Override
    public int getItemCount() {
        return dataItem.size();
    }

}
