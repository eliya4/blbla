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
       Bundle args = new Bundle();
       args.putString("TEST","FRAG1");
       firstFragment.setArguments(args);
        Button fragOneButn= findViewById(R.id.button);
        Button fragTowButn= findViewById(R.id.button2);
        getSupportFragmentManager().beginTransaction().replace(R.id.button,firstFragment).commit();



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