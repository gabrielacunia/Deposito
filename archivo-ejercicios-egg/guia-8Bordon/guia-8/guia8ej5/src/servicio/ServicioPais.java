/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Pais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import entidad.Menu;
import servicio.ServicioMenu;

/**
 *
 * @author Pablo
 */
public class ServicioPais {
    HashSet<Pais> paises = new HashSet<>();
    Scanner leer;
    Menu m;
    ServicioMenu sm= new ServicioMenu();
    
    public Pais cargarPais(){
        System.out.println("Nombre del País?");
        String nombre = leer.next();
        return new Pais(nombre);
    }
    
    public void eliminarPais(){
        boolean valido=true;
        System.out.println("Qué país quiere eliminar?");
        String nombre = leer.next();
        Iterator<Pais> it = paises.iterator();
        while (it.hasNext()) {
            String aux = it.next().getNombre();
            if (aux.equals(nombre)) {
                System.out.println(nombre + " ha sido eliminado");
                it.remove();
                valido = false;
                break;
            }
        }
        if (valido) {System.out.println(nombre + " no existe en el conjunto");}
    }
    
    public void buscarPais(){
        boolean valido=true;
        System.out.println("Qué país quiere buscar?");
        String nombre = leer.next();
        Iterator<Pais> it = paises.iterator();
        while (it.hasNext()) {
            String aux = it.next().getNombre();
            if (aux.equals(nombre)) {
                System.out.println(nombre + " encontrado en el conjunto");
                valido = false;
                break;
            }
        }
        if (valido) {System.out.println(nombre + " no existe en el conjunto");}
    }
    
    public void mostrarPais(){
        paises.forEach((p) -> System.out.println(p.getNombre()));
    }
    
    public void ordenarPaises(){
        limpiarPantalla();
        ArrayList<Pais> paisesOrd = new ArrayList(paises);
        Collections.sort(paisesOrd, utilidad.Comparador.ordenarAscendente);
        paisesOrd.forEach((p)-> System.out.println(p.getNombre()));
    }
    
    public void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    
    public void ejecutarPrincipal(){
        int opcion;
        leer = new Scanner(System.in);
        do {
            sm.mostrarMenu();
            System.out.println("Seleccione la opción deseada");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    paises.add(cargarPais());
                    break;
                case 2:
                    mostrarPais();
                    break;
                case 3:
                    buscarPais();
                    break;
                case 4:
                    eliminarPais();
                    break;
                case 5:
                    System.out.println("Ha cerrado la sesión");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion!=5);
        ordenarPaises();
    }
}
