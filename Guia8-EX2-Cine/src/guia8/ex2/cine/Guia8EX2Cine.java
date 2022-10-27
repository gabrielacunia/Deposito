/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8.ex2.cine;

import objetosVarios.Cine;
import objetosVarios.Peliculas;
import servicios.Logica;

/**
 *
 * @author GACUNA
 */
public class Guia8EX2Cine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Logica log2 = new Logica();
       String[][] matriz = new String[8][6];
       String[][] matriz2 = new String[8][6];
       Peliculas madagascar = new Peliculas("Madagascar","Stallone",0,120);
       Peliculas xxx = new Peliculas("OrgiaLoca","Tarantino",18,110);
       Cine c1 = new Cine(madagascar,matriz,10);
       Cine c2 = new Cine(xxx,matriz2,40);
    
       c1.setAsientos(log2.generarMatriz());
       log2.mostrarAsientos(c1.getAsientos());
       log2.asignarAsiento(log2.generarEspectadores(), c1);
      
       
    }

}
