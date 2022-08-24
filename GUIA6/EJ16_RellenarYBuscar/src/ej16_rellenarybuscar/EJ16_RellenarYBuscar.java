/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej16_rellenarybuscar;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class EJ16_RellenarYBuscar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la longitud del vector:");
        int largo = leer.nextInt();
        int[] vector = new int[largo];
        String posiciones = "";
for(int i = 0; i < largo; i++){
    vector[i] = (int)(Math.random()*10);
}
        System.out.println("Ingrese el numero que desea rastrear:");
        int busqueda = leer.nextInt();
        int cont = 0;
for(int i = 0; i < largo; i++){
    if(busqueda == vector[i]){
       cont++;
       posiciones = posiciones + i + " ";
       
    }
}
System.out.println("El vector generado es:");
for(int i = 0; i < largo; i++){
        System.out.print(vector[i] + " ");
    }
    
        System.out.println("El numero solicitado fue encontrado " + cont + " veces.");
        System.out.println("La/s posiciones vinculada/s: " + posiciones);
    }
}
