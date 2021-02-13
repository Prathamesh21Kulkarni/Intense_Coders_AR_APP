package com.example.augmentedreality;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class homescreen extends AppCompatActivity {

    GridLayout mainGrid;
    CardView human, wolf, mountain, brain, heart, satelite, roboticarm, engine, bot_drone, drillbit, assembly, battery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen);

        mainGrid = (GridLayout)findViewById(R.id.mainGrid);

        human = findViewById(R.id.human);
        wolf = findViewById(R.id.wolf);
        mountain = findViewById(R.id.mountain);
        brain = findViewById(R.id.brain);
        heart = findViewById(R.id.heart);
        satelite = findViewById(R.id.satelite);
        roboticarm = findViewById(R.id.roboticarm);
        engine = findViewById(R.id.engine);
        bot_drone = findViewById(R.id.bot_drone);
        drillbit = findViewById(R.id.drillbit);
        assembly = findViewById(R.id.assembly);
        battery = findViewById(R.id.battery);

        human.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(homescreen.this, MainActivity.class));
            }
        });

        wolf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(homescreen.this, wolf.class));
            }
        });

        mountain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(homescreen.this, hills.class));
            }
        });

        brain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(homescreen.this, human_brain.class));
            }
        });

        heart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(homescreen.this, heart.class));
            }
        });

        satelite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(homescreen.this, Satelite.class));
            }
        });

        roboticarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(homescreen.this, robotic_arm.class));
            }
        });

        engine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(homescreen.this, engine.class));
            }
        });

        bot_drone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(homescreen.this, bot_drone.class));
            }
        });

        drillbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(homescreen.this, drillbit.class));
            }
        });

        assembly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(homescreen.this, AssemblyMachine.class));
            }
        });

        battery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(homescreen.this, battery.class));
            }
        });


    }
}
