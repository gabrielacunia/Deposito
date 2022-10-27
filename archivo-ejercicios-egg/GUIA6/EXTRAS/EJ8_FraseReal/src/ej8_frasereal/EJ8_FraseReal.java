/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej8_frasereal;

import java.util.Scanner;
import procedimiento.Procedimiento;

/**
 *
 * @author GACUNA
 */
public class EJ8_FraseReal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Procedimiento p1 = new Procedimiento();
        Scanner leer = new Scanner(System.in);
        p1.crearFrase();
        p1.mostrarFrase();
        System.out.println("El numero de vocales es " + p1.mostrarVocales());
        p1.invertirFrase();
        System.out.println("Ingrese la letra para buscar repeticion");
        p1.vecesRepetido(leer.next());
        System.out.println("Escriba la frase que desea adicionar");
        String frase2 = leer.next();
        p1.unirFrases(frase2);
        System.out.println("Ingrese la letra que desea constatar");
        System.out.println("La busqueda de la letra dio como resultado: " + p1.contieneLetra(leer.next()));
        System.out.println("Ingrese el caracter que desea en vez de a");
        p1.reemplazarVocales(leer.next());
    }
    
}
