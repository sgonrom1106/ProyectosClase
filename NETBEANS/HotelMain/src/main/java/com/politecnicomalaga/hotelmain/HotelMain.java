/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.politecnicomalaga.hotelmain;
import java.util.Scanner;

/**
 *
 * @author seryi
 */
public class HotelMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int menu;
        Cliente cliente;
        boolean salir = false;
        String DNI, nombre, apellidos, direccion, email, telefono, fechaNacimiento;
        
        
        do{
            
            System.out.println("Menú hotel Costa del Sol");
            System.out.println("1. Mostrar lista clientes");
            System.out.println("2. Registrar nuevo cliente");
            System.out.println("3. Eliminar cliente");
            System.out.println("4. Aplicar promoción (Sólo para clientes de entre 18 y 25 años)");
            System.out.println("0. Salir");
            menu = sc.nextInt();
            
            switch (menu){
                
                case 0:
                    
                    System.out.println("¡Hasta la próxima!");
                    salir = true;
                    
                    break;
                
                case 1:
                    
                    break;
                    
                case 2:
                    
                    System.out.println("Has seleccionado 'Registrar nuevo cliente'");
                    System.out.println("Introduzca el DNI del cliente: ");
                    DNI = sc.nextLine();                    
                    
                    System.out.println("Introduzca el nombre del cliente: ");
                    nombre = sc.nextLine();
                    
                    System.out.println("Introduzca los apellidos del cliente: ");
                    apellidos = sc.nextLine();
                    
                    System.out.println("Introduzca la direccion del cliente: ");
                    direccion = sc.nextLine();
                    
                    System.out.println("Introduzca el email del cliente: ");
                    email = sc.nextLine();
                    
                    System.out.println("Introduzca el telefono del cliente: ");
                    telefono = sc.nextLine();
                    
                    System.out.println("Introduzca la fecha de nacimiento del cliente (Formato: dd/MM/yyyy): ");
                    fechaNacimiento = sc.nextLine();
                                
                    break;
                    
                case 3:
                    
                    break;
                    
                case 4:
                    
                    break;
                    
                default:
                    
                    System.out.println("Número incorrecto, porfavor introduzca uno de los números que se muestra por pantalla");
                    
                    break;
                    
            }
            
        }while(!salir);
    }
}
