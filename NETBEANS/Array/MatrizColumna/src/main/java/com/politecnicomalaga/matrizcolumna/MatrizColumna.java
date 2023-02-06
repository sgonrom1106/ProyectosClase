/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.politecnicomalaga.matrizcolumna;

/**
 *
 * @author seryi
 */
public class MatrizColumna {

    public static void main(String[] args) {
        
        Columna columnaM = new Columna();
        int indice;       
        
        columnaM.crearMatriz();
        System.out.println("-----------");
        columnaM.crearColumna();
        System.out.println("");
        System.out.println("Índice:");
        indice = columnaM.comprobarColumna(columnaM.getMatriz(), columnaM.getColumna());
        
        if(indice == -1){
            System.out.println("No coincide ninguna columna con el vector.");
            
        }else{
            System.out.println("Coincide con la columna " +indice);
        }
    }
}
