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
    List<Product> productList1;

    //the recyclerview
    RecyclerView recyclerView, recyclerView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);

        //getting the recyclerview from xml
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView1);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);

        //initializing the productlist
        productList1 = new ArrayList<>();


        //adding some items to our list
        productList1.add(
                new Product(
                        1,
                        "Rafting BBB",
                        "2mi",
                        4.5,
                        R.drawable.rafting));

        productList1.add(
                new Product(
                        2,
                        "Arenal Tour",
                        "2mi",
                        4.3,
                        R.drawable.arenal_tour));

        productList1.add(
                new Product(
                        3,
                        "Surf Jaco",
                        "2.2 mi",
                        5,
                        R.drawable.suf_jaco));

        //creating recyclerview adapter
        ProductAdapter adapter = new ProductAdapter(this, productList1);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);

        //second recycler test
        LinearLayoutManager layoutManager2
                = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView2 = (RecyclerView) findViewById(R.id.recyclerView2);
        recyclerView2.setHasFixedSize(true);
        recyclerView2.setLayoutManager(layoutManager2);


        recyclerView2.setAdapter(adapter);

    }


}
