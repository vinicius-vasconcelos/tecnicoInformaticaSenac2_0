package com.example.pokedex;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private ArrayList<Pokemon> myData;
    private LayoutInflater myInflate;
    private Context context;

    public MyAdapter(Context context, ArrayList<Pokemon> mData) {
        this.myData = mData;
        this.context = context;
        this.myInflate = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = myInflate.inflate(R.layout.item_view, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, final int position) {
        String name = myData.get(position).getNome();
        int foto = myData.get(position).getFoto();

        holder.tvNome.setText(name);
        holder.ivFoto.setImageResource(foto);
        holder.btnVermais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, InformacoesAct.class);

                intent.putExtra("obj", (Serializable)myData.get(position));
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return this.myData.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvNome;
        ImageView ivFoto;
        Button btnVermais;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNome = itemView.findViewById(R.id.tvNomePokemon);
            ivFoto = itemView.findViewById(R.id.ivFoto);
            btnVermais = itemView.findViewById(R.id.btnVermais);

        }
    }
}
