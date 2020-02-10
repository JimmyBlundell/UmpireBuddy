package com.example.umpirebuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.TextView;

import android.widget.Button;

import android.view.View;

public class MainActivity extends AppCompatActivity {

    TextView numBalls;
    TextView numStrikes;

    Button ballsAdder;
    Button strikesAdder;

    Button reset;
    Button exit;
    Button about;

    int ballCount = 0;
    int strikeCount = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numBalls = findViewById(R.id.ballCounter);
        numStrikes = findViewById(R.id.strikeCounter);

        ballsAdder = findViewById(R.id.ballsAdder);
        strikesAdder = findViewById(R.id.strikesAdder);

        reset = findViewById(R.id.resetButton);
        exit = findViewById(R.id.exitButton);

    }

    public void openBallDialog() {
        ballDialog dlg = new ballDialog();
        dlg.show(getSupportFragmentManager(), "jimmyjam");
    }

    public void openStrikeDialog() {
        strikeDialog dlg = new strikeDialog();
        dlg.show(getSupportFragmentManager(), "jimmyjam");
    }

    public void openAboutDialog() {
        aboutDialog dlg = new aboutDialog();
        dlg.show(getSupportFragmentManager(), "jimmyjam");
    }


    public void addBallCount(View view) {

        if (ballCount == 3) {
            ballCount = 0;
            strikeCount = 0;
            numBalls.setText(Integer.toString(ballCount));
            numStrikes.setText(Integer.toString(strikeCount));
            openBallDialog();

        }


        else {
            ballCount++;
            numBalls.setText(Integer.toString(ballCount));
        }
    }

    public void addStrikeCount(View view) {

        if (strikeCount == 2) {
            ballCount = 0;
            strikeCount = 0;
            numBalls.setText(Integer.toString(ballCount));
            numStrikes.setText(Integer.toString(strikeCount));
            openStrikeDialog();
        }

        else {
            strikeCount++;
            numStrikes.setText(Integer.toString(strikeCount));
        }

    }


    public void resetCount(View view) {

        ballCount = 0;
        strikeCount = 0;

        numBalls.setText(Integer.toString(ballCount));
        numStrikes.setText(Integer.toString(strikeCount));

    }

    public void aboutPopup(View view) {
        openAboutDialog();
    }

    public void exitApp(View view) {
        System.exit(0);
    }

}
