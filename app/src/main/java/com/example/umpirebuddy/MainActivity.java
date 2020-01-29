package com.example.umpirebuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView numBalls;
    TextView numStrikes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numBalls = findViewById(R.id.ballCounter);
        numStrikes = findViewById(R.id.strikeCounter);

    }
}
