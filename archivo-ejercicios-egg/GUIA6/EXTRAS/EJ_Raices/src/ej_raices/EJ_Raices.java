/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_raices;

import logica.Logica;

/**
 *
 * @author GACUNA
 */
public class EJ_Raices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Logica logi1 = new Logica();
      logi1.setearParametros();
        System.out.println(logi1.obtenerDiscriminante());
      logi1.tieneRaices();
      logi1.tieneRaiz();
      logi1.obtenerRaices();
      logi1.obtenerRaiz();
      logi1.calcular();
      
      
    }
    
}
