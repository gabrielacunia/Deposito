/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidad;

import entidad.Pais;
import java.util.Comparator;

/**
 *
 * @author Pablo
 */
public class Comparador {
    public static Comparator<Pais> ordenarAscendente = new Comparator<Pais>(){
    @Override
        public int compare(Pais t1, Pais t) {
            return t1.getNombre().compareTo(t.getNombre());
        }
    }
}
