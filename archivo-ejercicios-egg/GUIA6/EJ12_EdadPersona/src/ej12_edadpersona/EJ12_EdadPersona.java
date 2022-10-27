/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej12_edadpersona;

import java.util.Scanner;
import persona.Persona;

/**
 *
 * @author GACUNA
 */
public class EJ12_EdadPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Persona p1 = new Persona();
        p1.crearPersona();
        p1.calcularEdad();
        System.out.println("Ingrese la edad de la persona a comparar: ");
        int edad = leer.nextInt();
        System.out.println("La comparacion si la primer persona es menor arroja : " + p1.menorQue(edad));
        p1.mostrarPersona();
    }
    
}
