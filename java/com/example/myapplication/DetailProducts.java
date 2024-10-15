package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import android.content.Intent;

public class DetailProducts extends AppCompatActivity {

    TextView detailBrand, detailProductName,detailShade, detailDesc;
    ImageView detailImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_products);



        detailBrand = findViewById(R.id.detailBrand);
        detailProductName = findViewById(R.id.detailProductName);
        detailShade = findViewById(R.id.detailShade);
        detailDesc = findViewById(R.id.detailDesc);
        detailImage = findViewById(R.id.detailImage);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            detailBrand.setText(bundle.getString("Brand"));
            detailImage.setImageResource(bundle.getInt("Image"));
            detailProductName.setText(bundle.getString("Product Name"));
            detailDesc.setText(bundle.getString("Desc"));
            detailShade.setText(bundle.getString("Shade"));
        }
    }
}
