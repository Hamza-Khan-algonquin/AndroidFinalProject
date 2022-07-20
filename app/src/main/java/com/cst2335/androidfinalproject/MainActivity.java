package com.cst2335.androidfinalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button2).setOnClickListener((click)->
        {
            Intent goToFavourites =new Intent(MainActivity.this, favouritesActivity.class);
            startActivity(goToFavourites);
        });
    }
}