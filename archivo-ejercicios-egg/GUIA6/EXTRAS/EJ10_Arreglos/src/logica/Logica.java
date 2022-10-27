/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import vectores.Vectores;

/**
 *
 * @author GACUNA
 */
public class Logica {
    Vectores vector1 = new Vectores();
    public void rellenarVectorA(){
        double[] aux = new double[50];
        for(int i=0; i < 50; i++){
          aux[i] = Math.random()*9 +1;
            System.out.println(aux[i] + " ");
        }
        vector1.setCincuenta(aux);
    }  
    public void ordenarVectorA(){
        double[] aux = vector1.getCincuenta();
        Arrays.sort(aux);
        vector1.setCincuenta(aux);
    }
    public void rellenarVectorB(){
        double[] aux = vector1.getVeinte();
        double[] aux2 =  vector1.getCincuenta();
        for (int i = 0; i < 10; i++) {
            aux[i] = aux2[i];
        }
        Arrays.fill(aux, 10, 20, 0.5);
        vector1.setVeinte(aux);
    }
    public void mostrarVectores(){
        System.out.println(Arrays.toString(vector1.getCincuenta()));
        System.out.println(Arrays.toString(vector1.getVeinte()));
        System.out.println(vector1.getCincuenta());
        System.out.println(vector1.getVeinte());
    }
}
