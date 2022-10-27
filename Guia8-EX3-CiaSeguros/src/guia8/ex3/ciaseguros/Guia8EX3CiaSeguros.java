/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8.ex3.ciaseguros;

import java.util.Scanner;
import logica.Logica;

/**
 *
 * @author GACUNA
 */
public class Guia8EX3CiaSeguros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Logica log1 = new Logica();
        int opcion = 0;
         do{
        System.out.println("MENU");
        System.out.println("1 - CREAR POLIZA");
        System.out.println("2 - EDITAR POLIZA");
        System.out.println("3 - ELIMINAR POLIZA");
        System.out.println("4 - BUSCAR CLIENTE");
        System.out.println("5 - SALIR");
        System.out.println("INGRESE OPCION DESEADA:");
        opcion = leer.nextInt();
       
        switch(opcion){
            case 1: log1.crearPoliza();
            break;
             case 3: log1.eliminarPoliza();
            break;
             case 4: log1.buscarCliente();
            break;
             case 5: System.out.println("Programa terminado");
                 break;
        }
        }while(opcion!=5);
    }
    
}
