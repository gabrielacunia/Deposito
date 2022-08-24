/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej6_nexpresso;

import cafetera.cafetera;
import java.util.Scanner;
import logica.logica;

/**
 *
 * @author GACUNA
 */
public class EJ6_Nexpresso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        logica c1 = new logica();
        cafetera c2 = new cafetera();
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 5) {
            System.out.println("Ingrese la opcion deseada: ");
            System.out.println("1 - Llenar cafetera");
            System.out.println("2 - Agregar cafe");
            System.out.println("3 - Servir taza");
            System.out.println("4 - Vaciar cafetera");
            System.out.println("5 - Salir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    c1.llenarCafetera(c2);
                    break;
                case 2:
                    c1.agregarCafe(c2);
                    break;
                case 3:
                    c1.servirTaza(c2);
                    break;
                case 4:
                    c1.vaciarCafetera(c2);
                    break;
                default:
                    System.out.println("La opcion es incorrecta");
            }
        }
        System.out.println("Programa finalizado");
    }

}
