package com.example.android.musicalstructure;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlayingNowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playingnow);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Typeface awsomefont = Typeface.createFromAsset(getAssets(), "fontawesome-webfont.ttf");

        Button btnPlay = (Button) findViewById(R.id.button_play);
        btnPlay.setTypeface(awsomefont);
        Button btnStop = (Button) findViewById(R.id.button_stop);
        btnStop.setTypeface(awsomefont);
        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlayingNowActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        Button btnNext = (Button) findViewById(R.id.button_next);
        btnNext.setTypeface(awsomefont);
        Button btnPrev = (Button) findViewById(R.id.button_previous);
        btnPrev.setTypeface(awsomefont);
        Button btnLoadPlaylist = (Button) findViewById(R.id.button_loadPlaylist);
        btnLoadPlaylist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlayingNowActivity.this, PlaylistActivity.class);
                startActivity(intent);
            }
        });
    }
}
