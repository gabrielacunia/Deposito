/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex14_hijosfamiliasprom;

import java.util.Scanner;

/**
 *
 * @author GACUNA
 */
public class EX14_HijosFamiliasProm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de familias a anlizar:");
        int familias = leer.nextInt();
        int edad;
        int suma = 0;
        int cont = 0;
        for (int i = 1; i <= familias; i++) {
            System.out.println("Ingrese la cantidad de hijos de la familia " + i);
            int hijos = leer.nextInt();
            for (int j = 1; j <= hijos; j++) {
                System.out.println("Ingrese la edad del hijo " + j + " de la familia " + i);
                edad = leer.nextInt();
                suma = suma + edad;
                cont++;
            }
        }
        System.out.println("La edad media de los hijos de todas las familias es: " + suma/cont);
    }
}
