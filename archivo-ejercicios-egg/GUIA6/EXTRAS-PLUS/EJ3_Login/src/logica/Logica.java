/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.Scanner;
import pass.Pass;

/**
 *
 * @author GACUNA
 */
public class Logica {
    Pass usuario = new Pass("","zorro",29);
    Scanner leer = new Scanner(System.in);
    public void crearPass(){
        String password = "";
        do{
        System.out.println("Ingrese el password a setear - Debe tener diez caracteres");
        password = leer.next(); 
        }while(password.length() != 10);
        usuario.setPass(password);
    }
    public void analizarPass(){
        String pass = usuario.getPass();
        boolean bandera = false;
        int contA =0;
        for (int i = 0; i < 10; i++) {
            if(pass.substring(i, i+1).equalsIgnoreCase("z")){
               bandera = true; 
            }
            if(pass.substring(i, i+1).equalsIgnoreCase("a")){
               contA++;
            }
        }
        if(bandera == true && contA > 1){
            System.out.println("seguridad ALTA");
        }
         if(bandera == true && contA < 2){
            System.out.println("seguridad MEDIA");
        }
          if(bandera == false){
            System.out.println("seguridad BAJA");
        }
    }
    public void modificarNombre(){
        while(chequearPass() == false){
            chequearPass();
        }
        System.out.println("Ingrese un nuevo nombre");
        usuario.setNombre(leer.next());
    }
    public void modificarDni(){
        while(chequearPass() == false){
            chequearPass();
        }
        System.out.println("Ingrese un nuevo dni");
        usuario.setDni(leer.nextInt());
    }
    public void modificarPass(){
        while(chequearPass() == false){
            chequearPass();
        }
       crearPass();
    }
    public boolean chequearPass(){
        System.out.println("Ingrese la contraseña");
        String pass = leer.next();
        if(usuario.getPass().equals(pass)){
            return true;
        }else{
            return false;
        }
    }
    public void mostrarDatos(){
        System.out.println(usuario.toString());
    }
}
