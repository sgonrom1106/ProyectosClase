/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.politecnicomalaga.subarray;

/**
 *
 * @author seryi
 */
public class Array {
    
    private int [] array;
    private int tamaño;
    
    public Array(){
        
        array = new int [tamaño];
        
    }
    
    public void crearVector(){
        
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i] + " ");
            
            System.out.println("");
        }
        
    }
    
}
