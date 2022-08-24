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
    Scanner leer = new Scanner(System.in).useDelimiter("\n");;
    public void mostrarFrase(Frase a){
        System.out.println(a);
    }
    public int mostrarVocales(Frase a){
        String frase = a.getFrase();
        int cont=0;
        for(int i=0; i < frase.length(); i++){
            if(frase.substring(i, i+1).equalsIgnoreCase("a") || frase.substring(i, i+1).equalsIgnoreCase("e") || frase.substring(i, i+1).equalsIgnoreCase("i") ||
            frase.substring(i, i+1).equalsIgnoreCase("o") || frase.substring(i, i+1).equalsIgnoreCase("u")){
            cont++;
        }
        }
        return cont;
    }
    public void invertirFrase(Frase a){
        int largo = a.getFrase().length();
        String frase = a.getFrase();
        System.out.println("La frase invertida es: ");
        for(int i = largo; i > 0; i-- ){
            System.out.print(frase.substring(i-1, i));
        }
        System.out.println("");
    }
    public void vecesRepetido(Frase a){
        
        System.out.println("Ingrese la letra a contabilizar:");
        String letra = leer.next();
        String frase = a.getFrase();
        int cont=0;
        for(int i=0; i < frase.length(); i++){
            if(frase.substring(i, i+1).equalsIgnoreCase(letra)){
            cont++;
        }
        }
        System.out.println("La letra " + letra + " se encontro " + cont + " veces.");
    }
       public void unirFrases(Frase a){
           System.out.println("Ingrese una palabra o frase");
           String frase = leer.nextLine();
           frase = leer.nextLine();
//           int largo = frase.length();
        String frase2 = a.getFrase();
//        int largo2 = a.getFrase().length();
        System.out.println(frase +" - " +  frase2);
       
    }
       public void reemplazarVocales(Frase a){
          String frase = a.getFrase();
           System.out.println("Seleccione la vocal a reemplazar");
           String letra = leer.next();
        for(int i=0; i < frase.length(); i++){
            if(frase.substring(i, i+1).equalsIgnoreCase(letra)){
                System.out.print("%");
        }else{
                System.out.print(frase.substring(i, i+1));
            }
            
        } 
       }

    public boolean contieneLetra(Frase a) {
        boolean resultado = false;
        System.out.println("Ingrese la letra a identificar");
        String letra = leer.next();
        int largo = a.getFrase().length();
        String frase = a.getFrase();
        for (int i = 0; i < largo; i++) {
            if (frase.substring(i, i + 1).equalsIgnoreCase(letra)) {
                resultado = true;
            }
        }
        return resultado;
       }
}
