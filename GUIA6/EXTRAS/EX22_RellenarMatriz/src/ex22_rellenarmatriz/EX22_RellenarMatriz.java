/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex22_rellenarmatriz;

import java.util.Scanner;

/**
 *
 * @author GACUNA
 */
public class EX22_RellenarMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese las medidas le la matriz: altura-longitud");
        int alt = leer.nextInt();
        int lar = leer.nextInt();
        int[][] matriz = new int[alt][lar];
        int suma = 0;
        for(int i = 0; i<alt; i++){
            for(int j = 0; j<lar; j++){
                matriz[i][j] = (int)(Math.random()*10);
                suma = suma + matriz[i][j];
            }
        }
        System.out.println("La matriz generada es:");
        for(int i = 0; i<alt; i++){
            for(int j = 0; j<lar; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("La suma de los componentes es " + suma);
    }
    
}
