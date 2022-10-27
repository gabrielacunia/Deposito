/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author GACUNA
 */
public class Logica {
    ArrayList<String> perros = new ArrayList();
    Scanner leer = new Scanner(System.in);
    public void agregarRaza(){
        String respuesta;
      do{
          System.out.println("Desea ingresar una raza?");
          respuesta = leer.next();
          if(respuesta.equalsIgnoreCase("n")){
              mostrarLista();
              break;
          }
          if(respuesta.equalsIgnoreCase("s")){
          System.out.println("Ingrese la raza a listar");
          perros.add(leer.next());
         }
      }while(respuesta.equalsIgnoreCase("s"));  
    }
    public void eliminarPerro(){
        Iterator<String> it = perros.iterator();
        System.out.println("Ingrese la raza a eliminar:");
        String raza = leer.next();
        while(it.hasNext()){
            if(it.next().equals(raza)){
                it.remove();
            } 
        }
        mostrarLista();
    }
    public void mostrarLista(){
        System.out.println(perros.toString());
    }
}
