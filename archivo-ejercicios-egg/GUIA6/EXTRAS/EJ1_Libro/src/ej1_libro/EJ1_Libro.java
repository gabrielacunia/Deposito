/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1_libro;

import objetolibro.objetolibro;
import servicios.servicios;

/**
 *
 * @author GACUNA
 */
public class EJ1_Libro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       servicios primero = new servicios();
       objetolibro libro1 = primero.caracteristicas();
       primero.mostrar(libro1);
    }
    
}
