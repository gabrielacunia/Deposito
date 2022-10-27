/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_10valortope;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class EJ_10ValorTope {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero tope:");
        int tope = leer.nextInt();
        int Suma = 0;
        while(Suma < tope) {
            System.out.println("Ingrese un valor a sumar:");
            int num = leer.nextInt();
            Suma = Suma + num;
        }
        System.out.println("Se ha alcanzado el valor tope");
    }
    
}
