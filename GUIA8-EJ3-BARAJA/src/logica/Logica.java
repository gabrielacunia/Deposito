/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import baraja.Baraja;
import java.util.ArrayList;
import static java.util.Collections.shuffle;
import java.util.Scanner;

/**
 *
 * @author GACUNA
 */
public class Logica {
    
    ArrayList<Baraja> juego = new ArrayList();
    ArrayList<Baraja> cartasJugadas = new ArrayList();
    Scanner leer = new Scanner(System.in);
    Baraja carta = new Baraja();
    
    public void crearBaraja(){
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 13; j++) {
                if(j==8){
                    j=10;
                }
             juego.add(new Baraja(j,Integer.toString(i))) ;        
            }
        }
        for (Baraja aux : juego) {
            System.out.println(aux.toString());
        }
    }
    
    public void barajar(){
        shuffle(juego);
        System.out.println("Se mezcla el maso");
        for (Baraja aux : juego) {
            System.out.println(aux.toString());
    }
    }
    public void siguienteCarta(){
        if(juego.size() == 0){
            System.out.println("No hay cartas para mostrar");
        }else{
        System.out.println("Mostrando siguiente carta");
        System.out.println(juego.get(0));
        cartasJugadas.add(juego.get(0));
        juego.remove(0);
        }
    }
    
    public void cartasDisponibles(){
        System.out.println("Quedan " + juego.size() + " cartas disponibles");
    }
    
    public void darCartas(){
        System.out.println("Cuantas cartas desea repartir?");
        int cant = leer.nextInt();
        if(juego.size() < cant){
            System.out.println("No hay suficientes cartas para repartir");
        }else{
            System.out.println("Repartiendo cartas");
            int cont = 0;
            do{
        System.out.println(juego.get(0));
        cartasJugadas.add(juego.get(0));
        juego.remove(0); 
        cont++;
            }while(cont < cant);
        }
    }
    
    public void cartasMonton(){
        System.out.println("Las cartas jugadas hasta ahora son:");
        if(cartasJugadas.size()>0){
            for (Baraja aux : cartasJugadas) {
                System.out.println(aux.toString());
            }
        }else{
            System.out.println("No hay cartas jugadas para mostrar");
        }
    }
    
    public void mostrarBaraja(){
        System.out.println("Las cartas por jugar son:");
         for (Baraja aux : juego) {
            System.out.println(aux.toString());
        }
    }
}
