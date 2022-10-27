/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Alumno;
import static Utilidades.Comparadores.ordenarPorNombreDesc;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 * @author Pablo
 */
public class ServicioAlumno {
    
    Scanner leer = new Scanner(System.in);
    List<Integer> notas;
    List<Alumno> alumnos;
    
    public void listaAlumnos(){
        this.alumnos = new ArrayList();
    }
    
    public Alumno crearAlumno(){
        notas = new ArrayList();
        System.out.println("Nombre?");
        String nombre = leer.next();
        
        for (int i = 0; i < 3; i++) {
            int j= i+1;
            System.out.println("Nota " + j + "?");
            int nota = leer.nextInt();
            notas.add(nota);    
        }
        
        return new Alumno(nombre,notas);
    }
    
    public void cargarAlumno(Alumno alumno){
        alumnos.add(alumno);
    }
    
    public void mostrarAlumnos(List<Alumno> alumnos){
        
        if (alumnos.isEmpty()) {
            System.out.println("No hay alumnos para mostrar");
        }
        else
        {
            System.out.println("");
            System.out.println("Los alumnos cargados son: ");
            for (Alumno al: alumnos) {
                System.out.println("Alumno " + al.getNombre());
                System.out.println("Notas: " + al.getNotas());
            }
        }
        
    }
    
    public void notaFinal(List<Alumno> alumnos){
        System.out.println("Nombre?");
        String nombre = leer.next();
        Iterator<Alumno> it = alumnos.iterator();
        
        double acm = 0;int cnt=0;
        while (it.hasNext()) {
            Alumno aux = it.next();
            if (aux.getNombre().equals(nombre)) {
                
                for (int nota: notas) 
                {
                    acm += (double) nota;
                    cnt++;
                }
            }
        }
        System.out.println("El promedio de las notas es " + (acm/cnt));
    }
    
    public void iteratorAlumnos(String alumno,List<Alumno> alumnos){
        System.out.println("");
        Iterator<Alumno> it = alumnos.iterator();
        while (it.hasNext()) {
            Alumno aux = it.next();
            System.out.println("en el iterator " + aux.getNombre());
            if (aux.getNombre().equals(alumno)) {
                it.remove();
            }
            else
            {
                System.out.println("Alumno no existe");
            }
        }
        Collections.sort(alumnos,ordenarPorNombreDesc);
        alumnos.forEach((var) -> System.out.println("Alumno: " + var.getNombre() + "Notas: " + var.getNotas()));
    }
}
