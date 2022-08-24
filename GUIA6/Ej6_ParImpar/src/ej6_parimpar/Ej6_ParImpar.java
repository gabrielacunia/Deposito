/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej6_parimpar;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Ej6_ParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero para saber si es par o impar:");
        int num = leer.nextInt();
        if (num%2 == 0){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }
             
    }
    
}
