package com.viniciusvasconcelos.frasesparavoce;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ListaFrases extends AppCompatActivity {
    private TextView tvData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_frases);

        Frase poke = (Frase) getIntent().getExtras().getSerializable("obj");
        tvData = findViewById(R.id.tvData);
        tvData.setText(poke.getTexto());
    }
}
