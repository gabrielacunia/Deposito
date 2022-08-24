/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej10ex_multiplicacion;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class EJ10EX_Multiplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int valor1 = (int)(Math.random()*11);
       int valor2 = (int)(Math.random()*11);
       int resultado = valor1 * valor2;
       int intentos = 1;
       while(intentos < 5){
           System.out.println("Juegue y gane! arriesgue un numero");
           int num = leer.nextInt();
           if(num == resultado){
               System.out.println("Ha acertado!!!");
               break;
           }
           intentos++;
       }
       if(intentos == 5){
          System.out.println("No has acertado");  
       }   
    } 
}
