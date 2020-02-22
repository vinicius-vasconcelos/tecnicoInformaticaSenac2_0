package com.example.magic8ball;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Giroscopio giroscopio;
    private ImageView ivFoto;
    private int i;
    private TextView tvResult;
    private TextView tvTitulo;
    private Button btReset;
    private Drawable img;
    private String[] msg;
    private boolean flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zerarContador();
        flag = true;
        ivFoto = findViewById(R.id.ivFoto);
        tvResult = findViewById(R.id.tvResult);
        tvTitulo = findViewById(R.id.tvTitulo);
        btReset = findViewById(R.id.btReset);
        geraMensagens();

        giroscopio = new Giroscopio(this);

        giroscopio.setListener(new Giroscopio.Listener() {
            @Override
            public void OnRotation(float rx, float ry, float rz) {

                i++;
                if ((rx > 1.0f && rx > -1.0f) || (ry > 1.0f && ry > -1.0f) || (rz > 1.0f && rz > -1.0f) ){

                    if(i > 0 && flag) {
                        img = getResources().getDrawable(R.drawable.magi8ballverso);
                        ivFoto.setImageDrawable(img);
                        tvResult.setVisibility(View.VISIBLE);
                        tvResult.setText(sorteio());

                        tvTitulo.setVisibility(View.INVISIBLE);
                        btReset.setVisibility(View.VISIBLE);
                        flag = false;
                    }


                }
            }
        });


    }

    @Override
    protected void onResume(){
        super.onResume();

        giroscopio.register();
    }

    public String sorteio() {
        Random gerador = new Random();
        return(msg[gerador.nextInt(19)+1]);
    }

    public void zerarContador(){
        i = 0;
    }

    public void btReset(View v){
        zerarContador();
        img = getResources().getDrawable(R.drawable.mafic8ballfrente);
        ivFoto.setImageDrawable(img);

        tvResult.setVisibility(View.INVISIBLE);
        tvTitulo.setVisibility(View.VISIBLE);
        btReset.setVisibility(View.INVISIBLE);
    }

    public void geraMensagens() {
        msg = new String[20];

        msg[0] = "É certo";
        msg[1] = "É decididamente que sim.";
        msg[2] = "sem dúvida.";
        msg[3] = "Definitivamente sim.";
        msg[4] = "Você pode contar com ele.";
        msg[5] = "Pelo que vejo, sim.";
        msg[6] = "Provavelmente.";
        msg[7] = "Outlook bom.";
        msg[8] = "sim.";
        msg[9] = "sinais apontam para sim";
        msg[10] = "Estou confuso, tente novamente.";
        msg[11] = "Pergunte mais tarde.";
        msg[12] = "Melhor não contar agora.";
        msg[13] = "Não sei dizer agora.";
        msg[14] = "Concentre-se e pergunte novamente.";
        msg[15] = "Não conte com isso.";
        msg[16] = "Minha resposta é não.";
        msg[17] = "Minhas fontes dizem não.";
        msg[18] = "Outlook não é tão bom.";
        msg[19] = "Muito duvidoso.";
    }

}
