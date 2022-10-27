/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1_cancion;

import cancion.Cancion;
import java.util.Scanner;
import logica.Logica;

/**
 *
 * @author GACUNA
 */
public class EJ1_Cancion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cancion cancion1 = new Cancion();
        Logica logi1 = new Logica();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el autor de la cancion");
        String autor = leer.next();
        System.out.println("Ingrese el titulo de la cancion");
        String titulo = leer.next();
        logi1.setearCancion(cancion1, autor, titulo);
        System.out.println(logi1.mostrarCancion(cancion1));
    }

}
