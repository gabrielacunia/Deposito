/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2_circunferencia;

import logica.logica;
import circunferencia.circunferencia;

/**
 *
 * @author GACUNA
 */
public class EJ2_Circunferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        logica circulo1 = new logica();
        circunferencia radio = circulo1.crearCirculo();
        System.out.println("El area del circulo es "+circulo1.CalcularArea(radio));
        circulo1.CalcularPerimetro(radio);
    }
    
}
