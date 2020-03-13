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

public class CrudFrasesActivity extends AppCompatActivity {
    EditText etTexto;
    EditText etAutor;
    Spinner spCategoria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crud_frases);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.menu_new)
            Toast.makeText(this, "Clicou no NEW", Toast.LENGTH_SHORT).show();
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
