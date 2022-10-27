/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex15_operacionesdosnum;

import java.util.Scanner;

/**
 *
 * @author GACUNA
 */
public class EX15_OperacionesDosNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros para operar:");
        int num = leer.nextInt();
        int num2 = leer.nextInt();
        System.out.println("Elija la operacion: 1-Suma 2-Resta 3-Multiplicar 4-Dividir");
        int opcion = leer.nextInt();
        switch(opcion){
            case 1: System.out.println("El resultado de la suma es " + suma(num,num2));
            break;
            case 2: System.out.println("El resultado de la suma es " + resta(num,num2));
            break;
            case 3: System.out.println("El resultado de la suma es " + mult(num,num2));
            break;
            case 4: System.out.println("El resultado de la suma es " + div(num,num2));
            break;
            default: System.out.println("La opcion ingresada es incorrecta");
        }
      
    }
      public static int suma(int a, int b){
            int resultado = a + b;
            return resultado;
        }
        public static int resta(int a, int b){
            int resultado = a - b;
            return resultado;
        }
          public static int mult(int a, int b){
            int resultado = a * b;
            return resultado;
        }
            public static double div(int a, int b){
            double resultado = (double)a / b;
            return resultado;
        }
}
