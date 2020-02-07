package com.viniciusvasconcelos.somadoisnumeros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etN1;
    EditText etN2;
    Button btnSomar;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etN1 = findViewById(R.id.etN1);
        etN2 = findViewById(R.id.etN2);
        btnSomar = findViewById(R.id.btnSomar);
        tvResult = findViewById(R.id.tvResult);
    }

    public void onClick(View v) {
       int valor1 = Integer.parseInt(etN1.getText().toString());
       int valor2 = Integer.parseInt(etN2.getText().toString());
       int resultado = valor1 + valor2;

        tvResult.setText(String.valueOf(resultado));

    }
}
