/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 * @author Pablo
 */
public class Principal {
    
    public static void main(String [] args){
    
        ArrayList<String> razas = new ArrayList();
        
        Scanner leer = new Scanner(System.in);
        String op;
        
        do {
            System.out.println("Ingrese raza de perro");
            razas.add(leer.nextLine());
            System.out.println("Desea añadir otra raza? (S-Sí, N-No)");
            op = leer.nextLine();
        } while(op.equals("S"));
        
        for(String var: razas) {
            System.out.println(var);
        }
        
    }
    
    
}
