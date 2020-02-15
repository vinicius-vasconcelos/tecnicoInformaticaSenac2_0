package com.viniciusvasconcelos.comoeuaprendo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultadoFinalEstiloActivity extends AppCompatActivity {

    private TextView tvResult;
    private Button btnResult;
    private String type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_final_estilo);

        Intent intent = getIntent();
        Bundle params = intent.getExtras();

        tvResult = findViewById(R.id.tvResult);
        btnResult = findViewById(R.id.btnResult);

        type = params.getString("btnRes");
        showMsg(params.getString("res"), type);
    }

    public void showMsg(String resposta, String btn) {

        tvResult.setText(resposta + "\nParabéns você é: " + btn);
        btnResult.setText("Leia Mais Sobre " + btn);
    }

    public void onclickOpenType(View v) {

        switch (type) {
            case "AUDITVO":
                startActivity(new Intent(this, EstiloAuditivoActivity.class));
                break;
            case "CINESTÉSICO":
                startActivity(new Intent(this, EstiloCinestesicoActivity.class));
                break;
            case "LEITURA E ESCRITA":
                startActivity(new Intent(this, EstiloLeituraActivity.class));
                break;
            case "VISUAL":
                startActivity(new Intent(this, EstiloVisualActivity.class));
                break;
        }

    }
}
