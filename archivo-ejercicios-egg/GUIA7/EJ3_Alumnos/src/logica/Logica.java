/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import alumno.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author GACUNA
 */
public class Logica {

    Scanner leer = new Scanner(System.in);
    ArrayList<Alumno> Alumnos = new ArrayList();

    public void crearAlumno() {
        String respuesta;
        do {
            System.out.println("Desea agregar un alumno?");
            respuesta = leer.next();
            if(respuesta.equalsIgnoreCase("s")){
                System.out.println("Ingrese el nombre de alumno");
                String nombre = leer.next();
                System.out.println("Ingrese las 3 notas del alumno:");
                ArrayList<Integer> nota = new ArrayList();
                nota.add(leer.nextInt());
                nota.add(leer.nextInt());
                nota.add(leer.nextInt());
              Alumnos.add(new Alumno(nombre,nota));
            }
            System.out.println(Alumnos.toString());
        } while (respuesta.equals("s"));

    }
    public void buscarAlumno(){
        ArrayList<Integer> tresNotas = new ArrayList();
        System.out.println("Ingrese el nombre del alumno a promediar notas");
        String alumno1 = leer.next();
        for (int i = 0; i < Alumnos.size(); i++) {
            Alumno al = Alumnos.get(i);
            if(al.getNombre().equalsIgnoreCase(alumno1)){
              tresNotas = al.getNotas();
            }
        }
        int sumaNotas=0;
        for (int i = 0; i < tresNotas.size(); i++) {
            sumaNotas = sumaNotas + tresNotas.get(i);
        }
        System.out.println("El promedio de notas del alumno " + alumno1 + " es: "+ sumaNotas/tresNotas.size());
        }
}
    

