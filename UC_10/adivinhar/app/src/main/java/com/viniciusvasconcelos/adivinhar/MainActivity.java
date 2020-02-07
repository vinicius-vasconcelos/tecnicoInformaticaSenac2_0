package com.viniciusvasconcelos.adivinhar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText val;
    Button btnChute;
    TextView tvDica;
    Button btReniciar;
    int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        val = findViewById(R.id.etVal);
        tvDica = findViewById(R.id.tvDica);
        btnChute = findViewById(R.id.btnChute);
        btReniciar = findViewById(R.id.btReniciar);

        num = new Random().nextInt(51);
    }

    public void onClick(View v) {

        if(Integer.parseInt(val.getText().toString()) > num)
            tvDica.setText("Chute um número MENOR !!!");
        else
            if(Integer.parseInt(val.getText().toString()) < num)
                tvDica.setText("Chute um número MAIOR !!!");
            else{
                tvDica.setText("Parabéns, você ganhou !!!");
                btnChute.setVisibility(View.INVISIBLE);
            }

    }



}
