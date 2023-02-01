/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.politecnicomalaga.dados;
import java.util.Scanner;

/**
 *
 * @author seryi
 */
public class MainDado {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int menu;
        boolean salir = false;
        Tirada tirada = new Tirada();
        
        
        do{
            
        System.out.println("Bienvenido al juego de los dados.");
        System.out.println("Porfavor, eliga una de las siguientes opciones: ");
        System.out.println("1.Hacer tiradas.");
        System.out.println("2.Comprobar resultado.");
        System.out.println("3.Salir.");
        menu = teclado.nextInt();
        
        switch(menu){
            
            case 1:
                
                System.out.println("Primera tirada: ");
                tirada.getTirada();
                break;
                
            case 2:
                
                tirada.calcularSeis();
                tirada.getSuma();
                tirada.HaGanado(tirada);
                break;
                
            case 3:
                
                salir = true;
                break;           
                
            default:
                
                System.out.println("Porfavor, eliga uno de los números.");
                System.out.println("");
                break;
        }
        
        }while(!salir);
    }
}
