/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.politecnicomalaga.arrayprimo;

/**
 *
 * @author seryi
 */
public class Primo {
    
    int [][] matriz;
    int [][] matrizOrdenada;
    
    public Primo(){
        
        matriz = new int [2][10];
        matrizOrdenada= new int [2][10];
        
    }
    
    public void crearMatrices(){
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                
                matriz[0][j] = j;
                matriz[1][j] = (int)(Math.random()*10) + 1;
                System.out.print(matriz[i][j] +  " ");
                
            }
            
            System.out.println("");
        }
        
        System.out.println("Array Inicial");
        System.out.println("-------------------");
        
    }
    
    public boolean esPrimo(int numero){
        
        if(numero == 1){
            return true;
        }
        
        int limite = (int) Math.sqrt(numero);
        
        for(int i = 2; i < limite; i++){
            if(numero % i == 0){
                return false;
            }
        }
        
        return true;
                
    }
    
    public void crearMatrizOrdenada(){
        
        for(int i = 0; i < matrizOrdenada.length; i++){
            for(int j = 0; j < matrizOrdenada[i].length; j++){
                
                matrizOrdenada[0][j] = j;
                matrizOrdenada[1][j] =(int)(Math.random()*10) + 1;
                System.out.print(matrizOrdenada[i][j] + " ");
                
                if(esPrimo(matriz[1][j])){
                    for (int k = 0; k < matrizOrdenada.length - 1; k++) {
                        int aux = matrizOrdenada[1+i];
                        matrizOrdenada[1+i] = matrizOrdenada[0];
                        matrizOrdenada[0]= aux;  
}
                    
                
            }
            
            System.out.println("");
        }
        
        System.out.println("Array Final");
                
        }
        
    }
    
}
