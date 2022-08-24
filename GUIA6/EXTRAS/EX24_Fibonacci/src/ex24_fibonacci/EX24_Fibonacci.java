/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex24_fibonacci;

import java.util.Scanner;

/**
 *
 * @author GACUNA
 */
public class EX24_Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
      
         System.out.println("Ingrese el largo del vector");
         int largo = leer.nextInt();
         int[] vector = new int[largo];
         int a = 1;
         int b = 1;
         int c = 0;
         int d = 0;
         vector = fibonacci(largo, a,b,c,d);
         for(int i =0; i<largo; i++){
             System.out.print(vector[i] + " ");
         }
    }
   
    public static int[]  fibonacci(int tope, int a, int b, int c, int d){
        int[] resultado = new int[tope];
       resultado[0] = a;
       resultado[1] = b;
       for(int i = 0; i < tope-2; i++){  
		c = a + b;
		d = a;
		a = b;
		b = c;
		resultado[i+2] = c;
                }
        return resultado;
    }
}
