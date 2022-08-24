/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculos;

import java.util.Scanner;
import rectangulo.rectangulo;

/**
 *
 * @author GACUNA
 */
public class calculos {
   public rectangulo crearRectangulo(){
   rectangulo r1 = new rectangulo();
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese la altura del rectangulo");
   r1.setAltura(leer.nextDouble());
   System.out.println("Ingrese la base del rectangulo");
   r1.setBase(leer.nextDouble());
    return r1;
   }
   public double recArea(rectangulo R){
    return R.getBase() * R.getAltura();
   }
    
   public double recPerimetro(rectangulo R){
    return (R.getAltura() + R.getBase())*2;
   }  
   public void dibujarRectangulo(rectangulo R){
       for(int i=0; i < R.getAltura(); i++ ){
         for(int j=0; j < R.getBase(); j++){
             if(j==0 || i == 0 || i == R.getAltura() -1 || j == R.getBase() -1){
                 System.out.print("* ");
             }else{
                 System.out.print("  ");
             }
         }   
           System.out.println("");
       }
   }
    
}
