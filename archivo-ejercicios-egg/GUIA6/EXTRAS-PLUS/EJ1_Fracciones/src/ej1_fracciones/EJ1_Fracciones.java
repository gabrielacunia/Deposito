/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1_fracciones;

import java.util.Scanner;
import logica.Logica;

/**
 *
 * @author GACUNA
 */
public class EJ1_Fracciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Logica log1 = new Logica();
        Scanner leer = new Scanner(System.in);
       int opcion = 0;
       System.out.println("Ingrese los valores de las fracciones:");
            System.out.println("Ingrese el primer numerador");
            int a = leer.nextInt();
            System.out.println("Ingrese el primer denominador");
            int b = leer.nextInt();
           System.out.println("Ingrese el segundo numerador");
           int c = leer.nextInt();
           System.out.println("Ingrese el segundo denominador");
           int d = leer.nextInt();
           log1.setearFracciones(a, b, c, d);
       do{
           System.out.println("Ingrese una operacion");
           System.out.println("1- Sumar");
           System.out.println("2- Restar");
           System.out.println("3- Multiplicar");
           System.out.println("4- Dividir");
           System.out.println("5- Salir");
           opcion = leer.nextInt();
           switch (opcion){
               case 1: System.out.println("El resultado de la suma es " + log1.sumar());
               break;
               case 2: System.out.println("El resultado de la resta es " + log1.restar());
                   break;
               case 3: System.out.println("El resultado de la multiplicacion es " + log1.multiplicar());
                   break;
               case 4: System.out.println("El resultado de la division es " + log1.dividir());
                   break;
               case 5: System.out.println("Programa terminado");
               break;
               default: System.out.println("La opcion no es correcta");
           } 
           }
           while (opcion != 5);
    
}
}
