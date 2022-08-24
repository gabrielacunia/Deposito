/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectores;

/**
 *
 * @author GACUNA
 */
public class Vectores {
    private double[] cincuenta =new double[50];
    private double[] veinte= new double[20];

    @Override
    public String toString() {
        return "Vectores{" + "cincuenta=" + cincuenta + ", veinte=" + veinte + '}';
    }

    public Vectores() {
    }

    public Vectores(double[] cincuenta, double[] veinte) {
        this.cincuenta = cincuenta;
        this.veinte = veinte;
    }

    public double[] getCincuenta() {
        return cincuenta;
    }

    public void setCincuenta(double[] cincuenta) {
        this.cincuenta = cincuenta;
    }

    public double[] getVeinte() {
        return veinte;
    }

    public void setVeinte(double[] veinte) {
        this.veinte = veinte;
    }
    
    
}
