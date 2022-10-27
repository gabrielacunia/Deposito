/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication56;

import objetos.Circulo;
import objetos.Rectangulo;

/**
 *
 * @author GACUNA
 */
public class AreaPerimetro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Rectangulo rectangulo1 = new Rectangulo(10,20);
       Circulo circulo1 = new Circulo(3);
       
       rectangulo1.calcularArea();
       rectangulo1.calcularPerimetro();
       circulo1.calcularArea();
       circulo1.calcularPerimetro();
       
    }
    
}
