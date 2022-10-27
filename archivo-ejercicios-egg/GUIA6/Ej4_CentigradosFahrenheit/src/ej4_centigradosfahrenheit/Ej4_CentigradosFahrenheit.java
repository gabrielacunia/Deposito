/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4_centigradosfahrenheit;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Ej4_CentigradosFahrenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los grados Centigrados a convertir:");
        double grados = leer.nextInt();
        double Fahr = 32 + (9*grados/5);
        System.out.println("La conversion a Fahrenheit es: " + Fahr);
    }
    
}
