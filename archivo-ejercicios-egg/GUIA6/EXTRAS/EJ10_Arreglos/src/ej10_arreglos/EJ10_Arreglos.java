/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej10_arreglos;

import logica.Logica;
import vectores.Vectores;

/**
 *
 * @author GACUNA
 */
public class EJ10_Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Logica L1 = new Logica();
        L1.rellenarVectorA();
        L1.ordenarVectorA();
        L1.rellenarVectorB();
        L1.mostrarVectores();
    }
    
}
