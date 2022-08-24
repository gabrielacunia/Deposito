/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex17_primos;

import java.util.Scanner;

/**
 *
 * @author GACUNA
 */
public class EX17_Primos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero para saber si es primo");
        int num = leer.nextInt();
        boolean retorno = primo(num);
        System.out.println("El analisis de categoria primo dio " + retorno);
    }
    public static boolean primo(int a){
       boolean resultado= false;
       int cont = 0;
       for(int i=1; i <= a; i++){
           if(a%i==0){
               cont++;
           }
       }
       if(cont==2){
           resultado = true;
       }
        return resultado;
    }
}
