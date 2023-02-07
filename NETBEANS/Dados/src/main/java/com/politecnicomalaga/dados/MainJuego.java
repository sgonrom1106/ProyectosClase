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
        Tirada tirada1 = new Tirada();
        Tirada tirada2 = new Tirada();
        
        do{
            
        System.out.println("Bienvenido al juego de los dados.");
        System.out.println("Porfavor, eliga una de las siguientes opciones: ");
        System.out.println("1.Hacer tiradas.");
        System.out.println("2.Comprobar resultado.");
        System.out.println("3.Salir.");
        menu = teclado.nextInt();
        
        switch(menu){
            
            case 1:
                
                tirada1.tirarOtraVez();
                tirada2.tirarOtraVez();                
                System.out.println("Orden: el primer valor es del primer dado y el segundo del otro.");
                System.out.println("Tirada jugador 1: ");
                System.out.println(tirada1.getTirada());
                System.out.println("Tirada jugador 2: ");
                System.out.println(tirada2.getTirada());
                System.out.println("");
                break;
                
            case 2:
                
                System.out.println("Número de seis del jugador 1: " +tirada1.calcularSeis());
                System.out.println("Número de seis del jugador 2: " +tirada2.calcularSeis());
                tirada1.getSuma();
                tirada2.getSuma();
                System.out.println("1:Gana primer jugador; 2:Gana segundo jugador; 0:Empate");
                System.out.println(tirada1.getSuma());
                System.out.println(tirada2.getSuma());
                System.out.println(tirada1.HaGanado(tirada2));
                System.out.println("");
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
