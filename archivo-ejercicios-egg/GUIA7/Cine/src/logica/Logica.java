/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import pelicula.Pelicula;

/**
 *
 * @author GACUNA
 */
public class Logica {
    ArrayList<Pelicula> pelis = new ArrayList();
    Scanner leer = new Scanner(System.in);
    
    public void crearPelicula(){
        String respuesta = "s";
        while(respuesta.equalsIgnoreCase("s")){
            System.out.println("Desea agregar una pelicula?");
            respuesta = leer.next();
            if(respuesta.equalsIgnoreCase("n")){
                break;
            }
            System.out.println("Ingrese el nombre de la pelicula");
            String nombre = leer.next();
            System.out.println("Ingrese el director de la pelicula");
            String director = leer.next();
            System.out.println("Ingrese la duracion de la pelicula");
            Integer duracion = leer.nextInt();
            pelis.add(new Pelicula(nombre, director, duracion));
        }
    }

    public void mostrarPeliculas() {
        System.out.println(pelis.toString()); 
    }

    public void ordenarDuracion() {
        System.out.println("Desea la comparacion de duracion en orden ascendente? s/n");
        if(leer.next().equalsIgnoreCase("s")){
            pelis.sort(Pelicula.compararDuracion);   
        }else{
          pelis.sort(Pelicula.compararDuracionRev);
           
        }
        mostrarPeliculas();
    }

    public void ordenarTitulo() {
        pelis.sort(Pelicula.compararTitulo);
        mostrarPeliculas();
    }

    public void ordenarDirector() {
        pelis.sort(Pelicula.compararDirector);
        mostrarPeliculas();
    }
    
    public void mostrarPelisLargas(){
        ArrayList<Pelicula> pelisLargas = new ArrayList();
        for (int i = 0; i < pelis.size(); i++) {
        Pelicula p1 = pelis.get(i);
        if(p1.getDuracion() > 1)
            pelisLargas.add(p1);   
        }
        System.out.println(pelisLargas.toString());
    }
}
