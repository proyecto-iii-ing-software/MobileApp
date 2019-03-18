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

public class HotelsActivity extends Activity {

    //a list to store all the products
    List<Product> productList;

    //the recyclerview
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);

        //Redirect to restaurants category
        TextView toRestaurants = (TextView) findViewById(R.id.linkRestaurants);
        toRestaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HotelsActivity.this,RestaurantsActivity.class);
                startActivity(intent);
            }
        });

        //Redirect to places category
        TextView toPlaces = (TextView) findViewById(R.id.linkPlaces);
        toPlaces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HotelsActivity.this,PlacesActivity.class);
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
                        "Double tree resort",
                        "Puerto viejo",
                        4.3,
                        60000,
                        R.drawable.doubletree));

        productList.add(
                new Product(
                        1,
                        "Camping Charrarra",
                        "Guanacaste",
                        4.3,
                        60000,
                        R.drawable.campingcharrarra));

        productList.add(
                new Product(
                        1,
                        "Motel TT",
                        "Jaco",
                        4.3,
                        60000,
                        R.drawable.motelcr));

        //creating recyclerview adapter
        ProductAdapter adapter = new ProductAdapter(this, productList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);

        //Return Button
        final Button backLodging;
        backLodging = (Button) findViewById(R.id.buttonBackLodging);

        //Listener for going back to home
        backLodging.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HotelsActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}
