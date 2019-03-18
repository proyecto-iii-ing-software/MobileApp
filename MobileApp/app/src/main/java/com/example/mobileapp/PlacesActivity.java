package com.example.mobileapp;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.mobileapp.objects.Product;
import com.example.mobileapp.objects.ProductAdapter;

import java.util.ArrayList;
import java.util.List;

public class PlacesActivity extends Menu {



    //a list to store all the products
    List<Product> productList;

    //the recyclerview
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);

        //getting the recyclerview from xml
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //initializing the productlist
        productList = new ArrayList<>();


        //adding some items to our list
        productList.add(
                new Product(
                        1,
                        "Rafting BBB",
                        "2mi",
                        4.5,
                        R.drawable.rafting));

        productList.add(
                new Product(
                        2,
                        "Arenal Tour",
                        "2mi",
                        4.3,
                        R.drawable.arenal_tour));

        productList.add(
                new Product(
                        3,
                        "Surf Jaco",
                        "2.2 mi",
                        5,
                        R.drawable.suf_jaco));

        //creating recyclerview adapter
        ProductAdapter adapter = new ProductAdapter(this, productList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);

    }


}
