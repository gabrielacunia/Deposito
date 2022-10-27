/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pelicula;

import java.util.Comparator;

/**
 *
 * @author GACUNA
 */
public class Pelicula {
    private String titulo;
    private String director;
    private Integer duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Integer duracion) {
        this.titulo = titulo;
        this.director = director;
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

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + '}';
    }
    
    public static Comparator<Pelicula> compararDuracion = new Comparator<Pelicula>(){
    @Override
    public int compare(Pelicula p1, Pelicula p2){
        return p1.getDuracion().compareTo(p2.getDuracion());
    }
    };
    public static Comparator<Pelicula> compararDuracionRev = new Comparator<Pelicula>(){
    @Override
    public int compare(Pelicula p1, Pelicula p2){
        return p2.getDuracion().compareTo(p1.getDuracion());
    }
    };
    
      public static Comparator<Pelicula> compararTitulo = new Comparator<Pelicula>(){
    @Override
    public int compare(Pelicula p1, Pelicula p2){
        return p1.getTitulo().compareTo(p2.getTitulo());
    }
    };
      
        public static Comparator<Pelicula> compararDirector = new Comparator<Pelicula>(){
    @Override
    public int compare(Pelicula p1, Pelicula p2){
        return p1.getDirector().compareTo(p2.getDirector());
    }
    };

}
