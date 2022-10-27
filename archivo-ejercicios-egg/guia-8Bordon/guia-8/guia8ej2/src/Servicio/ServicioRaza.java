/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Raza;
import static Utilidades.Comparador.ordenarPorNombreDesc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class ServicioRaza {
    
    private Scanner leer;
    private List<Raza> razas;
    
    public ServicioRaza(){
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.razas = new ArrayList();
    }
    
    public Raza crearMascota(){
        System.out.println("Nombre de la raza?");
        String nombre = leer.nextLine();
        System.out.println("Tamaño?");
        String tamanio = leer.nextLine();
        return new Raza(nombre,tamanio);
    }
    
    public void agregarMascota(Raza raza){
        razas.add(raza);
    }
    
    public void mostrarRazas(){
        if (razas.isEmpty()) {
            System.out.println("No hay razas para mostrar");
        }
        else
        {
            System.out.println("");
            System.out.println("Las razas cargadas son: ");
            for (Raza var: razas) {
                System.out.println("Raza " + var.getNombre() + " de tamaño " + var.getTamanio());
            }
        }
    }
    
    public void iteratorRazas(String raza){
        System.out.println("");
        Iterator<Raza> it = razas.iterator();
        while (it.hasNext()) {
            Raza aux = it.next();
            System.out.println("en el iterator " + aux.getNombre());
            if (aux.getNombre().equals(raza)) {
                it.remove();
            }
        }
        Collections.sort(razas,ordenarPorNombreDesc);
        razas.forEach((var) -> System.out.println("Raza: " + var.getNombre() + " de tamaño: " + var.getTamanio()));
    }
}
