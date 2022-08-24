/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3ex_detectarvocal;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class EJ3EX_DetectarVocal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Intrese una letra para saber si es vocal");
        String letra = leer.nextLine();
        if(letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I") || letra.equalsIgnoreCase("O") || letra.equalsIgnoreCase("U")){
            System.out.println("Es una vocal");    
        }else{
        System.out.println("No es una vocal");
    }
    }
    
}
