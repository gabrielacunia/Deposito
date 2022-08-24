/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej9_matematica;

import java.util.Scanner;
import matematica.Matematica;

/**
 *
 * @author GACUNA
 */
public class EJ9_Matematica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matematica m1 = new Matematica();
        Scanner leer = new Scanner(System.in);
        m1.setNum1(Math.random()*10);
        m1.setNum2(Math.random()*10);
        System.out.println("Los numeros son " + m1.getNum1() + " y " + m1.getNum2()); 
        System.out.println("y el numero mayor es el " + devolverMayor(m1));
        calcularPotencia(m1);
        calcularRaiz(m1);
    }
  public static double devolverMayor(Matematica g){
      double a = g.getNum1();
      double b = g.getNum2();
      double resultado;
      if(a>b){
          resultado = a;
      }else{
          resultado = b;
      }
      return resultado;
  } 
  public static void calcularPotencia(Matematica g){
     
      double a = g.getNum1();
      double b = g.getNum2();
      double resultado;
     
      if(a>b){
         resultado = Math.pow(Math.ceil(a), Math.ceil(b));
      }else{
         resultado = Math.pow(Math.ceil(b), Math.ceil(b));
      }
      System.out.println("El resultado de la potencia es " + resultado );
      
  }
  public static void calcularRaiz(Matematica g){
      
      double a = g.getNum1();
      double b = g.getNum2();
      double resultado;
      if(a>b){
          resultado = a;
      }else{
          resultado = b;
      }
      System.out.println("El resultado de la raiz cuadrada es: " + Math.sqrt(Math.ceil(resultado)));
  }
}
