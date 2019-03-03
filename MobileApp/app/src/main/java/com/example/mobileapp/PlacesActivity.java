package com.example.mobileapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.mobileapp.objects.Product;
import com.example.mobileapp.objects.ProductAdapter;

import java.util.ArrayList;
import java.util.List;

public class PlacesActivity extends AppCompatActivity {

    //a list to store all the products
    List<Product> productList;

    //the recyclerview
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);

        TextView toRestaurants = (TextView) findViewById(R.id.linkRestaurants);
        toRestaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlacesActivity.this,RestaurantsActivity.class);
                startActivity(intent);
            }
        });

        //Redirect to hotels activity
        TextView toHotels = (TextView) findViewById(R.id.linkHotels);
        toHotels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlacesActivity.this,HotelsActivity.class);
                startActivity(intent);
            }
        });

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
                        "Limón",
                        4.3,
                        60000,
                        R.drawable.rafting));

        productList.add(
                new Product(
                        1,
                        "Arenal Tour",
                        "Volcán Arenal",
                        4.3,
                        60000,
                        R.drawable.arenal_tour));

        productList.add(
                new Product(
                        1,
                        "Surf Jaco",
                        "Jaco",
                        4.3,
                        60000,
                        R.drawable.suf_jaco));

        //creating recyclerview adapter
        ProductAdapter adapter = new ProductAdapter(this, productList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);

        //Return Button
        final Button backLodging;

        backLodging = (Button) findViewById(R.id.buttonBackLodging);

        backLodging.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlacesActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}
