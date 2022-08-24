/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex13_escalera;
import java.util.Scanner;
/**
 *
 * @author GACUNA
 */
public class EX13_Escalera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la altura de la escalera:");
        int num = leer.nextInt();
        String concatenado = "";
        for(int i = 1; i <= num; i++){
            concatenado = concatenado + Integer.toString(i);
            System.out.println(concatenado);
        }
    }
    
}
