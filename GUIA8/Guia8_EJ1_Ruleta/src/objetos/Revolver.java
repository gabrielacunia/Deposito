/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author GACUNA
 */
public class Revolver {
    private int posicionActual;
    private int posicionAgua;

    public Revolver(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public Revolver() {
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }
    
    public void llenarRevolver(){
        posicionActual = (int)(Math.random()*6 +1);
        posicionAgua = (int)(Math.random()*6 +1);
        System.out.println("Las ubicaciones son:");
        System.out.println(posicionActual + " y " + posicionAgua);
    }
    
    public boolean mojar(){
        if(posicionActual == posicionAgua){
            return true;
        }else{
           return false; 
        }
    }
    
    public void siguienteChorro(){
         posicionActual = (int)(Math.random()*6 +1);
         System.out.println("La nueva posicion del revolver es " + posicionActual);
    }
    
  
}
