/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej8_palabra8largo;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class EJ8_Palabra8largo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra de 8 caracteres:");
        String palabra = leer.nextLine();
        if(palabra.length() == 8){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
        
    }
    
}
