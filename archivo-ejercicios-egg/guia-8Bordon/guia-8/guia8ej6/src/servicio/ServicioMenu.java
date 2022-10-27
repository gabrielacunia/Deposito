/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Menu;

/**
 *
 * @author Pablo
 */
public class ServicioMenu {
   Menu m = new Menu();
   public void mostrarMenu(){
       System.out.println(m.getOpcionUno());
       System.out.println(m.getOpcionDos());
       System.out.println(m.getOpcionTres());
       System.out.println(m.getOpcionCuatro());
       System.out.println(m.getOpcionCinco());
   } 
}
