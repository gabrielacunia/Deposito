/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej14_conversormoneda;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class EJ14_ConversorMoneda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de euros a convertir");
        int euros = leer.nextInt();
        System.out.println("Ingrese la moneda a la que desea convertirlos (yenes, libras, dolares)");
        String moneda = leer.nextLine();
        moneda = leer.nextLine();
        double retorno = Convertir(euros, moneda);
        System.out.println("La conversion arroja "+ retorno + " " + moneda);
    }  
public static double Convertir(int euros, String moneda){
    double resultado = 0;
    switch(moneda){
        case "dolares": 
             resultado = euros * 1.28611; 
        break;
        case "libras": 
            resultado = euros * 0.86;
        break;
        case "yenes": 
            resultado = euros * 129.852;
        break;
    }
return resultado;
}
}
