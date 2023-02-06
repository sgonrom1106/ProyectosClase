/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.politecnicomalaga.matrizcolumna;

/**
 *
 * @author seryi
 */
public class Columna {
    
    private int [][] matriz;
    private int [] columna;
    private int N = (int)(Math.random()*2) + 1;
    private int M = (int)(Math.random()*2) + 1;
    
    public Columna(){
        
        matriz = new int [N][M];
        columna = new int [N];
        
    }
    
    public void crearMatriz(){
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                
                matriz[i][j] = (int)(Math.random()*2) + 1;
                
                System.out.print(matriz[i][j] + " ");
                
            }
            
            System.out.println("");
        }
        
    }
    
    public void crearColumna(){
        
        for(int i = 0; i < columna.length; i++){
                
              columna[i]= (int)(Math.random()*3) + 1;
                
              System.out.print(columna[i] + " ");
                
            System.out.println("");
        }
        
    }
    
    public int comprobarColumna(int [][] matriz, int [] columna){
        
        boolean diferente;
        
        for(int j = 0; j < matriz[0].length; j++){ 
            
            diferente = false;
            
            for(int i = 0; i < matriz.length; i++){
               
                    if(matriz[i][j] != columna[i]){
                        diferente = true;
                    } 
                
            }
            
            if(!diferente){
                return j + 1;
            }
        }   

        return -1;
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public int[] getColumna() {
        return columna;
    }
    
    
    
}
