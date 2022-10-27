/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3_operaciones;

import matematica.matematica;
import numeros.numeros;

/**
 *
 * @author GACUNA
 */
public class EJ3_Operaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        matematica operacion = new matematica();
        numeros num = operacion.insertarNum();
        String mensaje = "";
        System.out.println("El resultado de la suma de los numeros es " + operacion.sumar(num)+ ".  ");
        System.out.println("El resultado de la resta de los numeros es " + operacion.restar(num)+ ".  ");
        if(operacion.dividir(num)==0){
        mensaje = "La division arrojo error 0";
    }
        System.out.println("El resultado de la division de los numeros es " + operacion.dividir(num) + ".  "+ mensaje);
        System.out.println("El resultado de la multiplicacion de los numeros es " + operacion.multiplicar(num)+ ".  ");
    }   
}
