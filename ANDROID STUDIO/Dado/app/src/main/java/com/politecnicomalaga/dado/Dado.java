package com.politecnicomalaga.dado;

public class Dado {

    private int valor;

    public Dado(){

        valor = (int)(Math.random()*6) + 1;

    }

    public int tirarDado(){

        valor = (int)(Math.random()*6) + 1;

        return valor;
    }

    public int getValor() {
        return valor;
    }
}
