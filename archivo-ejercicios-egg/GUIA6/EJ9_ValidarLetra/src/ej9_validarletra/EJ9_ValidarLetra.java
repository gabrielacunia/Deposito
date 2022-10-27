/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej9_validarletra;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class EJ9_ValidarLetra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra a validar");
        String palabra = leer.nextLine();
        String letra = "A";
        if(palabra.substring(0,1).equals(letra)){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
        
    }
    
}
