/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import Entidad.Raza;
import java.util.Comparator;

/**
 *
 * @author Pablo
 */
public class Comparador {
    public static Comparator<Raza> ordenarPorNombreDesc = new Comparator<Raza> () {
        @Override
        public int compare(Raza r1, Raza r) {
            return r.getNombre().compareTo(r1.getNombre());
        }
    };
}
