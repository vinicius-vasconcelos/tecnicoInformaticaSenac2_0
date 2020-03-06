package com.example.pokedex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    MyAdapter adapter;
    private ArrayList<Pokemon> pokemons;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.IniciarRecyclerView();

        RecyclerView rcv = findViewById(R.id.rv);
        rcv.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MyAdapter(this, pokemons);
        rcv.setAdapter(adapter);
    }

    private void IniciarRecyclerView(){
        this.CriarLista();
    }
    private void CriarLista(){
        this.pokemons = new ArrayList<Pokemon>();
        this.pokemons.add(new Pokemon("Abra","Psi",R.drawable.abra));
        this.pokemons.add(new Pokemon("Bulbasaur","Grass",R.drawable.bulbasaur));
        this.pokemons.add(new Pokemon("Butterfree","Fly",R.drawable.butterfree));
        this.pokemons.add(new Pokemon("Caterpie","Bug",R.drawable.caterpie));
        this.pokemons.add(new Pokemon("Charmander","Fire",R.drawable.charmander));
        this.pokemons.add(new Pokemon("Diglett","Ground",R.drawable.diglett));
        this.pokemons.add(new Pokemon("Jigglypuff","Normal",R.drawable.jigglypuff));
        this.pokemons.add(new Pokemon("Pidgey","Fly",R.drawable.pidgey));
        this.pokemons.add(new Pokemon("Pikachu","Electric",R.drawable.pikachu));
        this.pokemons.add(new Pokemon("Psyduck","Psi",R.drawable.psyduck));
        this.pokemons.add(new Pokemon("Squirtle ","Water",R.drawable.squirtle));
        this.pokemons.add(new Pokemon("Zubat","Flay",R.drawable.zubat));

    }
}
