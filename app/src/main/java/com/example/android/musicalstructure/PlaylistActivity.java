package com.example.android.musicalstructure;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlists);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Typeface awsomefont = Typeface.createFromAsset(getAssets(), "fontawesome-webfont.ttf");

        Button btnPlayCurrent = (Button) findViewById(R.id.play);
        btnPlayCurrent.setTypeface(awsomefont);
        btnPlayCurrent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlaylistActivity.this, PlayingNowActivity.class);
                startActivity(intent);
            }
        });

        ListView playlistsView = (ListView) findViewById(R.id.ListView1);
        String[] playlists = new String[]{"POP", "Best of", "Rock me Hard", "Folk Songs 1",
                "Greek Are Here", "New Songs", "Oldies", "Ballads", "90s", "80s", "Classical"};
        ArrayList<String> planetList = new ArrayList<String>();
        planetList.addAll(Arrays.asList(playlists));
        ListAdapter listAdapter = new ArrayAdapter<String>(this, R.layout.oneline, planetList);
        playlistsView.setAdapter(listAdapter);
    }
}
