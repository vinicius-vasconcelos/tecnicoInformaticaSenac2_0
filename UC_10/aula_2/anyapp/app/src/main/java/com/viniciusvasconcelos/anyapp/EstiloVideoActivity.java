package com.viniciusvasconcelos.anyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

import java.net.URI;

public class EstiloVideoActivity extends AppCompatActivity {

    private VideoView vid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estilo_video);

        vid = findViewById(R.id.vvVideo);

        vid.setVideoURI(Uri.parse("android.resource://com.viniciusvasconcelos.anyapp/"+ R.raw.videoplayback));
        vid.start();
    }
}
