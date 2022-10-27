/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematica;
import java.util.Scanner;
import numeros.numeros;

/**
 *
 * @author GACUNA
 */
public class matematica {
    public numeros insertarNum(){
        numeros n = new numeros();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los numeros a procesar");
        n.setNumero1(leer.nextInt());
        n.setNumero2(leer.nextInt());
        return (n);
    }

    public double sumar(numeros n){
     return n.getNumero1() + n.getNumero2();  
    }
    public double restar(numeros num1){
      return num1.getNumero1() - num1.getNumero2();  
    }
    public double dividir(numeros n){
        if(n.getNumero2() == 0){
            return 0;
        }
      return n.getNumero1() / n.getNumero2();  
    }
    public double multiplicar(numeros n){
       return n.getNumero1() * n.getNumero2(); 
    }
}
