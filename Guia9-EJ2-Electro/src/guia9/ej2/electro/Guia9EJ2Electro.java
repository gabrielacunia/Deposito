/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9.ej2.electro;

import java.util.ArrayList;
import objetos.Electrodomestico;
import objetos.Lavadora;
import objetos.Televisor;

/**
 *
 * @author GACUNA
 */
public class Guia9EJ2Electro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Electrodomestico> aparatos = new ArrayList();
        
        Lavadora lavadora1 = new Lavadora(6.5d, 1000d, "rojo", 'A', 23d);
        aparatos.add(lavadora1);
        Lavadora lavadora2 = new Lavadora(5d, 1000d, "negro", 'B', 20d);
        aparatos.add(lavadora2);
        Televisor tv1 = new Televisor(40d, false, 1000d, "gris", 'C', 12d);
        aparatos.add(tv1);
        Televisor tv2 = new Televisor(50d, true, 1000d, "azul", 'D', 21d);
        aparatos.add(tv2);
//    Lavadora lavadora1 = new Lavadora();
//        lavadora1.crearLavadora(lavadora1);
//        lavadora1.precioFinal();
//        
//        Televisor tv1 = new Televisor();
//        tv1.crearTelevisor(tv1);
//        tv1.precioFinal();
        double precioTotal = 0;
        double precioLavadoras = 0;
        double precioTelevisores = 0;
        for (int i = 0; i < aparatos.size(); i++) {
            precioTotal = precioTotal + aparatos.get(i).precioFinal(); 
          if(aparatos.get(i) instanceof Lavadora){
              precioLavadoras = precioLavadoras + aparatos.get(i).precioFinal();
          }else{
              precioTelevisores = precioTelevisores + aparatos.get(i).precioFinal();
          }
        }
        System.out.println("La suma de los valores es " + precioTotal);
        System.out.println("La suma de las lavadoras es " + precioLavadoras);
        System.out.println("La suma de los televisores es " + precioTelevisores);


    }
    
}
