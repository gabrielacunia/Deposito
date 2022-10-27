/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

import logica.Logica;

/**
 *
 * @author GACUNA
 */
public class Cine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Logica log1 = new Logica();
        log1.crearPelicula();
        log1.mostrarPeliculas();
        log1.ordenarDuracion();
        log1.ordenarDuracion();
        log1.ordenarTitulo();
        log1.ordenarDirector();
        log1.mostrarPelisLargas();
        
    }
    
}
