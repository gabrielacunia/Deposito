/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.Scanner;

/**
 *
 * @author GACUNA
 */
public class Logica {
    public void crearNIF(Datos doc){ 
        System.out.println("Ingreswe un numero de DNI");
        Scanner leer = new Scanner(System.in);
        doc.setDni(leer.nextLong());
        char[] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        doc.setLetra(letras[(int)doc.getDni() % 23]);
        
    }
    public void mostrar(Datos todo){
        System.out.println("El numero compuesto es " + todo.getDni() + "-" + todo.getLetra());  
    }
}
