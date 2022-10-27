/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4_rectangulo;

import calculos.calculos;
import rectangulo.rectangulo;

/**
 *
 * @author GACUNA
 */
public class EJ4_Rectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      calculos R9 = new calculos();
      rectangulo m1 = R9.crearRectangulo();
//      R9.crearRectangulo();
      System.out.println("El area del rectangulo es "+ R9.recArea(m1));
      System.out.println("El perimetro del rectangulo es "+ R9.recPerimetro(m1));
      R9.dibujarRectangulo(m1);
    }
    
}
