/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baraja;

/**
 *
 * @author GACUNA
 */
public class Baraja {
    private int numero;
    private String  palo;

    public Baraja() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public Baraja(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    @Override
    public String toString() {
        switch(palo){
            case "0" : palo = "oro";
            break;
            case "1" : palo = "basto";
            break;
            case "2" : palo = "copa";
            break;
            case "3" : palo = "espada";
            break;
        }
            
        return "Baraja{" + "numero=" + numero + ", palo=" + palo + '}';
    }
    
}
