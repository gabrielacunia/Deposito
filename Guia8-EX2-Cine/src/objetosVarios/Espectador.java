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
public class Espectador {
    private String nombre;
    private int edad;
    private double dinero;
    private String asiento;
    
    public Espectador() {
    }

    public Espectador(String nombre, int edad, double dinero, String asiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
        this.asiento = asiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return "Espectador{" + "nombre=" + nombre + ", edad=" + edad + ", dinero=" + dinero + ", asiento=" + asiento + '}';
    }


}
