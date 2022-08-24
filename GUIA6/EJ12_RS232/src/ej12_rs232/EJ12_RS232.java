/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej12_rs232;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class EJ12_RS232 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String linea = "";
        int contA = 0;
        int contB = 0;
        
        while (!linea.equals("&&&&&")){
        System.out.println("Ingrese una linea de codigo:");
        linea = leer.nextLine();
        if (linea.substring(0,1).equals("X") && linea.substring(4,5).equals("O") && linea.length() == 5){
        contA ++;
        }else{
        contB ++;
        }
        
    }
    System.out.println("Programa finalizado");
    System.out.println("Contador de lineas correctas: " + contA);
    System.out.println("Contador de lineas incorrectas: " + contB);
}
}
