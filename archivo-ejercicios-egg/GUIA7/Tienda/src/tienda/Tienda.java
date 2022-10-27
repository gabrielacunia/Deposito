/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import java.util.Scanner;
import logica.Logica;

/**
 *
 * @author GACUNA
 */
public class Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Logica log2 = new Logica();
        Scanner leer = new Scanner(System.in);
        int opcion;
        do{
            
            System.out.println("Ingrese la opcion deseada:");
            System.out.println("1 - Agregar Producto/s");
            System.out.println("2 - Modificar Precio");
            System.out.println("3 - Eliminar Producto");
            System.out.println("4 - Mostrar Productos");
            System.out.println("5 - Salir");
            opcion = leer.nextInt();
            switch(opcion){
                case 1 : log2.agregarProducto();
                break;
                 case 2 : log2.modificarPrecio();
                break;
                 case 3 : log2.eliminarProducto();
                break;
                 case 4 : log2.mostrarProductos();
                break;
                 case 5 : System.out.println("Programa terminado");
                break;
                 default: System.out.println("La opcion ingresada es incorrecta");
            }
            
            
        }while(opcion != 5);
    }
    
}
