package com.viniciusvasconcelos.frasesparavoce;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.UUID;

public class CrudFrasesActivity extends AppCompatActivity {
    EditText etTexto;
    EditText etAutor;
    Spinner spCategoria;

    //firebase
    FirebaseDatabase database;
    DatabaseReference myRef;

    private void iniciarBanco() {
        FirebaseApp.initializeApp(CrudFrasesActivity.this);
        database = FirebaseDatabase.getInstance();
        database.setPersistenceEnabled(true);

        myRef = database.getReference();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crud_frases);

        this.iniciarBanco();
        iniciarViews();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if(id == R.id.menu_new) {
            Frase frase = new Frase(UUID.randomUUID().toString(), etTexto.getText().toString(), etAutor.getText().toString(), spCategoria.getSelectedItem().toString());

            myRef.child("frases").child(frase.getId()).setValue(frase);
        }
        if(id == R.id.menu_delete)
            Toast.makeText(this, "Clicou no DELETE", Toast.LENGTH_SHORT).show();
        if(id == R.id.menu_search)
            Toast.makeText(this, "Clicou no SEARCH", Toast.LENGTH_SHORT).show();
        if(id == R.id.menu_update)
            Toast.makeText(this, "Clicou no UPDATE", Toast.LENGTH_SHORT).show();

        return true;
    }

    private void iniciarViews() {
        etTexto = findViewById(R.id.etTexto);
        etAutor = findViewById(R.id.etAutor);
        spCategoria = findViewById(R.id.spCategoria);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.categoria_dados, android.R.layout.simple_spinner_item);
        spCategoria.setAdapter(adapter);
    }

}
