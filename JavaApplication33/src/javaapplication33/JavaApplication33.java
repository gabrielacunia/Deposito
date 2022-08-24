/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej_GUIA6;

import java.util.Arrays;

/**
 *
 * @author EANDRADA
 */
public class EJ21_GUIA6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matrizM = new int[10][10];
        int[][] matrizP = new int[3][3];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrizM[i][j] = (int) (Math.random() * 2);
                System.out.print(" " + matrizM[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizP[i][j] = (int) (Math.random() * 2);
                System.out.print(" " + matrizP[i][j] + " ");
            }
            System.out.println("");
        }
        
                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {
                        if (matrizM[k][l] == matrizP[0][0]) {
                            comparar(matrizM, k, l, matrizP);
                            
                        }
                    }
                }
            

    }

    public static void comparar(int[][] matrizM, int k, int l, int[][] matrizP) {
        int lv = k + 3;
        int lh = l + 3;
        int ch = -1;
        int cv = -1;
        int [][] auxiliar3x3 = new int [3][3];  
        for (int a = k; a < lv; a++) {
            cv++;
            ch=-1;
            for (int b = l; b < lh; b++) {
                ch++;
                auxiliar3x3[cv][ch]= matrizM[a][b];
        }
        
    }
       
        //for (int m = 0; m < 3; m++) {
         //   System.out.println("");
         //   for (int n = 0; n < 3; n++) {
         //       System.out.print(auxiliar3x3[m][n]+"  ");
         //   }
        //}
     if(Arrays.deepEquals(auxiliar3x3,matrizP)){
         System.out.println(" ");
         System.out.println("La submatriz esta dentro de la matriz principal");
         System.out.println("La Submatriz se encuentra en las posiciones: ");
         for (int a = k; a < lv; a++) {
             System.out.println("");
            for (int b = l; b < lh; b++) {
                System.out.print(a+","+b+" ");
            }
        }
     }  
    }
}
