/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8_ej1_ruleta;

import java.util.ArrayList;
import java.util.Scanner;

import objetos.Jugador;
import objetos.Revolver;

/**
 *
 * @author GACUNA
 */
public class JuegoRuleta {

    /**
     * @param args the command line arguments
     */
      
    public static void main(String[] args) {
        ArrayList<Jugador> jugadores = new ArrayList();
        Revolver r1 = new Revolver();
      llenarJuego(jugadores,r1);
      ronda(jugadores,r1);
    }
    
    public static void llenarJuego(ArrayList jugadores, Revolver r){
   Scanner leer = new Scanner(System.in);
   
        System.out.println("Ingrese la cantidad de jugadores que participaran");
        int participantes = leer.nextInt();
        for (int i = 0; i < participantes; i++) {
            System.out.println("Ingrese el ID del jugador");
            int id = leer.nextInt();
            System.out.println("Ingrese el nombre del jugador");
            String nombre = leer.next();
            jugadores.add(new Jugador(id,nombre,false));
        }
        System.out.println("Los jugadores son:");
        System.out.println(jugadores.toString());
         r.llenarRevolver();
       
    }
    public static void ronda(ArrayList jug, Revolver r){
        Jugador j1 = new Jugador();
        do{
           int i = 0; 
        for (i = 0; i < jug.size(); i++) {
            j1.disparo(r);
            if(j1.isMojado()){
                
                System.out.println("El jugador " + jug.get(i).toString() + " ha perdido");
                System.out.println("Juego terminado");
                break;
            }else{
                System.out.println("El jugador " + jug.get(i) + " no se mojo");
            }
        }
    }while (!j1.isMojado());
        }
}
