/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosVarios;

import java.util.ArrayList;

/**
 *
 * @author GACUNA
 */
public class Cine {
//    private ArrayList<Peliculas> pelicula;
     private Peliculas pelicula;
    private String[][] asientos;
    private double precioEntrada;

    public Cine() {
    }

    @Override
    public String toString() {
        return "Cine{" + "pelicula=" + pelicula + ", asientos=" + asientos + ", precioEntrada=" + precioEntrada + '}';
    }

    public Peliculas getPelicula() {
        return pelicula;
    }

    public void setPelicula(Peliculas pelicula) {
        this.pelicula = pelicula;
    }

    public String[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(String[][] asientos) {
        this.asientos = asientos;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public Cine(Peliculas pelicula, String[][] asientos, double precioEntrada) {
        this.pelicula = pelicula;
        this.asientos = asientos;
        this.precioEntrada = precioEntrada;
    }

}