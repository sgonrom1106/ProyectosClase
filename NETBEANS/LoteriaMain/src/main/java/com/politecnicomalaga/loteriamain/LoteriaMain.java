/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.politecnicomalaga.loteriamain;

import java.util.Scanner;

/**
 *
 * @author seryi
 */
public class LoteriaMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int [] boleto = new int [6];
        Loteria ganadora = new Loteria();
        
        /*System.out.println("Bienvenido a la lotería de Montepinar");
        System.out.println("Antes de comenzar, recuerda que los números de su boleto deben de estar en el intervalo [1,49]");
        System.out.println("Escriba su boleto para comprobar si es el ganador de un llavero de Mariscos Recio, el mar al mejor precio");
        for(int i = 0; i < boleto.length; i++){
            System.out.printf("Introduzca el número de su boleto que está en la pocisión " +(i+1)+ " : ");
            boleto[i] = sc.nextInt();
            
        }
        
        for(int i = 0; i < boleto.length; i++){
            System.out.println(boleto[i]);
            
        }*/
        
        boolean salir = false; 
        
        do{
         
        ganadora.ganadora();
        ganadora.verGanadora();
        System.out.println("----------");
        
        }while(!salir);
        
    }
}
