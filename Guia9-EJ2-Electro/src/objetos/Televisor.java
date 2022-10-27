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
public class Televisor extends Electrodomestico {
    
    private double pulgadas;
    private boolean tdt;

    public Televisor() {
      
    }

    public Televisor(double pulgadas, boolean tdt, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.tdt = tdt;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
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
    
    public Televisor crearTelevisor(Televisor tele){
         crearElectrodomestico(tele);
        System.out.println("Ingrese las pulgadas del televisor");
        pulgadas = leer.nextDouble();
        System.out.println("Ingrese si el televisor posee TDT (s/n)");
        System.out.println("1 - Posee");
        System.out.println("2 - No posee");
        int respuesta = leer.nextInt();
        if(respuesta == 1){
            tdt = true;
        }
        System.out.println(tele);
        return tele;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso  + " pulgadas=" + pulgadas + ", tdt=" + tdt + '}';
    }
    
    @Override
    public double precioFinal(){
        double precioBase = 1000;
        switch(consumoEnergetico){
            case 'A': precioBase = precioBase + 1000;
            break;
             case 'B': precioBase = precioBase + 800;
            break;
             case 'C': precioBase = precioBase + 600;
            break;
             case 'D': precioBase = precioBase + 500;
            break;
             case 'E': precioBase = precioBase + 300;
            break;
             case 'F': precioBase = precioBase + 100;
            break;
        }
           switch((1<= peso && peso <=19)? 1 : (20<= peso && peso <=49)? 2 : (50<= peso && peso <=79)? 3 : (80<= peso && peso <=10000)? 4 : 5){
            case 1: precioBase = precioBase + 100;
            break;
             case 2: precioBase = precioBase + 500;
            break;
             case 3: precioBase = precioBase + 800;
            break;
             case 4: precioBase = precioBase + 1000;
            break;
             case 5: System.out.println("peso erroneo");
        }
           if(pulgadas > 40){
               precioBase = precioBase + (precioBase*30/100);
           }
           if(tdt == true){
               precioBase = precioBase + 500;
           }
        System.out.println("El precio final del televisor es " + precioBase);
        return precioBase;
}
}
