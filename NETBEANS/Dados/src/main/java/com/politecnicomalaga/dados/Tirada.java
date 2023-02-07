/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.politecnicomalaga.dados;

/**
 *
 * @author seryi
 */
public class Tirada {
    
    Dado dado1;
    Dado dado2;
    
    public Tirada(){
        
        dado1 = new Dado();
        dado2 = new Dado();
        
    }
    
    public String getTirada(){
        
        return dado1.getValor() + "," + dado2.getValor();
        
    }
    
    /*
    - Otro método de devolver el valor de los dados (por teclado)
    
    public int getValorDado(int d){
    
        if(d==1){
            return dado1.getValor();
        }else
            return dado2.getValor();    
    } 
   
    - Devolver valor dado con imágenes
    public String getResultadoValor(int d){
        
        String res = ".png";
        
        if(d == 1){
            res = dado1.getValor() + res;
        }else
            res = dado2.getValor() + res;
        
        return res;
    }
    
    */
    public int getSuma(){
        
        int suma;
        
        suma = dado1.getValor() + dado2.getValor();
                
        return suma;
        
    }
    
    public int calcularSeis(){
        
        int contador = 0;
        
        if((dado1.getValor() == 6) && (dado2.getValor() == 6)){
            contador = 2;
            
                }else if((dado1.getValor() == 6) || (dado2.getValor() == 6)){
                    contador = 1;
              
        }
        
        return contador;
        
    }
    
    public int HaGanado(Tirada otra){
                
        //Posibilidad 1: tiene this mas 6s que otra?
        if(this.calcularSeis() > otra.calcularSeis()){
            //Ha ganado this
            return 1;
            
        }else if(this.calcularSeis() < otra.calcularSeis()){
            return 2;
            
        }else if(this.getSuma() > otra.getSuma()){
            return 1;
        
        }else if(this.getSuma() < otra.getSuma()){
            return 2;
            
        }else 
            return 0;
        
    
    }
    
    public void tirarOtraVez(){
        
        dado1.tirarDado();
        dado2.tirarDado();
        
    }
    
}
