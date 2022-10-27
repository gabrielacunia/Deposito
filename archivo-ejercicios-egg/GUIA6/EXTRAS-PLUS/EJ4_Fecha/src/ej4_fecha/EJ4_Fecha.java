/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4_fecha;

import logica.Logica;

/**
 *
 * @author GACUNA
 */
public class EJ4_Fecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Logica fecha = new Logica();
        fecha.setearFecha();
        fecha.diaAnterior();
        fecha.diaPosterior();
        fecha.anoBisiesto();
    }
    
}
