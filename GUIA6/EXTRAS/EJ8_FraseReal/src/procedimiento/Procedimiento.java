/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procedimiento;

import frase.Frase;
import java.util.Scanner;

/**
 *
 * @author GACUNA
 */
public class Procedimiento {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Frase f5 = new Frase();

    public Frase crearFrase() {
        System.out.println("Ingrese una palabra o frase");
        f5.setFrase(leer.nextLine());
        return f5;
    }

    public void mostrarFrase() {
        System.out.println(f5.getFrase());
    }

    public int mostrarVocales() {
        String frase = f5.getFrase();
        int cont = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.substring(i, i + 1).equalsIgnoreCase("a") || frase.substring(i, i + 1).equalsIgnoreCase("e") || frase.substring(i, i + 1).equalsIgnoreCase("i")
                    || frase.substring(i, i + 1).equalsIgnoreCase("o") || frase.substring(i, i + 1).equalsIgnoreCase("u")) {
                cont++;
            }
        }
        return cont;
    }

    public void invertirFrase() {
        int largo = f5.getFrase().length();
        String frase = f5.getFrase();
        System.out.println("La frase invertida es: ");
        for(int i = largo; i > 0; i-- ){
            System.out.print(frase.substring(i-1, i));
        }
        System.out.println("");
    }
    public void vecesRepetido(String a){
        String frase = f5.getFrase();
        int cont = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.substring(i, i + 1).equalsIgnoreCase(a)) {
                cont++;
            }
        }
        System.out.println("La letra " + a + " se encontro " + cont + " veces.");
    }

    public void unirFrases(String a) {
        String frase = f5.getFrase();
        System.out.println(frase + " - " + a);

    }

    public void reemplazarVocales(String a) {
        String frase = f5.getFrase();
        for (int i = 0; i < frase.length(); i++) {
            if (frase.substring(i, i + 1).equalsIgnoreCase("a")) {
                System.out.print(a);
            } else {
                System.out.print(frase.substring(i, i+1));
            }
            
        } 
       }

    public boolean contieneLetra(String a) {
        boolean resultado = false;
        int largo = f5.getFrase().length();
        String frase = f5.getFrase();
        for (int i = 0; i < largo; i++) {
            if (frase.substring(i, i + 1).equalsIgnoreCase(a)) {
                resultado = true;
            }
        }
        return resultado;
       }
}
