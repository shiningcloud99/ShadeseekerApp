package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ClipData;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.myapplication.Adapter.ItemAdapterJava;

import java.util.ArrayList;
import java.util.List;

public class MainActivity7 extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Item> itemArrayList;
    ItemAdapterJava itemAdapterJava;
    SearchView searchView;
    String[] itemHeading;
    int[] imageResourceId;
    Toolbar toolbar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        Toolbar toolbar =findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        searchView =findViewById(R.id.searchBrand);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                searchList (newText);
                return false;
            }
        });

        recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        itemArrayList = new ArrayList<Item>();


        itemHeading = new String[]{
                "HANASUI",
                "INSTAPERFECT",
                "luxcrime",
                "SKINTIFIC",
                "Somethinc",
                "Wardah",
                "Y.O.U",
                "Yves Saint Laurent",
                "3CE Stylenanda",

        };

        imageResourceId = new int[]{
                R.drawable.logohanasui,
                R.drawable.logoinstaperfect,
                R.drawable.logoluxcrime,
                R.drawable.logoskintific,
                R.drawable.logosomethinc,
                R.drawable.logowardah,
                R.drawable.logoyou,
                R.drawable.logoysl,
                R.drawable.logo3ce,

        };

        getData();

    }




    private void getData() {

        for (int i=0;i<itemHeading.length;i++){

            Item item = new Item(itemHeading[i],imageResourceId[i]);
            itemArrayList.add(item);
        }

        itemAdapterJava = new ItemAdapterJava(this, itemArrayList);
        recyclerView.setAdapter(itemAdapterJava);


        itemAdapterJava.notifyDataSetChanged();

    }

    private void searchList (String text) {
        List<Item> dataSearchList = new ArrayList<>();
        for (Item data : itemArrayList) {
            if (data.getHeading().toLowerCase().contains(text.toLowerCase())) {
                dataSearchList.add(data);
            }
        }
        if (dataSearchList.isEmpty()){
            Toast.makeText(this, "Not Found", Toast.LENGTH_SHORT).show();
        } else {
            itemAdapterJava.setSearchList(dataSearchList);
        }
    }
}
