package com.viniciusvasconcelos.parouimpar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvResposta;
    EditText etNumero;
    Button btExecutar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResposta = findViewById(R.id.tvResposta);
        etNumero = findViewById(R.id.etNumero);
        btExecutar = findViewById(R.id.btExecutar);

        btExecutar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                try {
                    int valor = Integer.parseInt(etNumero.getText().toString());
                    tvResposta.setVisibility(View.VISIBLE);

                    if(valor % 2 == 0)
                        tvResposta.setText("Par");
                    else
                        tvResposta.setText("Ímpar");
                }catch (Exception e) {
                    tvResposta.setText("Digite apenas números !");
                }


            }
        });
    }
}
