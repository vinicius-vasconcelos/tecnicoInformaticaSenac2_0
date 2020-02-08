package com.viniciusvasconcelos.anyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class EstiloParImparActivity extends AppCompatActivity {

    private EditText etValor;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estilo_par_impar);

        etValor = findViewById(R.id.etValor);
        tvResult = findViewById(R.id.tvResult);
    }

    public void onClickVerificar(View v) {

        if(Integer.parseInt(etValor.getText().toString())%2 != 0)
            tvResult.setText("Ímpar");
        else
            tvResult.setText("Par");
    }
}
