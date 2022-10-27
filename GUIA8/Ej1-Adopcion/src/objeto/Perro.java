/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objeto;

import clasesEnum.PerroEnum;

/**
 *
 * @author GACUNA
 */
public class Perro {
    private String nombre;
    private PerroEnum raza;
    private int edad;
    private String tamano;

    public Perro() {
    }

    public Perro(String nombre, PerroEnum raza, int edad, String tamaño) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamano = tamano;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public PerroEnum getRaza() {
        return raza;
    }

    public void setRaza(PerroEnum raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamaño(String tamano) {
        this.tamano = tamano;
    }
  
    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", tamano=" + tamano + '}';
    }
    
}
