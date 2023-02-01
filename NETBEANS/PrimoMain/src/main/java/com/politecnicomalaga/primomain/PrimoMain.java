/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.politecnicomalaga.primomain;

import java.util.Scanner;

/**
 *
 * @author seryi
 */
public class PrimoMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Primo primo = new Primo();
        primo.crearMatriz();
        System.out.println("-----------");
        primo.crearMatrizPrimo();
        
    }
}
