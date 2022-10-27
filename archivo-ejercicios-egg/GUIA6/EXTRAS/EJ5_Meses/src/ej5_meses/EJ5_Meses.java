/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5_meses;

import java.util.Scanner;
import meses.Meses;

/**
 *
 * @author GACUNA
 */
public class EJ5_Meses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Meses m = new Meses();
        System.out.println("Adivine el mes secreto del año , escriba en minusculas");
        String mes = leer.next();
        while(!mes.equals(m.getMes())){
            System.out.println("No ha acertado, intente otra vez:");
            mes = leer.next();
        }
        System.out.println("Ha acertado!");
    }
    
}
