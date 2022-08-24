/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package ej2ex_cuatrovariables;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class EJ2EX_CuatroVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los valores para las siguientes variables:");
         System.out.println("Ingrese valor para variable A");
         int A = leer.nextInt();
         System.out.println("Ingrese valor para variable B");
         int B = leer.nextInt();
         System.out.println("Ingrese valor para variable C");
         int C = leer.nextInt();
         System.out.println("Ingrese valor para variable D");
         int D = leer.nextInt();
         int aux =0;
         System.out.println("El valor de A es: " + A);
         System.out.println("El valor de B es: " + B);
         System.out.println("El valor de C es: " + C);
         System.out.println("El valor de D es: " + D);
         aux = B;
         B = C;
         C = A;
         A = D;
         D = aux;
         System.out.println("El nuevo valor de A es: " + A);
         System.out.println("El nuevo valor de B es: " + B);
         System.out.println("El nuevo valor de C es: " + C);
         System.out.println("El nuevo valor de D es: " + D);    
    }  
}
