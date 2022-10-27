/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex16_edadpersonas;

import java.util.Scanner;

/**
 *
 * @author GACUNA
 */
public class EX16_EdadPersonas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         System.out.println("Ingrese la cantidad de personas a registrar");
         int personas = leer.nextInt();
         String nombre, respuesta;
         int edad;
         for(int i = 1; i <= personas; i++){
             System.out.println("Ingrese el nombre de la persona " + i);
             nombre = leer.next();
             System.out.println("Ingrese la edad de la persona " + i);
             edad = leer.nextInt();
             if(edad > 17){
                 System.out.println(nombre + " es mayor de edad");
             }else{
                   System.out.println(nombre + " es menor de edad");
             }
             System.out.println("Desea continuar cargando datos de personas? si/no");
             respuesta = leer.next();
             if(respuesta.equalsIgnoreCase("no")){
                 break;
             }
         }
    }
    
}
