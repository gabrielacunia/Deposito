/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import Entidad.Alumno;
import java.util.Comparator;

/**
 *
 * @author Pablo
 */
public class Comparadores {
    
    public static Comparator<Alumno> ordenarPorNombreDesc = new Comparator<Alumno> () {
        @Override
        public int compare(Alumno a1, Alumno a) {
            return a.getNombre().compareTo(a1.getNombre());
        }
    };
}
