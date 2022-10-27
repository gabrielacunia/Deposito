/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import objeto.Perro;
import objeto.Persona;

/**
 *
 * @author GACUNA
 */
public class Logica {
//    public void crearObjetos(){
//        
//    }
    public ArrayList asignarPerro(ArrayList<Persona> pers, ArrayList<Perro> perr){
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < pers.size(); i++) {
            System.out.println(pers.get(i).getNombre() + ", ingrese el numero del perro a adoptar");
            for (int j = 0; j < perr.size(); j++) {
              System.out.println((j +1) +" - " + perr.get(j).getNombre().toString());     
            }
            int opcion = leer.nextInt();
            pers.get(i).setPerro(perr.get(opcion -1));  
            perr.remove(opcion - 1);
        }
        return  pers;
    }
}
