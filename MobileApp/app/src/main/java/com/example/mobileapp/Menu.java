package com.example.mobileapp;

import android.view.MenuItem;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;



public class Menu extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id==R.id.action_home){
            Intent intent = new Intent( this, HomeActivity.class);
            startActivity(intent);
        } else

        if (id==R.id.action_stay){
            Intent intent = new Intent(this,HotelsActivity.class);
            startActivity(intent);
        } else

        if (id==R.id.action_eat){
            Intent intent = new Intent(this,RestaurantsActivity.class);
            startActivity(intent);
        } else

        if(id==R.id.action_go){
            Intent intent = new Intent(this, PlacesActivity.class);
            startActivity(intent);

        } else

        if(id==R.id.action_map){
            Intent intent = new Intent(this, MapActivity.class);
            startActivity(intent);

        }
            return super.onOptionsItemSelected(item);
    }
}
