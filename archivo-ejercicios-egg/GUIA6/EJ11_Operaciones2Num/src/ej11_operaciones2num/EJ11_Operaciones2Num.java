/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej11_operaciones2num;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class EJ11_Operaciones2Num {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero a procesar:");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el siguiente numero a procesar:");
        int num2 = leer.nextInt();
        String salir = "";
        String letra = "S";
        while(!salir.equals(letra)) {
        System.out.println("Seleccione una opcion:");
        System.out.println("MENU");
        System.out.println("1 - Sumar");
        System.out.println("2 - Restar");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("5 - Salir");
        int operacion = leer.nextInt();
        
        switch(operacion){
           case 1: System.out.println("El resultado de la suma es " + (num1 + num2));
           break;
           case 2: System.out.println("El resultado de la resta es " + (num1 - num2));
           break;
           case 3: System.out.println("El resultado de la multiplicacion es " + (num1 * num2));
           break;
           case 4: System.out.println("El resultado de la division es " + (num1 / num2));
           break;
           case 5: System.out.println("Esta seguro que desea salir? S/N");
           salir = leer.nextLine();
           salir = leer.nextLine();
           break;
        }
            System.out.println("Programa terminado");
        }
    }
    
}
