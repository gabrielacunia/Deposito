/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.ArrayList;
import java.util.Scanner;
import objetosVarios.Cine;
import objetosVarios.Espectador;
import objetosVarios.Peliculas;

/**
 *
 * @author GACUNA
 */
public class Logica {
    Cine cin = new Cine();
    
    
    
    Espectador espec = new Espectador();
    Scanner leer = new Scanner(System.in);
    ArrayList<Espectador> espectadores = new ArrayList();
    
    
    public ArrayList<Espectador> generarEspectadores(){
        System.out.println("Ingrese la cantidad de espectadores a generar"); 
        int cantEspectadores = leer.nextInt();
        for (int i = 0; i < cantEspectadores; i++) {
            espectadores.add(new Espectador(Integer.toString((int)(Math.random()*200)),(int)(Math.random()*70),Math.random()*200,null)); 
        }
        return espectadores;
    }
    
    public String[][] generarMatriz(){
        String[][] matriz = new String[8][6];
       for (int i = 7; i >= 0; i--) {
            for (int j = 0; j < 6; j++) {
                String caracterJota="";
                switch(j){
                    case 0: caracterJota = "A";
                    break;
                    case 1: caracterJota = "B";
                    break;
                    case 2: caracterJota = "C";
                    break;
                    case 3: caracterJota = "D";
                    break;
                    case 4: caracterJota = "E";
                    break;
                    case 5: caracterJota = "F";
                    break;  
                }
               matriz[i][j] = Integer.toString(i+1) + caracterJota;
      
            }
        }
       return matriz;
    }
    
    public void asignarAsiento(ArrayList<Espectador> espect, Cine cine ){
        
        String[][] aux = cine.getAsientos();
        System.out.println(espect.size());
        for (int i = 0; i < espect.size(); i++) {
           
               if((espect.get(i).getDinero()) > (cine.getPrecioEntrada()) && espect.get(i).getEdad() >= cine.getPelicula().getEdadMinima()){
                while(espect.get(i).getAsiento() == null){
                    int fila = (int)(Math.random()*8);
                    int columna = (int)(Math.random()*6);
                    if((aux[fila][columna]).substring(2).equalsIgnoreCase("X")){
                        System.out.println("Asiento ocupado, buscando uno nuevo...");
                    }else{
                
                        aux[fila][columna] =aux[fila][columna] + "X";
                        espect.get(i).setAsiento(aux[fila][columna]);
                    }
                }
               
            }else{
                System.out.println("El espectador " + espect.get(i).toString() + " no tiene dinero suficiente o no tiene la edad minima");
            } 
               
            }
        cine.setAsientos(aux);
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Asignando asientos para la pelicula " + cine.getPelicula().getTitulo());
        mostrarAsientos(cine.getAsientos());
        asientosDisponibles(cine.getAsientos());
        mostrarEspectadores(espect);
        }
    
    
        
    public void mostrarAsientos(String[][] matriz){
     for (int i = 7; i >= 0; i--) {
            for (int j = 0; j < 6; j++) {
              
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
      
    }
    
    public void asientosDisponibles(String[][] matriz){
      System.out.println("......................................");
        System.out.println("Grilla de asientos disponibles");
        
     for (int i = 7; i >= 0; i--) {
            for (int j = 0; j < 6; j++) {
              
             if((matriz[i][j]).substring(2).equalsIgnoreCase("X")){
                        System.out.print("   ");
                    }
             else{
                 System.out.print(matriz[i][j] + " ");
             }
            }
            System.out.println("");
        }   
    }
    
    public void mostrarEspectadores(ArrayList<Espectador> esp){
        for (Espectador aux : esp) {
            System.out.println(aux);
        }
    }
    
}
