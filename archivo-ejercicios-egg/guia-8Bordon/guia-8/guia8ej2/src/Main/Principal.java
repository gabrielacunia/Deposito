/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidad.Menu;
import Servicio.ServicioRaza;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 * @author Pablo
 */
public class Principal {
    
    public static void main(String [] args){
    
        Scanner leer= new Scanner(System.in);
        Menu menu = new Menu();
        ServicioRaza sr = new ServicioRaza();
        int opcion;
        do {
            menu.imprimirMenu();
            opcion = leer.nextInt();
            if (opcion == 1) sr.agregarMascota(sr.crearMascota());
            if (opcion == 2) sr.mostrarRazas();
            if (opcion == 3){ 
                System.out.println("Raza?");
                String borrarRaza = leer.next();
                sr.iteratorRazas(borrarRaza);
            if (opcion == 4) break;
            }
        } while (opcion != 4);
        
    }
    
}
