/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.menu;
import entity.movie;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import static utility.comparator.orderByTimelengthAsc;
import static utility.comparator.orderByTimelengthDesc;
import static utility.comparator.orderByDirector;
import static utility.comparator.orderByTitle;


/**
 * Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 * @author Pablo
 */
public class movieservice {
    
    private Scanner read;
    ArrayList<movie> list = new ArrayList();
    
    public movie createMovie(){
    
        System.out.println("Title?");
        String title = read.next();
        System.out.println("Director?");
        String director = read.next();
        System.out.println("Time length?");
        double timelength = read.nextDouble();
        
        return new movie(title,director,timelength);
    }
    
    public void loadMovie(){
        list.add(this.createMovie());
    }
    
    public void menuMovie(){
        read = new Scanner(System.in);
        menu m = new menu();
        int option;
        
        do {
            m.printMenu();
            System.out.println("Choose your option");
            option = read.nextInt();
            switch (option) {
                case 1:
                    loadMovie();
                    System.out.println("Load ok");
                    break;
                case 2:
                    showAllMovies(list);
                    break;
                case 3:
                    showMoviesOneHour(list);
                    break;
                case 4:
                    orderDesc(list);
                    break;
                case 5:
                    orderAsc(list);
                    break;
                case 6:
                    orderByTitle(list);
                    break;
                case 7:
                    orderByDirector(list);
                    break;       
                default:
                    System.out.println("Revise la opción ingresada");;
            }
        } while (option!=7);
    }
    
    public void showAllMovies(ArrayList<movie> list){
        for (movie element : list){
            System.out.println("Movie: " + element.getTitle() + " - " + "Director: " + element.getDirector());
        }
    }
    
    public void showMoviesOneHour(ArrayList<movie> list){
            System.out.println("");
            for (movie element : list){
            if (element.getTimelength() > 1 ) System.out.println("Movie: " + element.getTitle() + " - " + "Director: " + element.getDirector());
        }
    }

    public void orderDesc(ArrayList<movie> list) {
        Collections.sort(list, orderByTimelengthDesc);
        System.out.println("");
        System.out.println("Descent Order");
        list.forEach((element) -> System.out.println("Title: " + element.getTitle() + " Timelength: " + element.getTimelength()));
    }
    
    public void orderAsc(ArrayList<movie> list) {
        Collections.sort(list, orderByTimelengthAsc);
        System.out.println("");
        System.out.println("Ascent Order");
        list.forEach((element) -> System.out.println("Title: " + element.getTitle() + " Timelength: " + element.getTimelength()));
    }
    
    public void orderByDirector(ArrayList<movie> list) {
        Collections.sort(list, orderByDirector);
        System.out.println("");
        System.out.println("Order by Director");
        list.forEach((element) -> System.out.println("Title: " + element.getTitle() + " Director: " + element.getDirector()));
    }

    public void orderByTitle(ArrayList<movie> list) {
        Collections.sort(list, orderByTitle);
        System.out.println("");
        System.out.println("Order by Title");
        list.forEach((element) -> System.out.println("Title: " + element.getTitle() + " Director: " + element.getDirector()));
    }
}
