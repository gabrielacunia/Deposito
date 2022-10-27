/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej19_matrizantisimetrica;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class EJ19_MatrizAntiSimetrica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int[][] matriz = new int[3][3];
         int[][] matriz2 = new int[3][3];
         Scanner leer = new Scanner(System.in);
         System.out.println("Ingrese la primer matriz");
        for(int i=0; i < 3; i++ ){
            for(int j=0; j<3; j++ ){
                System.out.println("Ingresar valor " + i + ", " + j);
                matriz[i][j] = leer.nextInt();
            }
        }
           System.out.println("Ingrese la segunda matriz");
        for(int i=0; i < 3; i++ ){
            for(int j=0; j<3; j++ ){
                System.out.println("Ingresar valor " + i + ", " + j);
                matriz2[i][j] = leer.nextInt();
            }
        }
        boolean resultado = true;
          for(int i=0; i < 3; i++ ){
            for(int j=0; j<3; j++ ){
                if (matriz[i][j]!= -(matriz[j][i]) ){
                  resultado = false;  
                }
            }
        }
          System.out.println("El analisis de anti simetria es " + resultado);
    }   
}
