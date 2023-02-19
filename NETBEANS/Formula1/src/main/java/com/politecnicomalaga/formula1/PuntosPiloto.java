/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.politecnicomalaga.formula1;

/**
 *
 * @author seryi
 */
public class PuntosPiloto {
    
    int [][] piloto;
    boolean [][] boolPiloto;

    public PuntosPiloto(){
        
        piloto = new int [6][3];
        boolPiloto = new boolean [6][3];
        
    }
    
    public void crearMatrizPiloto(){
        
        for(int i = 0; i < piloto.length; i++){
            for(int j = 0; j < piloto[i].length; j++){
                piloto[i][j] = 0;
                
                System.out.print(piloto[i][j] + " ");
            }
            
            System.out.println("");
        }
        
    }
    
    public void crearMatrizBooleana(){
        
        int piloto = (int)(Math.random()*6) + 1;
        
        for(int i = 0; i < piloto.length; i++){
            for(int j = 0; j < piloto[i].length; j++){
                System.out.print(boolPiloto[i][j] + " ");
                
                
            }
            
            System.out.println("");
        }
        
    }
    
}
