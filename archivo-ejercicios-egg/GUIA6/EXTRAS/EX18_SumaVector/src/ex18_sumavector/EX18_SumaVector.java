/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex18_sumavector;

import java.util.Scanner;

/**
 *
 * @author GACUNA
 */
public class EX18_SumaVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         System.out.println("Ingrese el tamaño del vector");
         int largo = leer.nextInt();
         int valor;
         int suma = 0;
         int[] vector = new int[largo];
         for(int i = 0; i < largo; i++){
             System.out.println("Ingrese el valor " + i);
             valor = leer.nextInt();
             vector[i] = valor;
             suma = suma + valor;
         }
         System.out.println("La suma de los valores del vector es " + suma);
    }
    
}
