/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1_sumaenteros;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class EJ1_SumaEnteros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese dos numeros enteros para sumar:");
        Scanner leer = new Scanner(System.in);
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int resultado = num1 + num2;
        System.out.println("La suma de los numeros ingresados es : " + resultado);
        
    }
    
}
