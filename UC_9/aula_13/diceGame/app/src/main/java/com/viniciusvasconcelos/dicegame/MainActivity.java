package com.viniciusvasconcelos.dicegame;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView img;
    TextView jogadas;
    EditText numero;
    Button btJogar;
    int rodadas;
    Dice dice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        img = findViewById(R.id.img);
        jogadas = findViewById(R.id.tvJogadas);
        numero = findViewById(R.id.etNumero);
        btJogar = findViewById(R.id.btJogar);
        rodadas = 1;

        dice = new Dice();
    }

    public void btJogarClick(View v) {

        dice.jogarDado();
        int num = Integer.parseInt(numero.getText().toString());
        int numSortado = dice.getNumero();
        Drawable sorteado = null ;

        switch (numSortado) {
            case 1:
                sorteado =  getResources().getDrawable(R.drawable.die1);
                break;
            case 2:
                sorteado =  getResources().getDrawable(R.drawable.die2);
                break;
            case 3:
                sorteado =  getResources().getDrawable(R.drawable.die3);
                break;
            case 4:
                sorteado =  getResources().getDrawable(R.drawable.die4);
                break;
            case 5:
                sorteado =  getResources().getDrawable(R.drawable.die5);
                break;
            case 6:
                sorteado =  getResources().getDrawable(R.drawable.die6);
                break;
        }

        img.setImageDrawable(sorteado);

        if(num == numSortado) {
            jogadas.setText("Parabéns, você ganhou !!! com " + rodadas + " jogadas");
            ((Button) v).setVisibility(View.INVISIBLE);
        }
        else {
            jogadas.setText("Jogadas:");
            String txt = jogadas.getText().toString();
            jogadas.setText(txt + "" + rodadas++);
        }

        numero.setText("");
    }

    public void btResetClick(View v) {
        rodadas = 1;
        img.setImageDrawable(getResources().getDrawable(R.drawable.die1));
        jogadas.setText("Jogadas:");
        numero.setText("");
        ((Button) v).setVisibility(View.VISIBLE);
    }
}
