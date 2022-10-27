/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.Scanner;
import parametros.Parametros;

/**
 *
 * @author GACUNA
 */
public class Logica {
    Scanner leer = new Scanner(System.in);
    Parametros p1 = new Parametros();
    
    public void crearJuego(){
        p1.setLetrasEncontradas(0);
        p1.setIntentos(0);
        System.out.println("Ingrese la palabra a adivinar:");
        String palabra = leer.next();
        System.out.println("Ingrese la cantidad de jugadas maximas");
        p1.setIntentos(leer.nextInt());
        String[] vector = new String[palabra.length()];
        String[] vector2 = new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
        vector[i] = palabra.substring(i, i+1);
        vector2[i] = "_";
        }  
        p1.setPalabra(vector);
        p1.setParcial(vector2);
        
    
    }
    public void longitud(){
        System.out.println((p1.getPalabra()).length);
    }
    public void buscarLetra(){
        int cont =1;
        while(p1.getIntentos() > 0 && cont != 0){
        System.out.println("Intente adivinar una letra");
        String letra = leer.next();
        boolean bandera = false;
        String[] vector = p1.getPalabra();
        String[] vector2 = p1.getParcial();
        cont = 0;
        for (int i = 0; i < (p1.getPalabra()).length; i++) {
            if(letra.equalsIgnoreCase(vector[i])){
                vector2[i] = letra;
                bandera = true;
            }
            if(vector2[i] == "_"){
                cont++;
            }
        }
        if(bandera == false){
            intentos();
        }
        p1.setParcial(vector2);
        for (int i = 0; i < (p1.getParcial()).length; i++) {
            System.out.print(vector2[i] + " ");    
        } 
        System.out.println("Quedan "+ cont + " letras por adivinar y " + p1.getIntentos() + " intentos." );
    }
         System.out.println("Juego terminado, le sobraron " + p1.getIntentos() + " intentos.");
    }
    public int intentos(){
    p1.setIntentos(p1.getIntentos() -1);
    return p1.getIntentos();
    }
    public void juego(){
        crearJuego();
         
        buscarLetra(); 
    }
}
