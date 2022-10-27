/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.Scanner;
import tiempo.Tiempo;

/**
 *
 * @author GACUNA
 */
public class Logica {
    Tiempo t1 = new Tiempo();
    Scanner leer = new Scanner(System.in);
    public void setearTiempo(){
        System.out.println("Ingrese las horas");
        t1.setHoras(leer.nextInt());
        do{
        System.out.println("Ingrese los minutos entre 0 y 59");
        t1.setMinutos(leer.nextInt());
        }while(t1.getMinutos() > 59);
        do{
        System.out.println("Ingrese los segundos entre 0 y 59");
        t1.setSegundos(leer.nextInt());
        }while(t1.getSegundos() > 59);
        
    }
    public void mostrarTiempo(){
        System.out.println(t1.toString());
    }
}
