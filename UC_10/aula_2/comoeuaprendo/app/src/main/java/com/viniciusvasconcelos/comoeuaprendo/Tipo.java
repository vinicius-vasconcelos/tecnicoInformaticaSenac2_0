package com.viniciusvasconcelos.comoeuaprendo;

public class Tipo {
    private String tipo;
    private int count;

    public Tipo(String tipo) {
        this.tipo = tipo;
        this.count = 0;
    }

    public String getTipo() {
        return tipo;
    }

    public Tipo setTipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    public int getCount() {
        return count;
    }

    public Tipo setCount(int count) {
        this.count = count;
        return this;
    }
}
