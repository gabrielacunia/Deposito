/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promedios;

/**
 *
 * @author GACUNA
 */
public class Promedios {

   
      public  int pesoBajo;
      public int pesoIdeal;
      public int pesoAlto;
      public int jovenes;
      public int viejos;

    public int getPesoBajo() {
        return pesoBajo;
    }

    public void setPesoBajo(int pesoBajo) {
        this.pesoBajo = pesoBajo;
    }

    public int getPesoIdeal() {
        return pesoIdeal;
    }

    public void setPesoIdeal(int pesoIdeal) {
        this.pesoIdeal = pesoIdeal;
    }

    public int getPesoAlto() {
        return pesoAlto;
    }

    public void setPesoAlto(int pesoAlto) {
        this.pesoAlto = pesoAlto;
    }

    public int getJovenes() {
        return jovenes;
    }

    public void setJovenes(int jovenes) {
        this.jovenes = jovenes;
    }

    public int getViejos() {
        return viejos;
    }

    public void setViejos(int viejos) {
        this.viejos = viejos;
    }

    public Promedios(int pesoBajo, int pesoIdeal, int pesoAlto, int jovenes, int viejos) {
        this.pesoBajo = pesoBajo;
        this.pesoIdeal = pesoIdeal;
        this.pesoAlto = pesoAlto;
        this.jovenes = jovenes;
        this.viejos = viejos;
    }
     public Promedios() {
    }
     
}
