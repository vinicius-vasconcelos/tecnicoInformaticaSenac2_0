package com.viniciusvasconcelos.apiapod;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private EditText etData;
    private ImageView ivImage;
    private TextView tvResult;
    private Button btnPesquisar;
    private Retrofit retrofit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etData = findViewById(R.id.etData);
        ivImage = findViewById(R.id.ivImage);
        tvResult = findViewById(R.id.tvResult);
        btnPesquisar = findViewById(R.id.btnPesquisar);
    }

    public void onClick(View v) {
        String dataEscrita[] = etData.getText().toString().split("/");
        String api = "https://api.nasa.gov/planetary/apod?date=" + dataEscrita[2] + "-" + dataEscrita[1] + "-" + dataEscrita[0] + "&api_key=DEMO_KEY";

        tvResult.setText(api.toString());

        retrofit = new Retrofit.Builder()
                    .baseUrl(api)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();



    }
}
