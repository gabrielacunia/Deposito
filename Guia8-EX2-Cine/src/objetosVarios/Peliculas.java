/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosVarios;

/**
 *
 * @author GACUNA
 */
public class Peliculas {
    private String titulo;
    private String director;
    private int edadMinima;
    private double duracion;

    public Peliculas() {
    }

    public Peliculas(String titulo, String director, int edadMinima, double duracion) {
        this.titulo = titulo;
        this.director = director;
        this.edadMinima = edadMinima;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Peliculas{" + "titulo=" + titulo + ", director=" + director + ", edadMinima=" + edadMinima + ", duracion=" + duracion + '}';
    }
    
}
