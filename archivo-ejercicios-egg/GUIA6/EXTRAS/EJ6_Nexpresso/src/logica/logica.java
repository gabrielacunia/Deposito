/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import cafetera.cafetera;
import java.util.Scanner;

/**
 *
 * @author GACUNA
 */
public class logica {

    Scanner leer = new Scanner(System.in);
    
    public cafetera llenarCafetera(cafetera c){
       c.setCapacidadAct(c.getCapacidadMax());
       System.out.println("La maquina tiene ahora " + c.getCapacidadAct() + " litros de cafe");
       return c;
    }
    public void servirTaza(cafetera c){
        System.out.println("Ingrese la capacidad de su taza en litros");
        double taza = leer.nextDouble();
        if(c.getCapacidadAct()< taza){
            System.out.println("La taza no se lleno, se sirvieron " + c.getCapacidadAct() + " litros");
            c.setCapacidadAct(0);
        }else{
           c.setCapacidadAct(c.getCapacidadAct()-taza); 
        }
        System.out.println("La maquina tiene ahora " + c.getCapacidadAct() + " litros de cafe");
    }
    public void vaciarCafetera(cafetera c){
         c.setCapacidadAct(0);
         System.out.println("La cafetera tiene ahora " + c.getCapacidadAct() + " litros de cafe");
    }
    public void agregarCafe(cafetera c){
        double cantidad = 0;
        do{
        System.out.println("Indique la cantidad de cafe a ingresar a la maquina");
        cantidad = leer.nextDouble();
        }while(c.getCapacidadAct() + cantidad > c.getCapacidadMax());
        c.setCapacidadAct(c.getCapacidadAct() + cantidad);
        System.out.println("La maquina tiene ahora " + c.getCapacidadAct() + " litros de cafe");
    }
}
