package com.example.pokedex;

public class Pokemon {
    private String nome;
    private String descricao;
    private int foto;

    public Pokemon() {
        this.nome = "";
        this.descricao = "";
        this.foto = 0;
    }

    public Pokemon(String nome, String descricao, int foto) {
        this.nome = nome;
        this.descricao = descricao;
        this.foto = foto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }


}
