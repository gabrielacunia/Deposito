/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2_puntos;

import logica.Logica;

/**
 *
 * @author GACUNA
 */
public class EJ2_Puntos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Logica logica1 = new Logica();
        logica1.setearCoordenadas();
        System.out.println(logica1.calcularDistancia());
    }
}
