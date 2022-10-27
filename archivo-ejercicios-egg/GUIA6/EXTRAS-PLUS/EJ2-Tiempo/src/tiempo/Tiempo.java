/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiempo;

/**
 *
 * @author GACUNA
 */
public class Tiempo {
    private int  horas;
    private int minutos;
    private int segundos;

    public Tiempo() {
    }

    public Tiempo(int horas, int segundos) {
        this.horas = horas;
        this.segundos = segundos;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    @Override
    public String toString() {
        return "Tiempo{" + "horas=" + horas + ", minutos=" + minutos + ", segundos=" + segundos + '}';
    }
    
    
}
