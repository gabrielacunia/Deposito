/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej7_eureka;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class EJ7_Eureka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String palabra = leer.nextLine();
        String palabra1 = "eureka";
        if(palabra.equals(palabra1)){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
              
    }
    
}
