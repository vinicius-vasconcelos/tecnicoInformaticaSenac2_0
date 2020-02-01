package com.viniciusvasconcelos.dicegame;

import java.util.Random;

public class Dice {
    private int numero;

    public Dice() {
        this.numero = 1;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero > 0 && numero < 7)
            this.numero = numero;
        else
            this.numero = 1;
    }

    public  void jogarDado() {
        Random gerador = new Random();
        this.setNumero(gerador.nextInt(6) + 1);
    }
}
