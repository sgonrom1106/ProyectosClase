/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.politecnicomalaga.loteriamain;


/**
 *
 * @author seryi
 */

public class Loteria {
    
    private int [] boletoGanador;
    
    
    public Loteria(){
        
        boletoGanador = new int [7];
    }
    
    public void ganadora(){
        
        boolean diferente;
        
        for(int i = 0; i < boletoGanador.length; i++){
            diferente = false;
            boletoGanador[i] = (int)(Math.random()*49) + 1;
            
            for(int j = 0; j < i; j++){
                
                if(boletoGanador[i] != boletoGanador[j]){
                    diferente = true;
                }
                
            }
            
            if(!diferente){
                boletoGanador[i] = (int)(Math.random()*49) + 1;
            }
            
        }
               
    }
    
    public void verGanadora(){
        
        for(int i = 0; i < boletoGanador.length; i++)
        System.out.println("El número [" + i + "] del boleto ganador es: " +boletoGanador[i]);
        
    }
    
    public int comprobarBoleto(int [] boleto){

        int contador = 0;
        
        for(int i = 0; i < boleto.length - 1; i++)
            for(int j = 0; j < boletoGanador.length - 1; j++)

            //if(Arrays.equals(boleto, boletoGanador)){
            if(boleto[i] == boleto[j]){
                contador++;
            }
        
    return contador;
        
    }
    
}
    
    
