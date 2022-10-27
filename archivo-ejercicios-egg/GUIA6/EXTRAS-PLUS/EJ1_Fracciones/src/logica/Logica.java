/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;
import fracciones.Fracciones;
/**
 *
 * @author GACUNA
 */
public class Logica {
    Fracciones f1 = new Fracciones();
    
    public void setearFracciones(int a, int b, int c, int d){
        f1.setNume1(a);
        f1.setDenom1(b);
        f1.setNume2(c);
        f1.setDenom2(d);
    }
    public String sumar(){
        int a = f1.getNume1()*f1.getDenom2() + f1.getDenom1()*f1.getNume2();
        int b = f1.getDenom1()*f1.getDenom2();
        return Integer.toString(a) + "/" + Integer.toString(b);
    }
      public String restar(){
        int a = f1.getNume1()*f1.getDenom2() - f1.getDenom1()*f1.getNume2();
        int b = f1.getDenom1()*f1.getDenom2();
        return Integer.toString(a) + "/" + Integer.toString(b);
    }
        public String multiplicar(){
        int a = f1.getNume1()*f1.getNume2();
        int b = f1.getDenom1()*f1.getDenom2();
        return Integer.toString(a) + "/" + Integer.toString(b);
    }
          public String dividir(){
        int a = f1.getNume1()*f1.getDenom2();
        int b = f1.getDenom1()*f1.getNume2();
        return Integer.toString(a) + "/" + Integer.toString(b);
    }
    
}
