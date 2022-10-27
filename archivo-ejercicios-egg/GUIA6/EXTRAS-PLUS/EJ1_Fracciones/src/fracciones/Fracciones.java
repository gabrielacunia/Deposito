/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fracciones;

/**
 *
 * @author GACUNA
 */
public class Fracciones {
    private int nume1;
    private int denom1;
    private int nume2;
    private int denom2;

    public Fracciones() {
    }

    public Fracciones(int nume1, int denom1, int nume2, int denom2) {
        this.nume1 = nume1;
        this.denom1 = denom1;
        this.nume2 = nume2;
        this.denom2 = denom2;
    }

    public int getNume1() {
        return nume1;
    }

    public void setNume1(int nume1) {
        this.nume1 = nume1;
    }

    public int getDenom1() {
        return denom1;
    }

    public void setDenom1(int denom1) {
        this.denom1 = denom1;
    }

    public int getNume2() {
        return nume2;
    }

    public void setNume2(int nume2) {
        this.nume2 = nume2;
    }

    public int getDenom2() {
        return denom2;
    }

    public void setDenom2(int denom2) {
        this.denom2 = denom2;
    }
    
}
