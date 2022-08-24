/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex8_cantnum;

import java.util.Scanner;

/**
 *
 * @author GACUNA
 */
public class EX8_CantNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         int num;
         int cont = 0;
         int contP = 0;
         int contI = 0;
         do {
             System.out.println("Ingrese un numero entero");
             num = leer.nextInt();
         if(num >= 0){
             cont++;
             if(num%2==0){
                 contP++;
             }else{
                 contI++;
             }
         }   
    }while(num%5!=0);
         System.out.println("La cantidad de numeros ingresados es "+ cont );
         System.out.println("La cantidad de numeros pares es "+ contP );
         System.out.println("La cantidad de numeros impares es "+ contI );
    }   
}
