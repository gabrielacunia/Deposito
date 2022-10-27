/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import fecha.Fecha;
import java.util.Scanner;

/**
 *
 * @author GACUNA
 */
public class Logica {

    Fecha fecha1 = new Fecha();
    Scanner leer = new Scanner(System.in);

    public void setearFecha() {
        System.out.println("Ingrese dia");
        fecha1.setDia(leer.nextInt());
        System.out.println("Ingrese mes");
        fecha1.setMes(leer.nextInt());
        System.out.println("Ingrese ano");
        verificarAno(leer.nextInt());
    }

    public void verificarAno(int a) {
        if (a >= 1900 && a <= 2021) {
            fecha1.setAno(a);
        }
    }

    public void conocerDias(int mes) {
        switch (mes) {
            case 1:
                System.out.println("El mes 1 (Enero) tiene 31 dias");
                break;
            case 2:
                System.out.println("El mes 1 (Febrero) tiene 28 dias");
                break;
            case 3:
                System.out.println("El mes 1 (Marzo) tiene 31 dias");
                break;
            case 4:
                System.out.println("El mes 1 (Abril) tiene 30 dias");
                break;
            case 5:
                System.out.println("El mes 1 (Mayo) tiene 31 dias");
                break;
            case 6:
                System.out.println("El mes 1 (Junio) tiene 30 dias");
                break;
            case 7:
                System.out.println("El mes 1 (Julio) tiene 31 dias");
                break;
            case 8:
                System.out.println("El mes 1 (Agosto) tiene 31 dias");
                break;
            case 9:
                System.out.println("El mes 1 (Septiembre) tiene 30 dias");
                break;
            case 10:
                System.out.println("El mes 1 (Octubre) tiene 31 dias");
                break;
            case 11:
                System.out.println("El mes 1 (Noviembre) tiene 30 dias");
                break;
            case 12:
                System.out.println("El mes 1 (Diciembre) tiene 31 dias");
                break;
            default:
                System.out.println("Ha ingresado un mes no valido (1-12)");
        }
    }

    public void diaAnterior() {
        int dia = fecha1.getDia();
        int mes = fecha1.getMes();
        int ano = fecha1.getAno();
        if (dia > 1) {
            dia = dia - 1;
        } else if (mes == 5 || mes == 7 || mes == 10) {
            dia = 30;
        } else if (mes == 3) {
            dia = 28;
        } else {
            dia = 31;
        }
        if (fecha1.getDia() == 1) {
            if (mes != 1) {
                mes = mes - 1;
            } else {
                mes = 12;
            }
        }
        if (fecha1.getDia() == 1 && fecha1.getMes() == 1) {
            ano = ano - 1;
        }
        System.out.println(dia + "-" + mes + "-" + ano);
    }

    public void diaPosterior() {
        int dia = fecha1.getDia();
        int mes = fecha1.getMes();
        int ano = fecha1.getAno();
        if (dia == 31) {
            dia = 1;
            if (mes == 12) {
                mes = 1;
                ano = ano + 1;
            } else {
                mes = mes + 1;
            }
        } else if (mes == 4 || mes == 6 || mes == 7 || mes == 9 || mes == 11) {
            if (dia == 30) {
                dia = 1;
                mes = mes + 1;
            }
        } else {
            dia = dia + 1;
        }
            if (mes == 2) {
                if (dia == 28) {
                    dia = 1;
                } else {
                dia = dia + 1;
                }
            }
        
            System.out.println(dia + "-" + mes + "-" + ano);  
    }
    public void anoBisiesto(){
       if(fecha1.getAno() % 4 == 0){
           System.out.println("El año es bisiesto");
       }else{
           System.out.println("El año no es bisiesto");
       }
    }
}
