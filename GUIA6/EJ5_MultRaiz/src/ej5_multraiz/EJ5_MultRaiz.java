/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5_multraiz;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class EJ5_MultRaiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero a procesar:");
        int num = leer.nextInt();
        int doble = num *2;
        int triple = num *3;
        double raiz = Math.sqrt(num);
        System.out.println("El doble del numero ingresado es " + doble + ". El triple es " + triple + " y la raiz es " + raiz);
    }
    
}
