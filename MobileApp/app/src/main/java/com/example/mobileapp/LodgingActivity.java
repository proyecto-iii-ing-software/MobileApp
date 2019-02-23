package com.example.mobileapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class LodgingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lodging);

        final Button menuButton;
        final ImageButton placesButton1;
        final ImageButton restaurantsButton2;
        final ImageButton hotelButton3;

        menuButton= (Button) findViewById(R.id.buttonBackMenu);
        placesButton1 = (ImageButton) findViewById(R.id.imageButton1);
        restaurantsButton2 = (ImageButton) findViewById(R.id.imageButton2);
        hotelButton3 = (ImageButton) findViewById(R.id.imageButton3);

        placesButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LodgingActivity.this, PlacesActivity.class);
                startActivity(intent);
            }
        });
        restaurantsButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LodgingActivity.this, RestaurantsActivity.class);
                startActivity(intent);
            }
        });
        hotelButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LodgingActivity.this, HotelsActivity.class);
                startActivity(intent);
            }
        });

        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LodgingActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });



    }

}
