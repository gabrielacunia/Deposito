/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej13_cuadradodeasteriscos;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class EJ13_CuadradoDeAsteriscos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la medida del lado del cuadrado");
        int lado = leer.nextInt();
        for (int i=0 ; i < lado; i++){
             for (int j=0 ; j < lado; j++){
            if(j==0 || i==0 || j == lado-1 || i == lado -1){
                System.out.print("* ");
            }else{
                System.out.print("  ");
            }     
        }
            System.out.println("");
        }
    }   
}
