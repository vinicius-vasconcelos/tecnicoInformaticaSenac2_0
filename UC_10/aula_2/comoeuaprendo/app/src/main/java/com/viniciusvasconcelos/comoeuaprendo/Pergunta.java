package com.viniciusvasconcelos.comoeuaprendo;

public class Pergunta {
    private String enunciado;
    private Tipo tipo;
    private boolean resp;

    public Pergunta() {
    }

    public Pergunta(String enunciado, Tipo tipo) {
        this.enunciado = enunciado;
        this.tipo = tipo;
        this.resp = false;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public Pergunta setEnunciado(String enunciado) {
        this.enunciado = enunciado;
        return this;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public Pergunta setTipo(Tipo tipo) {
        this.tipo = tipo;
        return this;
    }

    public boolean isResp() {
        return resp;
    }

    public Pergunta setResp(boolean resp) {
        this.resp = resp;
        return this;
    }
}
