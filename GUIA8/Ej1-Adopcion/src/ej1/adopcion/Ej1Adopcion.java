/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1.adopcion;

import clasesEnum.PerroEnum;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import logica.Logica;
import objeto.Perro;
import objeto.Persona;

/**
 *
 * @author GACUNA
 */
public class Ej1Adopcion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        ArrayList<Persona> personas = new ArrayList();
        ArrayList<Perro> perros = new ArrayList();
        
        System.out.println("Ingrese la cantidad de personas y perros que desea crear");
        int cant = leer.nextInt();
        for (int i = 0; i < cant; i++) {
            System.out.println("Ingrese en orden, nombre de la persona, apellido, edad y DNI");
            String nombre = leer.next();
            String apellido = leer.next();
            int edad = leer.nextInt();
            int dni = leer.nextInt();
          personas.add(new Persona(nombre,apellido,edad,dni, null));
         System.out.println("Ingrese el nombre del perro:");
            String nombrep = leer.next();
            System.out.println("Elija la raza de perro disponible");
           System.out.println(Arrays.toString(PerroEnum.values()));
            String raza = leer.next();
            PerroEnum razap= PerroEnum.BEAGLE;
            switch(raza.toUpperCase()){
                case "DOGO": razap = PerroEnum.DOGO;
                break;
                case "BEAGLE": razap = PerroEnum.BEAGLE;
                break;
                case "SALCHICHA": razap = PerroEnum.SALCHICHA;
                break;
                case "COCKER": razap = PerroEnum.COCKER;
                break;
                case "LABRADOR": razap = PerroEnum.LABRADOR;
                break;
            }
            System.out.println("Ingrese la edad del perro)");
            int edadp = leer.nextInt();
            System.out.println("Ingrese el tamaño (chico, mediano,grande)");
            String tamanop = leer.next();
          perros.add(new Perro(nombrep,razap,edadp,tamanop)); 
        }
        
        
        Logica log1 = new Logica();
        personas = log1.asignarPerro(personas, perros);
        
        for (Persona per : personas) {
           System.out.println(per); 
        }
        
        
    }
    
}
