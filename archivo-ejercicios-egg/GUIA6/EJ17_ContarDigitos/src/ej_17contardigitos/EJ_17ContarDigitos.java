/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_17contardigitos;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class EJ_17ContarDigitos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la longitud del vector:");
        int largo = leer.nextInt();
        int[] vector = new int[largo];
        int contA = 0;
        int contB = 0;
        int contC = 0;
        int contD = 0;
        
        String posiciones = "";
        for (int i = 0; i < largo; i++) {
            vector[i] = (int) (Math.random() * 10000);
            if (vector[i] < 10){
                contA++;
            }
            if (vector[i] < 100 && vector[i]>= 10){
                contB++;
            }
            if (vector[i] < 1000 && vector[i]>= 100){
                contC++;
            }
            if (vector[i] < 10000 && vector[i]>= 1000){
                contD++;
            }
        }
        System.out.println("La cantidad de numeros de una cifra es " + contA);
        System.out.println("La cantidad de numeros de dos cifras es " + contB);
        System.out.println("La cantidad de numeros de tres cifras es " + contC);
        System.out.println("La cantidad de numeros de cuatro cifras es " + contD);
    }

}
