package com.viniciusvasconcelos.anyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class EstiloImcActivity extends AppCompatActivity {

    private EditText etPeso;
    private EditText etAltura;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estilo_imc);

        etPeso = findViewById(R.id.etPeso);
        etAltura = findViewById(R.id.etAltura);
        tvResultado = findViewById(R.id.tvResultado);
    }

    public void onClickCalcular(View v) {

        double imc = Double.parseDouble(etPeso.getText().toString()) / Math.pow(Double.parseDouble(etAltura.getText().toString()), 2);

        if(imc <= 18.5)
            tvResultado.setText("Tu ta feião !");
        else if(imc > 18.5 && imc <= 24.9)
                tvResultado.setText("Mais ou menos parça !");
        else if(imc > 25 && imc <= 29.9)
            tvResultado.setText("Gordinho");
        else if(imc > 30 && imc <= 34.9)
            tvResultado.setText("Gordo !");
        else if(imc > 35 && imc <= 39.9)
            tvResultado.setText("Gordão !");
        else if(imc > 40)
            tvResultado.setText("Tu ta gordo pra caralho !");
    }
}
