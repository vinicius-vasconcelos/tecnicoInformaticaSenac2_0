package com.viniciusvasconcelos.anyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickImc(View v) {
        startActivity(new Intent(this, EstiloImcActivity.class));
    }

    public void onClickParImpar(View v) {
        startActivity(new Intent(this, EstiloParImparActivity.class));
    }

    public void onClickVideo(View v) {
        startActivity(new Intent(this, EstiloVideoActivity.class));
    }

    public void onClickSair(View v) {
        System.exit(2);
    }
}
