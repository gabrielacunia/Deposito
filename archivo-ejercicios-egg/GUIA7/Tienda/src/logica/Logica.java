/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.HashMap;
import java.util.Scanner;
import producto.Producto;

/**
 *
 * @author GACUNA
 */
public class Logica {
    
    HashMap<String,Integer> productos = new HashMap();
    Scanner leer = new Scanner(System.in);
    
    public void agregarProducto(){
        System.out.println("Indique la cantidad de productos a agregar");
        int cantidad = leer.nextInt();
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese primero el nombre, luego el valor del producto " + (i+1));
            String nombreProducto = leer.next();
            int valorProducto = leer.nextInt();
            productos.put(nombreProducto,valorProducto);
        }
    }
    
    public void modificarPrecio(){
        System.out.println("Ingrese el producto para modificar su precio");
        String produc = leer.next();
        if(productos.containsKey(produc)){
        System.out.println("El valor actual del producto seleccionado es " + productos.get(produc));
        System.out.println("Ingrese el nuevo valor del producto");
        int nuevoValor = leer.nextInt();
        productos.put(produc, nuevoValor);
        }else{
            System.out.println("El producto seleccionado no existe en stock");
        }
            }
    
    public void eliminarProducto(){
        System.out.println("Ingrese el producto que desea eliminar");
        String elimProducto = leer.next();
        if(productos.containsKey(elimProducto)){
        System.out.println("Eliminando...");
        productos.remove(elimProducto);
    }else{
            System.out.println("El producto indicado no existe en stock");
        }
}
    public void mostrarProductos(){
        System.out.println(productos.toString());
    }
}
