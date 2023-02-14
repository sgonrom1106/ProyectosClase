/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.politecnicomalaga.primomain;

import static java.lang.Math.sqrt;

/**
 *
 * @author seryi
 */
class Primo {
    
    private int [][] matriz1;
    private char [][] matriz2;
    
    public Primo(){
        
        matriz1 = new int [5][5];
        matriz2 = new char [5][5];
    }
    
    public void crearMatriz(){
        
        for(int i = 0; i < matriz1.length; i++){
            for(int j = 0; j < matriz1[i].length; j++){
                
                matriz1[i][j] = (int)(Math.random()*100) + 1;
                
                System.out.print(matriz1[i][j] + " ");
            
            }
         
            System.out.println("");
        }
        
    }
    
    public boolean esPrimo(int numero){
        
        if(numero == 1){
            return true;
        }
        
        int limite = (int) sqrt(numero);
        for(int i = 2; i <= limite; i++)
            if(numero % i == 0){
                return false;
                
            }
        
        return true;
        
    }
    
    public void crearMatrizPrimo(){
        
        for(int i = 0; i < matriz1.length; i++){
            for(int j = 0; j < matriz1[i].length; j++){
                
                if(esPrimo(matriz1[i][j])){
                    matriz2[i][j] = 'S';
                    
                }else
                    matriz2[i][j] = 'N';
                
                System.out.print(matriz2[i][j] + " ");
                
            }
            
            System.out.println("");
        }
        
    }
    
}
