/*
 Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.
 */
package ej7ex_valmaxmin;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class EJ7EX_ValMaxMin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de valores a ingresar");
        int cant = leer.nextInt();
        int cont =0;
        int prom = 0;
        int min= 0;
        int max = 0;
        boolean bandera = true;
        /*while(cont < cant){
            System.out.println("Ingrese un numero");
            int valor = leer.nextInt();
            prom = prom + valor;
            if(bandera==true){
                max = valor;
                min = valor;
                bandera=false;
            }
            if(valor > max){
                max = valor;
            }
             if(valor < min){
                min = valor;
            }  
            cont++;
        }*/
        do {
             System.out.println("Ingrese un numero");
            int valor = leer.nextInt();
            prom = prom + valor;
            if(bandera==true){
                max = valor;
                min = valor;
                bandera=false;
            }
            if(valor > max){
                max = valor;
            }
             if(valor < min){
                min = valor;
            }  
            cont++;
        }while(cont < cant);
        System.out.println("El valor maximo ingresado es " + max);
        System.out.println("El valor minimo ingresado es " + min);
        System.out.println("El promedio de los valores ingresados es " + prom/cant);
    }
    
}
