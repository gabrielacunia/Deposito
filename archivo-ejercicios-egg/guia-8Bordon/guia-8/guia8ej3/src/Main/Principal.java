/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidad.Alumno;
import Entidad.Menu;
import Servicio.ServicioAlumno;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

/**
 *
 * @author Pablo
 */
public class Principal {
    
    public static void main(String [] args){
    
    List<Alumno> alumnos = new ArrayList();
    Scanner leer = new Scanner(System.in);
    ServicioAlumno sa = new ServicioAlumno();
    Menu menu = new Menu();
    Alumno alumno = new Alumno();
    int opcion;
    
    do
    {
        menu.imprimirMenu();
        System.out.println("Seleccione la opción");
        opcion = leer.nextInt();
        if(opcion == 1) alumnos.add(sa.crearAlumno());
        if(opcion == 2) sa.mostrarAlumnos(alumnos);
        if(opcion == 3) {
            System.out.println("Alumno a borrar?");
            String nombre = leer.next();
            sa.iteratorAlumnos(nombre,alumnos);
        }
        if(opcion == 4) sa.notaFinal(alumnos);
        if(opcion == 5) break;
    
    }while(opcion != 5);
    
    }
    
}
