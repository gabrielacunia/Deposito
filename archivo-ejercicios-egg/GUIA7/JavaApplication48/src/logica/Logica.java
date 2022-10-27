/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author GACUNA
 */
public class Logica {
    HashSet<String> paises = new HashSet();
    Scanner leer = new Scanner(System.in);
    
    public HashSet agregarPais(){
        String respuesta;
     do{
         System.out.println("Desea agregar un pais? s/n");
         respuesta = leer.next();
         if(respuesta.equalsIgnoreCase("s")){
             System.out.println("Ingrese el pais a agregar");
           paises.add(leer.next());
         }
     }while(respuesta.equalsIgnoreCase("s"));
        return paises;
    }
    public ArrayList<String> ordenarAlfabeticamente(){
        ArrayList<String> paisOrden = new ArrayList(paises);
        Collections.sort(paisOrden);
        return paisOrden;
    }
    public void eliminarPais(){
        Iterator it = paises.iterator();
        System.out.println("Ingrese el pais a eliminar");
        String pais = leer.next();
        while(it.hasNext()){
            if(it.next().equals(pais)){
            it.remove();
        }     
        }
        System.out.println(paises);
    }
}
