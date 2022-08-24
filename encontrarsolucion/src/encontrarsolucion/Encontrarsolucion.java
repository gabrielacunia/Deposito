/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encontrarsolucion;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Encontrarsolucion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("BIENVENIDO/A:");
        System.out.println("*************");
        System.out.println("");
        System.out.print("Por favor ingrese su plan de cobertura mÃ©dica: ");
        String  plan = leer.nextLine();
        plan = plan.toUpperCase();
        System.out.println(plan);
        while (!plan.equals("A") && !plan.equals("B") && !plan.equals("C")){
            System.out.println("Por favor ingrese un plan vÃ¡lido, recuerde que los 3 disponibles son A, B o C: ");
            plan = leer.nextLine();
        } 
        
        System.out.print("Ahora ingrese el valor del tratamiento que debe realizarce: $ ");
        double costoI = leer.nextDouble();
        
        switch (plan){
            case "A":
                double costoD = costoI - ((costoI*50)/100);
                System.out.println("El valor del tratamientocon el descuento del 50% aplicado es: $"+costoD);
                System.out.println("");
                break;
            case "B":
                costoD = costoI - ((costoI*35)/100);
                System.out.println("El valor del tratamientocon el descuento del 35% aplicado es: $"+costoD);
                System.out.println("");
                break;
            case "C":
                System.out.println("Su plan no posee descuentos");
                System.out.println("");
                break;
        }
    }
    
}
