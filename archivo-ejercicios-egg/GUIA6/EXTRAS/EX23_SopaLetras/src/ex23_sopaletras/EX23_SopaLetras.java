/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex23_sopaletras;

import java.util.Scanner;

/**
 *
 * @author GACUNA
 */
public class EX23_SopaLetras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[][] matriz = new String[20][20];
        String palabra;
        int fila1 = 0;
        int fila2 = 0;
        int fila3 = 0;
        int fila4 = 0;
        int fila5 = 0;

        fila1 = Aleatorio(20, fila2, fila3, fila4, fila5);
        fila2 = Aleatorio(20, fila1, fila3, fila4, fila5);
        fila3 = Aleatorio(20, fila2, fila1, fila4, fila5);
        fila4 = Aleatorio(20, fila2, fila3, fila1, fila5);
        fila5 = Aleatorio(20, fila2, fila3, fila4, fila1);
        System.out.println("Ingrese la palabra 1");
        String palabra1 = leer.next();
        System.out.println("Ingrese la palabra 2");
        String palabra2 = leer.next();
        System.out.println("Ingrese la palabra 3");
        String palabra3 = leer.next();
        System.out.println("Ingrese la palabra 4");
        String palabra4 = leer.next();
        System.out.println("Ingrese la palabra 5");
        String palabra5 = leer.next();
        int col1 = (int) (Math.random() * (20 - palabra1.length()));
        System.out.println(col1);
        int col2 = (int) (Math.random() * (20 - palabra2.length()));
        System.out.println(col2);
        int col3 = (int) (Math.random() * (20 - palabra3.length()));
        System.out.println(col3);
        int col4 = (int) (Math.random() * (20 - palabra4.length()));
        System.out.println(col4);
        int col5 = (int) (Math.random() * (20 - palabra5.length()));

        for (int i = 0; i < 20; i++) {
            System.out.println("check1");
            for (int j = 0; j < 20; j++) {
                System.out.println("check");
                if (i == fila1 && j == col1) {
                    for (int h = j; h < palabra1.length() + h; h++) {
                        matriz[i][h] = palabra1.substring(0, 1);
                        palabra1 = palabra1.substring(1, palabra1.length());
                    }
                }
                if (i == fila2 && j == col2) {
                    for (int h = j; h < palabra2.length() + h; h++) {
                        matriz[i][h] = palabra2.substring(0, 1);
                        palabra2 = palabra2.substring(1, palabra2.length());
                    }
                }
                if (i == fila3 && j == col3) {
                    for (int h = j; h < palabra3.length() + h; h++) {
                        matriz[i][h] = palabra3.substring(0, 1);
                        palabra3 = palabra3.substring(1, palabra3.length());
                    }
                }
                if (i == fila4 && j == col4) {
                    for (int h = j; h < palabra4.length() + h; h++) {
                        matriz[i][h] = palabra4.substring(0, 1);
                        palabra4 = palabra4.substring(1, palabra4.length());
                    }
                }
                if (i == fila5 && j == col5) {
                    for (int h = j; h < palabra5.length() + h; h++) {
                        matriz[i][h] = palabra5.substring(0, 1);
                        palabra5 = palabra5.substring(1, palabra5.length());
                    }
                }
            }
        }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (matriz[i][j] == null) {
                    matriz[i][j] = Integer.toString((int) (Math.random() * 10));
                }
            }
        }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public static int Aleatorio(int a, int b, int c, int d, int e) {
        int respuesta;
        do {
            respuesta = (int) (Math.random() * a);
        } while (respuesta == b || respuesta == c || respuesta == d || respuesta == e);
        return respuesta;
    }
}
