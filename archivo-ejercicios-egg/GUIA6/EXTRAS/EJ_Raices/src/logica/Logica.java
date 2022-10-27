/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.Scanner;
import raices.Raices;

/**
 *
 * @author GACUNA
 */
public class Logica {
    Raices r1 = new Raices();
    Scanner leer = new Scanner(System.in);
 public void setearParametros(){
     System.out.println("Ingrese el parametro a: ");
     r1.setA(leer.nextInt());
     System.out.println("Ingrese el parametro b: ");
     r1.setB(leer.nextInt());
     System.out.println("Ingrese el parametro c: ");
     r1.setC(leer.nextInt());
 }   
    public double obtenerDiscriminante(){
        double resultado = (Math.pow(r1.getB(), 2)) - 4*r1.getA()*r1.getC();
        return resultado;
    }
    public boolean tieneRaices(){
        boolean bandera = false;
       if(obtenerDiscriminante() >= 0){
          bandera = true; 
       }
        return bandera;
    }

    public boolean tieneRaiz() {
        boolean bandera = false;
        if (obtenerDiscriminante() == 0) {
            if (obtenerDiscriminante() > 0) {
                bandera = false;
            } else {
                bandera = true;
            }
        }
        return bandera;
    }

    public void obtenerRaices() {
        if (tieneRaices() == true){
             System.out.println((-(r1.getB())- Math.sqrt((Math.pow(r1.getB(), 2))-(4*r1.getA()*r1.getC())))/(r1.getA()*2)); 
             System.out.println((-(r1.getB())+ Math.sqrt((Math.pow(r1.getB(), 2))-(4*r1.getA()*r1.getC())))/(r1.getA()*2));
             System.out.println("check obtenerRaices");
         }
     }
     public void obtenerRaiz(){
         if(tieneRaiz() == true){
             System.out.println((-(r1.getB())- Math.sqrt((Math.pow(r1.getB(), 2))-(4*r1.getA()*r1.getC())))/(r1.getA()*2));
             System.out.println("check obtenerRaiz");
         }
     }
     public void calcular(){
         System.out.println("yes");
     }
}
