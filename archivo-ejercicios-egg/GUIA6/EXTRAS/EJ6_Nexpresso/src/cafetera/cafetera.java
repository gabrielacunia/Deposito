/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafetera;

/**
 *
 * @author GACUNA
 */
public class cafetera {
    private double capacidadMax = 100;
    private double capacidadAct;

    public cafetera() {
    }

    public cafetera(double capacidadMax, double capacidadAct) {
        this.capacidadMax = capacidadMax;
        this.capacidadAct = capacidadAct;
    }

    public double getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(double capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    public double getCapacidadAct() {
        return capacidadAct;
    }

    public void setCapacidadAct(double capacidadAct) {
        this.capacidadAct = capacidadAct;
    }
    
}
