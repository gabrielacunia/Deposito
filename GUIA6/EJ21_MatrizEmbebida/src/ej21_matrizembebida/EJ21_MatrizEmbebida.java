/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej21_matrizembebida;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class EJ21_MatrizEmbebida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int[][] matriz10 = new int[10][10];
        int[][] matriz3 = new int[3][3];
        int difi = 0;
        int difj = 0;
        int cont = 0;
        int x = 0;
        int y = 0;
        boolean stat = false;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la primer matriz");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("Ingresar valor " + i + ", " + j);
                matriz10[i][j] = leer.nextInt();
            }
        }
        System.out.println("Ingrese la segunda matriz");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingresar valor " + i + ", " + j);
                matriz3[i][j] = leer.nextInt();
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (matriz3[0][0] == matriz10[i][j]) {
                    difi = i;
                    difj = j;
                    for (int h = 0; h < 3; h++) {
                        for (int b =0; b < 3; b++) {
                            if (matriz3[h][b] == matriz10[h+difi][b+difj]) {
                               cont++;
                            }
                        }
                    }
                    if(cont == 9){
                        stat = true;
                         x = difi;
                         y = difj;
                    }
                    cont = 0;
                }
            }
            
        }
        if (stat == true) {
                System.out.println("Se encontro matriz embebida, ubicacion [" + x + "] [" + y + "]");
            } else {
                System.out.println("No se encontro matriz embebida");
            }
    }
}
