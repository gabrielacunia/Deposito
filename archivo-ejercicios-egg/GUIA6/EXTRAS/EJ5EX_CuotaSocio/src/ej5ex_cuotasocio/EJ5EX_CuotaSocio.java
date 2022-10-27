/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5ex_cuotasocio;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class EJ5EX_CuotaSocio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la clase de socio a calcular (A-B-C)");
        String clase = leer.nextLine();
        System.out.println("Ingrese el monto del tratamiento");
        double trat = leer.nextDouble();
        switch(clase){
            case "A": System.out.println("Su tratamiento tiene un descuento del 50%, el costo es "+ trat/2); 
            break;
            case "B": System.out.println("Su tratamiento tiene un descuento del 35%, el costo es "+ trat*0.65); 
            break;
            case "C": System.out.println("Su tratamiento no tiene descuento, el costo es "+ trat); 
            break; 
            default: System.out.println("Opcion Incorrecta");
        }
    }  
}
