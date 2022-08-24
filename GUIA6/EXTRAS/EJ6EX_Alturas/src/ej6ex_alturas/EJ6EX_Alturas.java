/*
 Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package ej6ex_alturas;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class EJ6EX_Alturas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas a promediar");
        int personas = leer.nextInt();
        double promGeneral = 0;
        double promBajitos = 0;
        int cont = 0;
        for(int i = 0; i<personas; i++){
            System.out.println("Ingrese la estatura de la persona "+ (i+1));
            double estatura = leer.nextDouble();
            promGeneral = promGeneral + estatura;
            if(estatura < 160){
            promBajitos = promBajitos + estatura;
            cont++;
            }   
        }
        System.out.println("El promedio de altura general es de " + promGeneral/personas);
        System.out.println("El promedio de altura debajo de los 160cm es de " + promBajitos/cont);
    }  
}
