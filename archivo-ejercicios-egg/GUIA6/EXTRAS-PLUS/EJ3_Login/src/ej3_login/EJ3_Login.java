/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3_login;

import java.util.Scanner;
import logica.Logica;

/**
 *
 * @author GACUNA
 */
public class EJ3_Login {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Logica log1 = new Logica();
     int opcion = 0;
    do{
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la opcion deseada");
        System.out.println("1- Crear password");
        System.out.println("2- Analizar password");
        System.out.println("3- Modificar password");
        System.out.println("4- Modificar Nombre");
        System.out.println("5- Modificar DNI");
        System.out.println("6- Mostrar datos");
        System.out.println("7- Salir");
         opcion = leer.nextInt();
    switch(opcion){
    case 1: log1.crearPass();
    break;
    case 2: log1.analizarPass();
    break;
    case 3: log1.modificarPass();
    break;
    case 4: log1.modificarNombre();
    break;
    case 5:  log1.modificarDni();
    break;
    case 6:  log1.mostrarDatos();
    break;
    case 7:  System.out.println("Programa terminado");
    break;
        default: System.out.println("La opcion ingresada es incorrecta");
    }
    }while(opcion != 7);
    }
}
