/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paises;

import logica.Logica;

/**
 *
 * @author GACUNA
 */
public class Paises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Logica log1 = new Logica();
        System.out.println(log1.agregarPais());
        System.out.println(log1.ordenarAlfabeticamente());
        log1.eliminarPais();
    }
    
}
