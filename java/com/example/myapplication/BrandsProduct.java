package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myapplication.Adapter.ProductsAdapter;

import java.util.ArrayList;

public class BrandsProduct extends AppCompatActivity {
    RecyclerView recyclerView;
    ProductsAdapter productsAdapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<ItemModel> data;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brands_product);

        recyclerView = findViewById(R.id.products_recycler);
        recyclerView.setHasFixedSize(true);

        layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);

        data = new ArrayList<>();
        for (int i = 0; i <BrandProductItem.brandname.length; i++) {
            data.add(new ItemModel(
                    BrandProductItem.brandname[i],
                    BrandProductItem.productname[i],
                    BrandProductItem.shade[i],
                    BrandProductItem.productsimage[i]
            ));


        }

        productsAdapter = new ProductsAdapter(data);
        recyclerView.setAdapter(productsAdapter);

    }


}
