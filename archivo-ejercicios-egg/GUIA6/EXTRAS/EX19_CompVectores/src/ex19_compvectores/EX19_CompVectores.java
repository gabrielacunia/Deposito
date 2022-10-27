/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex19_compvectores;

import java.util.Scanner;

/**
 *
 * @author GACUNA
 */
public class EX19_CompVectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int[] vector = new int[3];
       int[] vector2 = new int[3];
       for(int i = 0; i < 3; i++){
           System.out.println("Ingrese valor " + i + " para vector");
           vector[i] = leer.nextInt();
           System.out.println("Ingrese valor " + i + " para vector2");
           vector2[i] = leer.nextInt();
       }
       boolean resultado = true;
       for(int i = 0; i < 3; i++){
           if(vector[i] != vector2[i]){
               resultado = false;
               break;
           }
       }
        System.out.println("La comparacion de igualdad resulto " + resultado);
    }
    
}
