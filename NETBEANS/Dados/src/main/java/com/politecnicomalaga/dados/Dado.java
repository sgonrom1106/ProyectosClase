/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.politecnicomalaga.dados;

/**
 *
 * @author seryi
 */
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
