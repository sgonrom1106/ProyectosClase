/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.politecnicomalaga.dados;
import java.util.Scanner;

/**
 *
 * @author seryi
 */
public class MainJuego {

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
                
                System.out.println("Orden: el primer valor es del primer dado y el segundo del otro.");
                System.out.println("Primera tirada: ");
                System.out.println(tirada.getTirada());
                System.out.println("Segunda tirada: ");
                tirada.tirarOtraVez();
                System.out.println(tirada.getTirada());
                break;
                
            case 2:
                
                System.out.println("Número de seis: " +tirada.calcularSeis());                
                tirada.getSuma();
                System.out.println("1:Gana primer jugador; 2:Gana segundo jugador; 0:Empate");
                System.out.println(tirada.HaGanado(tirada));
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
