/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej11_date;

import java.util.Date;
import java.util.Scanner;



/**
 *
 * @author GACUNA
 */
public class EJ11_Date {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Date fechaActual = new Date();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero de dia");
        int dia = leer.nextInt();
        System.out.println("Ingrese un numero de mes");
        int mes = leer.nextInt();
        System.out.println("Ingrese un numero de anio");
        int anio = leer.nextInt();
      Date fecha = new Date(anio,mes,dia);
        System.out.println(fecha.toString());
        System.out.println("Los años que pasaron de la fecha ingresada a la actualidad son: " + (fechaActual.getYear() - anio));      
    }    
}
