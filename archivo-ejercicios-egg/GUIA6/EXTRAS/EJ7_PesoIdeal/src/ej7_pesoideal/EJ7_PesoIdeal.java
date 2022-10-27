/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej7_pesoideal;

import calculo.Calculo;
import java.util.Scanner;
import persona.Persona;
import promedios.Promedios;

/**
 *
 * @author GACUNA
 */
public class EJ7_PesoIdeal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Calculo c1 = new Calculo();
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();
        Persona p4 = new Persona();
        c1.crearPersona(p1);
        c1.crearPersona(p2);
        c1.crearPersona(p3);
        c1.crearPersona(p4);
        System.out.println(p1.getNombre() + " tiene un calculo de peso de " + c1.calcularPeso(p1) + ". Mayor de edad > " + c1.mayorEdad(p1));
        System.out.println(p2.getNombre() + " tiene un calculo de peso de " + c1.calcularPeso(p2) + ". Mayor de edad > " + c1.mayorEdad(p2));
        System.out.println(p3.getNombre() + " tiene un calculo de peso de " + c1.calcularPeso(p3) + ". Mayor de edad > " + c1.mayorEdad(p3));
        System.out.println(p4.getNombre() + " tiene un calculo de peso de " + c1.calcularPeso(p4) + ". Mayor de edad > " + c1.mayorEdad(p4));
        c1.Resultados();
        
    }    
}
