/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.util.Scanner;

/**
 *
 * @author GACUNA
 */
public class PRUEBAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String sexo = "A";
        while(sexo != "O" && sexo != "F" && sexo != "M") {
            System.out.println("Ingrese el sexo de la persona");
            sexo = leer.next();
            System.out.println(sexo);
        }
    }
    
}
