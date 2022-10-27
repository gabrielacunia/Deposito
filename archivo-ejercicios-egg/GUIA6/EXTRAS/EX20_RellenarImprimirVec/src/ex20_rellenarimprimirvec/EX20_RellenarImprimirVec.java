/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex20_rellenarimprimirvec;

/**
 *
 * @author GACUNA
 */
public class EX20_RellenarImprimirVec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = new int[5];
        vector = rellenar(vector,5);
        imprimir(vector,5);
    }
    public static int[] rellenar(int[] a, int b){
        int[] retorno;
        for(int i =0; i < b; i++){
            a[i] = (int)(Math.random()*10);   
        }
        retorno = a;
        return retorno;
    }
    public static int[] imprimir(int[] a, int b){
        for(int i =0; i < b; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("");
        return a;
    }
}
