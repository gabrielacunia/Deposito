/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex21_notas;

import java.util.Scanner;

/**
 *
 * @author GACUNA
 */
public class EX21_Notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de alumnos:");
        int al = leer. nextInt();
        double[][] matriz = new double[al][5];
        double nota;
        int contA = 0;
        int contD = 0;
        for(int i = 0; i < al; i++){
            double promedio = 0;
            for(int j = 0; j < 4; j++){
            System.out.println("Ingrese la nota " + (j+1) + " del alumno " + (i+1));
            nota= leer.nextDouble();
            matriz[i][j] = nota;
            if(j==0){
                promedio = promedio + nota*10/100;
            }
             if(j==1){
                promedio = promedio + nota*15/100;
            }
              if(j==2){
                promedio = promedio + nota*25/100;
            }
               if(j==3){
                promedio = promedio + nota*50/100;
            }
            matriz[i][4] = promedio;
        }
    }
         for(int i = 0; i < al; i++){
            if(matriz[i][4] >= 7){
                contA++;
            }else{
                contD++;
            }
         }
             System.out.println("Los alumnos aprobados son " + contA + " y los desaprobados son " + contD);
    } 
}
