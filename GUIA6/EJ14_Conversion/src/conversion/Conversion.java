/*
 *Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
 */
package conversion;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Conversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de euros a convertir:");
        int euros = leer.nextInt();
        System.out.println("Ingrese la moneda deseada:");
        String moneda = leer.nextLine();
        moneda = leer.nextLine();
        double retorno = Convertir(euros,moneda);
        System.out.println("La conversion solicitada arrojo "+ retorno + " " + moneda);
    }
    public static double Convertir(int a, String b){
        double cuenta = 0;
     switch(b){
         case "dolares": cuenta = a * 1.28611;
             break;
         case "yenes": cuenta = a * 129.852;
             break;
         case "libras": cuenta = a * 0.86;
             break;
     }  
     return cuenta;
   } 
}
