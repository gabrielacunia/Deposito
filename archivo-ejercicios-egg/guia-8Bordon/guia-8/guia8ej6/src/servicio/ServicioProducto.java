/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Producto;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 * @author Pablo
 */
public class ServicioProducto {
    Scanner leer;
    ServicioMenu sm = new ServicioMenu();
    HashMap<String, Double> productos = new HashMap();
    
    public ServicioProducto(){
        this.productos = new HashMap();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public void cargarProducto(){
        System.out.println("Nombre del producto?");
        String nombre = leer.next();
        System.out.println("Precio?");
        Double precio = leer.nextDouble();
        productos.put(nombre, precio);
    }
    
    public void modificarPrecio(String nombre){
        productos.get(nombre);
        System.out.println("Ingrese Precio nuevo");
        double precio = leer.nextDouble();
        productos.replace(nombre, precio);
    }
    
    public void eliminarProducto(){
        boolean valido = true;
        System.out.println("Que producto quiere eliminar?");
        String nombre = leer.next();
        Iterator<Entry<String, Double>> it = productos.entrySet().iterator();
        while (it.hasNext()) {
            String aux = it.next().getKey();
            if (aux.equals(nombre)) {
                System.out.println(nombre + " ha sido eliminado");
                it.remove();
                valido = false;
                break;
            }
        }
        if (valido) {System.out.println(nombre + " no existe en el conjunto");}
        //productos.remove(nombre);
    }
    
    public void buscarProducto(){
        boolean valido=true;
        System.out.println("Qué producto quiere buscar?");
        String nombre = leer.next();
        Iterator<Entry<String, Double>> it = productos.entrySet().iterator();
        while (it.hasNext()) {
            String aux = it.next().getKey();
            if (aux.equals(nombre)) {
                System.out.println(nombre + " encontrado en el conjunto. Precio = $" + it.next().getValue());
                valido = false;
                break;
            }
        }
        if (valido) {System.out.println(nombre + " no existe en el conjunto");}
        //productos.get(nombre);
    }
    
    public void mostrarProductos(){
        for (Map.Entry<String,Double> producto: productos.entrySet()) {
            System.out.println("Nombre = " + producto.getKey()+ " - Precio = $" + producto.getValue());
        }
    }
    
    public void ejecutarPrincipal(){
        int opcion;
        leer = new Scanner(System.in);
        do {
            sm.mostrarMenu();
            System.out.println("Seleccione la opción deseada");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    cargarProducto();
                    break;
                case 2:
                    mostrarProductos();
                    break;
                case 3:
                    buscarProducto();
                    break;
                case 4:
                    eliminarProducto();
                    break;
                case 5:
                    System.out.println("Ha cerrado la sesión");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion!=5);
    }
}
