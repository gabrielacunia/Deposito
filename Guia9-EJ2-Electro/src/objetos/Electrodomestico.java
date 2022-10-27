/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.util.Scanner;

/**
 *
 * @author GACUNA
 */
public abstract  class Electrodomestico {
    protected double precio;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;
    Scanner leer = new Scanner(System.in);
    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + ", leer=" + leer + '}';
    }
    
    public char comprobarConsumoEnergetico(char a){
        char m = Character.toUpperCase(a);
            if(m == 'A' || m == 'B' || m == 'C' || m == 'D'|| m == 'F'){
            return m;
        }else{
                m = 'F';
              return m;  
            } 
    }
    
    public String comprobarColor(String color){
        String c = color.toUpperCase();
        if(c.equals("BLANCO") || c.equals("NEGRO") || c.equals("ROJO") || c.equals("AZUL") || c.equals("GRIS")){
            return c;
        }else{
            c = "BLANCO";
            return c;
        }
    }
    
    public Electrodomestico crearElectrodomestico(Electrodomestico aparato){
        System.out.println("Ingrese el color deseado");
        String color = comprobarColor(leer.next());
        
        System.out.println("Ingrese el consumo correspondiente");
        char consumo = comprobarConsumoEnergetico(leer.next().charAt(0));
        int precioBase = 1000;
        System.out.println("Ingrese el peso del aparato");
        double peso = leer.nextDouble();
        aparato.setColor(color);
        aparato.setConsumoEnergetico(consumo);
        aparato.setPrecio(precioBase);
        aparato.setPeso(peso);
        return  aparato;
        
    }
    
    public abstract double precioFinal();
}
