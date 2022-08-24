/*
 Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package ej1ex_minutos;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class EJ1EX_Minutos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         System.out.println("Ingrese la cantidad de minutos a procesar");
         int minutos = leer.nextInt();
         int horas = 0;
         int dias = 0;
         if(minutos >= 1440){
         horas = (minutos%1440)/60;    
         dias = minutos /1440;
         }
         System.out.println("El tiempo declarado en dias, horas y minutos es:");
         System.out.println(dias + " dias");
         System.out.println(horas + " horas");
         }
         
    }
    

