package com.example.mobileapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.example.mobileapp.objects.Product;
import com.example.mobileapp.objects.ProductAdapter;
import java.util.ArrayList;
import java.util.List;

public class HotelsActivity extends Menu {

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
                        "Double tree resort",
                        "3mi",
                        4.3,
                        R.drawable.doubletree));

        productList.add(
                new Product(
                        1,
                        "Camping Charrarra",
                        "3mi",
                        5,
                        R.drawable.campingcharrarra));

        productList.add(
                new Product(
                        1,
                        "Motel TT",
                        "3mi",
                        4.3,
                        R.drawable.motelcr));

        //creating recyclerview adapter
        ProductAdapter adapter = new ProductAdapter(this, productList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);

    }
}
