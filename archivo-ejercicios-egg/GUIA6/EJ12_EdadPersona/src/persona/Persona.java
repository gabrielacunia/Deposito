/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author GACUNA
 */
public class Persona {
    private Date fechaNacimiento;
    private String nombre;

    public Persona() {
    }

    public Persona(Date fechaNacimiento, String nombre) {
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void crearPersona(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la persona: ");
        this.nombre = leer.next();
        System.out.println("Ingrese fecha de nacimiento de la persona: ");
        System.out.println("Ingrese dia");
        int dia = leer.nextInt();
        System.out.println("Ingrese mes");
        int mes = leer.nextInt();
        System.out.println("Ingrese año");
        int anio = leer.nextInt();
        this.fechaNacimiento = new Date(anio,mes,dia);       
    }
    
    public int calcularEdad(){
        Date hoy = new Date();
        int resultado = hoy.getYear() - this.fechaNacimiento.getYear();
        if(fechaNacimiento.getMonth() > hoy.getMonth()){
            resultado = resultado -1;
        }
        if(fechaNacimiento.getMonth() == hoy.getMonth()){
            if(fechaNacimiento.getDay() > hoy.getDay())
            resultado = resultado -1;
        }
        System.out.println("La edad del sujeto es de " + resultado + " años.");
        return resultado;
    }
    public boolean menorQue(int edad){
        boolean menor = false;
        if(this.calcularEdad() < edad){
            menor =  true;
        }
        return menor;    
    }
    public void mostrarPersona(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Persona{" + "fechaNacimiento=" + fechaNacimiento + ", nombre=" + nombre + '}';
    }

}
