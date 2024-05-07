package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       FirstFragment firstFragment= FirstFragment.newInstance();
       SECANDFragment secandFragment=SECANDFragment.newInstance();
        Button fragOneButn= findViewById(R.id.button);
        Button fragTowButn= findViewById(R.id.button2);


        fragOneButn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.button,firstFragment).commit();
            }
        });
        fragTowButn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.button,secandFragment).commit();

            }
        });

    }

}