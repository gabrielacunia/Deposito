/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4_nif;

import datos.Datos;
import datos.Logica;

/**
 *
 * @author GACUNA
 */
public class EJ4_NIF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Datos d = new Datos();
       Logica l = new Logica();
       l.crearNIF(d);
       l.mostrar(d);
       
    }
    
}
