/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex23_edgar;

import java.util.Scanner;

/**
 *
 * @author EANDRADA
 */
public class EX23_Edgar {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] palabra = null;
        String[][] sopa = new String[20][20];
        sopa = llenar(sopa);
        for (int i = 0; i <= 4; i++) {
            palabra = llenarpalabras(palabra);

            sopa = asignarmatriz(palabra, sopa);
        }

        sopa = numeros(sopa);
        
        imprimir(sopa);
    }

    public static String[][] llenar(String[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = "*";
            }
        }
        return a;
    }

    public static String[] llenarpalabras(String[] a) {
        Scanner leer = new Scanner(System.in);
        String palabra = "";
        int largo = 0;
        do {
            System.out.println("Ingrese una palabra entre 3 y 5 caracteres");
            palabra = leer.nextLine();
            largo = palabra.length();
            a = new String[largo];
        } while (largo < 3 || largo > 5);

        for (int i = 0; i < largo; i++) {
            a[i] = palabra.substring(i, (i + 1));
            }
        return a;
    }

    public static String[][] asignarmatriz(String[] a, String[][] b) {
        int aux = a.length;
        int rf = (int) (Math.random() * 17);
        int rc = (int) (Math.random() * 17);
        if ((b[rf][rc] == "*") && (rf + aux <= 20) && (rc + aux <= 20)) {
            for (int i = 0; i < a.length; i++) {
                b[rf][rc+i] = a[i];
            }
            return b;
        } else {
            //Para llamar a la funcion
            String[][] j = asignarmatriz(a, b);
        }
        return b;
    }

    public static String[][] numeros(String[][] a) {
        int num = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i][j] == "*") {
                    num = (int) (Math.random() * 9);
                    String numL = num + "";
                    a[i][j] = numL;
                }
            }
        }
        return a;
    }
    
    public static void imprimir(String [][]a){
            for (int i = 0; i < a.length; i++) {
                System.out.println(" ");
                for (int j = 0; j < a.length; j++) {
                    System.out.print(a[i][j]+" ");
                }
            }
    }

}
