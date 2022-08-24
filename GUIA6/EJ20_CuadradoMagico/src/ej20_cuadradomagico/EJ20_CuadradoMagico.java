/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej20_cuadradomagico;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class EJ20_CuadradoMagico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
         int[][] matriz = new int[3][3];
        for(int i=0; i < 3; i++ ){
            for(int j=0; j<3; j++ ){
                do{
                System.out.println("Ingresar valor " + i + ", " + j + " (entre 1 y 9)");
                matriz[i][j] = leer.nextInt();
                }while(matriz[i][j]>9 || matriz[i][j]<1);
            }
        }
        int fila1 =0;
        int fila2 =0;
        int fila3 =0;
        int col1 =0;
        int col2 =0;
        int col3 =0;
        int diag1 =0;
        int diag2 =0;
        for(int i=0; i < 3; i++ ){
            for(int j=0; j<3; j++ ){
                if(i==0){
                    fila1 = fila1 + matriz[i][j];
                }
                 if(i==1){
                    fila2 = fila2 + matriz[i][j];
                }
                  if(i==2){
                    fila3 = fila3 + matriz[i][j];
                }
                 if(j==0){
                    col1 = col1 + matriz[i][j];
                }
                 if(j==1){
                    col2 = col2 + matriz[i][j];
                }
                 if(j==2){
                    col3 = col3 + matriz[i][j];
                }
                 if(j==i){
                    diag1 = diag1 + matriz[i][j];
                }
                 if(j+i==2){
                    diag2 = diag2 + matriz[i][j];
                }
            }
            }
        if(fila1 == fila2 && fila1 == fila3 && fila1 == col1 && fila1 == col2 && fila1 == col3 && fila1 == diag1 && fila1 == diag2){
            System.out.println("El cubo es magico");
        }else{
            System.out.println("El cubo no es magico");
        }
} 
}
            

        
    
    
