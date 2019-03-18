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

import java.util.ArrayList;
import java.util.List;

public class RestaurantsActivity extends Activity {

    //a list to store all the products
    List<Product> productList;

    //the recyclerview
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

        //Redirect to hotels category
        TextView toHotels = (TextView) findViewById(R.id.linkHotels);
        toHotels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RestaurantsActivity.this, HotelsActivity.class);
                startActivity(intent);
            }
        });

        //Redirect to places category
        TextView toPlaces = (TextView) findViewById(R.id.linkPlaces);
        toPlaces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RestaurantsActivity.this, PlacesActivity.class);
                startActivity(intent);
            }
        });

        //getting the recyclerview from xml
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //initializing the productlist
        productList = new ArrayList<>();

        //Return Button
        final Button backLodging;

        backLodging = (Button) findViewById(R.id.buttonBackLodging);

        backLodging.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RestaurantsActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}
