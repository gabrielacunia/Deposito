/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.Scanner;
import puntos.Puntos;

/**
 *
 * @author GACUNA
 */
public class Logica {
    Puntos coordenadas = new Puntos();
    Scanner leer = new Scanner(System.in);
    int[] coor1 = new int[2];
    int[] coor2 = new int[2];
    
    public void setearCoordenadas(){
      for(int i = 0; i < 2; i++){
          System.out.println("Inserte un valor para el vector 1 en posicion " + i);
          coor1[i] = leer.nextInt();
          System.out.println("Inserte un valor para el vector 2 en posicion " + i);
          coor2[i] = leer.nextInt();
          coordenadas.setPunto1(coor1);
          coordenadas.setPunto2(coor2);
}  
    }
    public double calcularDistancia(){
        double resultado = 0;
        int[] punto1 = coordenadas.getPunto1();
        int[] punto2 = coordenadas.getPunto2();
        resultado = Math.sqrt(Math.pow(punto2[0] - punto1[0], 2) + Math.pow(punto2[1] - punto1[1], 2));
        return resultado;
    }
    
}
