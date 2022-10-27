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
public class Lavadora extends Electrodomestico{
    
    private double carga;

    public Lavadora() {
      
    }

    public Lavadora(double carga, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Lavadora{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + " carga=" + carga + '}';
    }
    
    public Lavadora crearLavadora(Lavadora lavadora){
        crearElectrodomestico(lavadora);
        System.out.println("Ingrese la capacidad de carga");
        double carga = leer.nextDouble();
        lavadora.setCarga(carga);
        System.out.println(lavadora);
        return lavadora;
    }
    
    @Override
    public double  precioFinal(){
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
           if(carga > 30){
               precioBase = precioBase + 500;
           }
           
        System.out.println("El precio final de la lavadora es " + precioBase);
        return precioBase;
}
}