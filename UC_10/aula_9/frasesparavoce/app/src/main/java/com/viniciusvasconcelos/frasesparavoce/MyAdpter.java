package com.viniciusvasconcelos.frasesparavoce;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.Serializable;
import java.util.ArrayList;

public class MyAdpter extends RecyclerView.Adapter<MyAdpter.MyViewHolder> {

    private ArrayList<Frase> myData;
    private LayoutInflater myInflate;
    private Context context;

    public MyAdpter(Context context, ArrayList<Frase> mData) {
        this.myData = mData;
        this.context = context;
        this.myInflate = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = myInflate.inflate(R.layout.activity_lista_frases, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        String texto = myData.get(position).getTexto();

        holder.tvData.setText(texto);
        holder.tvData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ListaFrases.class);

                intent.putExtra("obj", (Serializable) myData.get(position));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return this.myData.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvData;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvData = itemView.findViewById(R.id.tvData);
        }
    }
}
