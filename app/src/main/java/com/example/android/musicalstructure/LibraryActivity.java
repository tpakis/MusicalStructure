package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.File;
import java.util.List;

import easyfilepickerdialog.kingfisher.com.library.model.DialogConfig;
import easyfilepickerdialog.kingfisher.com.library.model.SupportFile;
import easyfilepickerdialog.kingfisher.com.library.view.FilePickerDialogFragment;


public class LibraryActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ShowFilePicker();
    }

    public void ShowFilePicker() {
        DialogConfig dialogConfig = new DialogConfig.Builder()
                .enableMultipleSelect(true) // default is false
                .enableFolderSelect(true) // default is false
                .initialDirectory(Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator + "Android") // default is sdcard
                .supportFiles(new SupportFile(".3gpp", R.drawable.ic_audio), new SupportFile(".mp3", R.drawable.ic_audio)) // default is showing all file types.
                .build();


        new FilePickerDialogFragment.Builder()
                .configs(dialogConfig)
                .onButtonsClick(new FilePickerDialogFragment.onButtonsClickListener() {
                    @Override
                    public void playButtonClick() {
                        Intent intent = new Intent(LibraryActivity.this, PlayingNowActivity.class);
                        startActivity(intent);
                    }

                    @Override
                    public void listButtonClick() {
                        Intent intent = new Intent(LibraryActivity.this, PlaylistActivity.class);
                        startActivity(intent);
                    }

                    @Override
                    public void exitButtonClick() {
                        Intent intent = new Intent(LibraryActivity.this, MainActivity.class);
                        startActivity(intent);
                    }
                })
                .onFilesSelected(new FilePickerDialogFragment.OnFilesSelectedListener() {
                    @Override
                    public void onFileSelected(List<File> list) {
                        //Log.e(TAG, "total Selected file: " + list.size());
                        for (File file : list) {
                            // Log.e(TAG, "Selected file: " + file.getAbsolutePath());
                        }
                    }
                })
                .build()
                .show(getSupportFragmentManager(), null);
    }
}


