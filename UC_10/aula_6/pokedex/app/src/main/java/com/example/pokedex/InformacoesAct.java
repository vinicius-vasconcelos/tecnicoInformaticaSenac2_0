package com.example.pokedex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class InformacoesAct extends AppCompatActivity {

    TextView tvNomePoke;
    TextView tvPokeDes;
    ImageView ivPoke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacoes);

        Pokemon poke = (Pokemon) getIntent().getExtras().getSerializable("obj");

        tvNomePoke = findViewById(R.id.tvNomePoke);
        tvPokeDes = findViewById(R.id.tvPokeDes);
        ivPoke = findViewById(R.id.ivPoke);

        tvNomePoke.setText(poke.getNome());
        tvPokeDes.setText("Pokemon type: " + poke.getDescricao());
        ivPoke.setImageResource(poke.getFoto());
    }
}
