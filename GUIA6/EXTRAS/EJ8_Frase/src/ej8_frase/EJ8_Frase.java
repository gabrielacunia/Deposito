/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej8_frase;

import frase.Frase;
import java.util.Scanner;
import procedimiento.Procedimiento;

/**
 *
 * @author GACUNA
 */
public class EJ8_Frase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Frase f1 = new Frase();
        Procedimiento p1 = new Procedimiento();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra o frase");
        String frase = leer.nextLine();
        f1.setFrase(frase);
        f1.setLargo(frase.length());
        p1.mostrarFrase(f1);
        System.out.println("Las vocales contabilizadas son " + p1.mostrarVocales(f1));
        p1.invertirFrase(f1);
        p1.vecesRepetido(f1);
        p1.unirFrases(f1);
        System.out.println("Identificacion de la letra: " + p1.contieneLetra(f1));
        p1.reemplazarVocales(f1);
    }
    
}
