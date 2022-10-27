/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import clasesEnum.Cobertura;
import clasesEnum.Color;
import clasesEnum.FormasPago;
import clasesEnum.MarcaVehiculo;
import clasesEnum.TipoVehiculo;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import objetos.Clientes;
import objetos.Cuotas;
import objetos.Polizas;
import objetos.Vehiculo;

/**
 *
 * @author GACUNA
 */
public class Logica {
    Clientes c1 = new Clientes();
    Vehiculo v1 = new Vehiculo();
    Cuotas cuota = new Cuotas();
    Scanner leer = new Scanner(System.in);
    ArrayList<Polizas> listaPolizas = new ArrayList();
    
    public Clientes gestionCliente(Polizas poliza){
        System.out.println("Ingrese nombre de Cliente:");
         String nombre = leer.nextLine();
        nombre = leer.nextLine();
        System.out.println("Ingrese dni de Cliente");
        int dni = leer.nextInt();
        System.out.println("Ingrese mail del Cliente");
        String mail = leer.next();
        System.out.println("Ingrese domicilio de Cliente");
        String domicilio = leer.nextLine();
         domicilio = leer.nextLine();
        System.out.println("Ingrese telefono de Cliente");
        int telefono = leer.nextInt();
        ArrayList<Polizas> misPolizas = new ArrayList();
        misPolizas.add(poliza);
        
        return new Clientes(nombre,dni,mail,domicilio,telefono,misPolizas);
    }
    
    public ArrayList<Vehiculo> gestionVehiculo(){
        ArrayList<Vehiculo> vehiculos = new ArrayList();
        System.out.println("Ingrese el año del vehiculo");
        v1.setAno(leer.nextInt());
         System.out.println("Ingrese la marca del vehiculo");
         MarcaVehiculo marca[] = MarcaVehiculo.values();
        for (MarcaVehiculo aux : marca) {
            System.out.println((aux.ordinal()+1) + " - " + aux);
        }
        MarcaVehiculo marcaVehiculo = MarcaVehiculo.TOYOTA;
        int opcion = leer.nextInt();
       switch(opcion){
           case 1 : marcaVehiculo = MarcaVehiculo.TOYOTA;
           break;
           case 2 : marcaVehiculo = MarcaVehiculo.NISSAN;
           break;
           case 3 : marcaVehiculo = MarcaVehiculo.FORD;
           break;
           case 4 : marcaVehiculo = MarcaVehiculo.FIAT;
           break;
           case 5 : marcaVehiculo = MarcaVehiculo.PEUGEOT;
           break;
           case 6 : marcaVehiculo = MarcaVehiculo.RENAULT;
           break;
       }
        v1.setMarca(marcaVehiculo);
        
         System.out.println("Ingrese el model0 de vehiculo");
        v1.setModelo(leer.nextLine());
        v1.setModelo(leer.nextLine());
         System.out.println("Ingrese el numero de motor");
        v1.setNumMotor(leer.nextInt());
        System.out.println("Ingrese el numero de chasis");
        v1.setNumChasis(leer.nextInt());
        System.out.println("Ingrese el color del vehiculo");
        
         Color color[] = Color.values();
        for (Color aux : color) {
            System.out.println((aux.ordinal()+1) + " - " + aux);
        }
        Color tono = Color.BLANCO;
        int opcionColor = leer.nextInt();
       switch(opcionColor){
           case 1 : tono = Color.BLANCO;
           break;
           case 2 : tono = Color.NEGRO;
           break;
           case 3 : tono = Color.AZUL;
           break;
           case 4 : tono = Color.GRIS;
           break;
           case 5 : tono = Color.ROJO;
           break;      
       }
        v1.setColor(tono);
        System.out.println("Ingrese el tipo de vehiculo");
        TipoVehiculo tipo[] = TipoVehiculo.values();
        for (TipoVehiculo aux : tipo) {
            System.out.println((aux.ordinal()+1) + " - " + aux);
        }
        TipoVehiculo tipoVehiculo = TipoVehiculo.MOTO;
        int opcionTipo = leer.nextInt();
       switch(opcionTipo){
           case 1 : tipoVehiculo = TipoVehiculo.CAMIONETA;
           break;
           case 2 : tipoVehiculo = TipoVehiculo.SEDAN;
           break;
           case 3 : tipoVehiculo = TipoVehiculo.HATCHBACK;
           break;
           case 4 : tipoVehiculo = TipoVehiculo.MOTO;
           break;
           case 5 : tipoVehiculo = TipoVehiculo.UTILITARIO;
           break;
          
       }
        v1.setTipo(tipoVehiculo);
        
        
        vehiculos.add(v1);
        return vehiculos;
    }
    
    public void crearPoliza(){
       Clientes cliente;
       Date poliz = new Date();
       int poliza = (int) poliz.hashCode();
       Calendar calendario = Calendar.getInstance();
       calendario.setTime(poliz);
       Date inicio = poliz;
       calendario.add(Calendar.DAY_OF_YEAR, 365);
       Date fin = calendario.getTime();
       Cobertura cober = Cobertura.TERCEROS;
       int montoGranizo = 0;
       boolean granizo = false;
      

        // ENUM TIPO DE SEGURO
         System.out.println("Ingrese el tipo de seguro a crear");
        Cobertura coberturaArr[] = Cobertura.values();
        for (Cobertura aux : coberturaArr) {
            System.out.println((aux.ordinal()+1) + " - " + aux);
        }
        int opcionCobertura = leer.nextInt();
       switch(opcionCobertura){
           case 1 : cober = Cobertura.TERCEROS;
           break;
           case 2 : cober = Cobertura.ROBO;
           break;
           case 3 : cober = Cobertura.ROBOTOTAL;
           break;
           case 4 : cober = Cobertura.ROBOYGRANIZO;
             granizo = true;
             System.out.println("Ingrese el monto asegurado por granizo:");
             montoGranizo = leer.nextInt();
           break;
       }
       
        System.out.println("Ingrese el monto asegurado:");
        int montoAsegurado = leer.nextInt();
        cliente = gestionCliente(new Polizas(null,null,poliza,inicio,fin,null,montoAsegurado,granizo,montoGranizo,cober));
        listaPolizas.add(new Polizas(cliente,gestionVehiculo(),poliza,inicio,fin,gestionCuota(montoAsegurado,montoGranizo,inicio),montoAsegurado,granizo,montoGranizo,cober));
        
        System.out.println(listaPolizas.toString());
    }
    

    public void eliminarPoliza(){
        
    }
    
    public Cuotas gestionCuota(int a, int b, Date c){
        System.out.println("El sistema de cuotas divide el monto total anual en 12 cuotas");
        int cuota = (a+b)/12;
        System.out.println("El plan del cliente son 12 cuotas de $" + cuota + " pesos");
        boolean cuotapaga = false;
        // ENUM FORMAS DE PAGO
         FormasPago pago = FormasPago.EFECTIVO;
        System.out.println("Ingrese la forma de pago deseada:");
       FormasPago formaPago[] = FormasPago.values();
        for (FormasPago aux : formaPago) {
            System.out.println((aux.ordinal()+1) + " - " + aux);
        }        
        int opcionPago = leer.nextInt();
       switch(opcionPago){
           case 1 : pago = FormasPago.EFECTIVO;
           break;
           case 2 : pago = FormasPago.TARJETA;
           break;
           case 3 : pago = FormasPago.DEBITOAUTOMATICO;
           break;
           case 4 : pago = FormasPago.CUPON;
           break;
       }
        int numCuota = 1;
         Calendar calendario = Calendar.getInstance();
       calendario.setTime(c);
       Date inicio = c;
       calendario.add(Calendar.DAY_OF_YEAR, 30);
       Date vencimiento = calendario.getTime();

       return new Cuotas(numCuota,cuota,cuotapaga,vencimiento,pago);
    }
    
    public void buscarCliente(){
        
    }
}
