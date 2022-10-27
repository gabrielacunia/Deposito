/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import circunferencia.circunferencia;
import java.util.Scanner;

/**
 *
 * @author GACUNA
 */
public class logica {
    Scanner leer = new Scanner(System.in);
    
    
    public  circunferencia crearCirculo(){
        circunferencia radio = new circunferencia();
        System.out.println("Ingrese el radio del circulo");
        radio.setRadio(leer.nextDouble());  
        return radio;
    }
    
    public double CalcularArea(circunferencia rad){
    return (Math.pow(rad.getRadio(), 2) * Math.PI);
    
    }
    public void CalcularPerimetro(circunferencia rad){
        System.out.println("La circunferencia del circulos es " + (rad.getRadio() * 2 * Math.PI)); 
    }
}
