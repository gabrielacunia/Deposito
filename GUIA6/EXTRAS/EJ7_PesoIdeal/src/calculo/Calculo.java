/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculo;

import java.util.Scanner;
import persona.Persona;
import promedios.Promedios;

/**
 *
 * @author GACUNA
 */
public class Calculo {

    Scanner leer = new Scanner(System.in);
    Promedios a = new Promedios();
    String sexo = "A";

    public void crearPersona(Persona p) {
        System.out.println("Ingrese el nombre de la persona");
        p.setNombre(leer.next());
        System.out.println("Ingrese la edad de la persona");
        p.setEdad(leer.nextInt());
        while(!sexo.equals("O")&&!sexo.equals("M")&&!sexo.equals("F") ) {
            System.out.println("Ingrese el sexo de la persona");
            sexo = leer.next();
            p.setSexo(sexo);
        }
        System.out.println("Ingrese el peso de la persona");
        p.setPeso(leer.nextDouble());
        System.out.println("Ingrese la altura de la persona en metros");
        p.setAltura(leer.nextDouble());
    }

    public int calcularPeso(Persona p) {
        
       double calculo = p.getPeso() / (Math.pow(p.getAltura(),2));
       int estado =0;
       if (calculo > 25){
           estado = 1;
           a.setPesoAlto(a.pesoAlto + 1);
       }
        if (20 <= calculo && calculo <= 25){
           estado = 0;
           a.setPesoIdeal(a.pesoIdeal +1);
       }
         if (calculo < 20){
           estado = -1;
           a.setPesoBajo(a.pesoBajo +1);
       }
       return estado;
    }

    public boolean mayorEdad(Persona p) {
        boolean mayor;
        if(p.getEdad() > 64){
           mayor = true; 
           a.setViejos(a.viejos+1);
        }else{
            mayor = false;
            a.setJovenes(a.jovenes+1);
        }
        return mayor;
    }
     public void Resultados() {
        System.out.println("El porcentaje de personas con bajo peso es de " + a.getPesoBajo() * 100 /4);
        System.out.println("El porcentaje de personas con peso ideal es de " + a.getPesoIdeal() * 100 /4);
        System.out.println("El porcentaje de personas con alto peso es de " + a.getPesoAlto() * 100 /4);
        System.out.println("El porcentaje de personas menores de edad es de " + a.getJovenes() * 100 /4);
        System.out.println("El porcentaje de personas mayores de edad es de " + a.getViejos() * 100 /4);
    }


}