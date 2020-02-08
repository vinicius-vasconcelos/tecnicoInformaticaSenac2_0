package com.viniciusvasconcelos.comoeuaprendo;

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

    public void btnAuditivoOnClick(View v) {
        startActivity(new Intent(this, EstiloAuditivoActivity.class));
    }

    public void btnCinestisicoOnClick(View v) {
        startActivity(new Intent(this, EstiloCinestesicoActivity.class));
    }

    public void btnLeituraOnClick(View v) {
        startActivity(new Intent(this, EstiloLeituraActivity.class));
    }

    public void btnVisualOnClick(View v) {
        startActivity(new Intent(this, EstiloVisualActivity.class));
    }

    public void btnIniciarOnClick(View v) {
        //startActivity(new Intent(this, EstiloVisualActivity.class));
    }
}
