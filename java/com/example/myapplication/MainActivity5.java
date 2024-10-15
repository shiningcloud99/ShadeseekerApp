package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main5);

        Button searchshadeButton = findViewById(R.id.searchshadeButton);
        searchshadeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToBrandsProduct();
            }
        });

        // Mendapatkan referensi ke Spinner di layout
        Spinner spinner1 = findViewById(R.id.spinner1);
        Spinner spinner2 = findViewById(R.id.spinner2); // Menambahkan referensi untuk spinner kedua

        // Membuat list item untuk spinner pertama
        List<String> items1 = new ArrayList<>();
        items1.add("Warm");
        items1.add("Neutral");
        items1.add("Cold");

        // Membuat adapter untuk spinner pertama
        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, items1);

        // Menentukan layout dropdown saat dipilih (opsional)
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Mengatur adapter ke Spinner pertama
        spinner1.setAdapter(adapter1);

        // Menambahkan listener untuk menangani peristiwa saat item dipilih pada spinner pertama
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                // Aksi yang ingin Anda lakukan ketika item dipilih pada spinner pertama
                String selectedItem = (String) parentView.getItemAtPosition(position);
                Toast.makeText(MainActivity5.this, "You choose: " + selectedItem, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // Aksi yang ingin Anda lakukan saat tidak ada item yang dipilih pada spinner pertama
            }
        });

        // Membuat list item untuk spinner kedua (angka romawi 1-6)
        List<String> items2 = new ArrayList<>();
        items2.add("I");
        items2.add("II");
        items2.add("III");
        items2.add("IV");
        items2.add("V");
        items2.add("VI");

        // Membuat adapter untuk spinner kedua
        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, items2);

        // Menentukan layout dropdown saat dipilih (opsional)
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Mengatur adapter ke Spinner kedua
        spinner2.setAdapter(adapter2);

        // Menambahkan listener untuk menangani peristiwa saat item dipilih pada spinner kedua
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                // Aksi yang ingin Anda lakukan ketika item dipilih pada spinner kedua
                String selectedItem = (String) parentView.getItemAtPosition(position);
                Toast.makeText(MainActivity5.this, "You choose: " + selectedItem, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // Aksi yang ingin Anda lakukan saat tidak ada item yang dipilih pada spinner kedua
            }
        });
    }
    private void goToBrandsProduct() {
        Intent intent = new Intent(MainActivity5.this, BrandsProduct.class);
        startActivity(intent);
    }
}
