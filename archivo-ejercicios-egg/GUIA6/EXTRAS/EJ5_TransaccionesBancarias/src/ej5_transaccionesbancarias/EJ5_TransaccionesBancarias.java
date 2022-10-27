/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5_transaccionesbancarias;

import cuenta.cuenta;
import transaccion.transaccion;

/**
 *
 * @author GACUNA
 */
public class EJ5_TransaccionesBancarias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       transaccion t1 = new transaccion();
       cuenta c1 = t1.crearCuenta();
       t1.ingresar(c1);
       t1.retirar(c1);
       t1.retirarFast(c1);
       t1.consultaDatos(c1);
       t1.saldo(c1);
    }
    
}
