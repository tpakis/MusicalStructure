package com.example.android.musicalstructure;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CarModeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carmode);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Typeface awsomefont = Typeface.createFromAsset(getAssets(), "fontawesome-webfont.ttf");

        Button btnCarPlay = (Button) findViewById(R.id.car_play);
        btnCarPlay.setTypeface(awsomefont);
        Button btnCarStop = (Button) findViewById(R.id.car_stop);
        btnCarStop.setTypeface(awsomefont);
        Button btnCarNext = (Button) findViewById(R.id.car_next);
        btnCarNext.setTypeface(awsomefont);
        Button btnCarPrev = (Button) findViewById(R.id.car_prev);
        btnCarPrev.setTypeface(awsomefont);
        Button btnCarExit = (Button) findViewById(R.id.car_exit);
        btnCarExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CarModeActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
