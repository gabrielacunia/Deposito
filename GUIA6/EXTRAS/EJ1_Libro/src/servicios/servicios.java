/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.Scanner;
import objetolibro.objetolibro;

/**
 *
 * @author GACUNA
 */
public class servicios {
    public objetolibro caracteristicas(){
         objetolibro libro = new objetolibro();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el numero de ISNB");
        libro.setIsnb(leer.nextInt());
        System.out.println("Ingrese el Titulo");
        libro.setTitulo(leer.next());
        System.out.println("Ingrese el autor");
        libro.setAutor(leer.next());
        System.out.println("Ingrese la cantidad de paginas");
        libro.setPaginas(leer.nextInt());
     
        return libro;
    }
   public objetolibro mostrar(objetolibro librop){
       System.out.println("El numero de ISNB es " + librop.getIsnb());
       System.out.println("El titulo del libro es " + librop.getTitulo());
       System.out.println("El autor del libro es " + librop.getAutor());
       System.out.println("La cantidad de paginas del libro es " + librop.getPaginas());
       return librop;
   }
   
    
}