/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transaccion;

import cuenta.cuenta;
import java.util.Scanner;

/**
 *
 * @author GACUNA
 */
public class transaccion {

    Scanner leer = new Scanner(System.in);

    public cuenta crearCuenta() {
        cuenta cuenta1 = new cuenta();
        System.out.println("Ingrese su DNI");
        cuenta1.setDni(leer.nextLong());
        System.out.println("Ingrese su saldo");
        cuenta1.setSaldo(leer.nextInt());
        System.out.println("Ingrese su numero de cliente");
        cuenta1.setNumeroCuenta(leer.nextInt());
        return cuenta1;
    }

    public void ingresar(cuenta R) {
        System.out.println("Ingrese el monto que desea ingresar:");
        double saldo = R.getSaldo() + leer.nextDouble();
        R.setSaldo(saldo);
        saldo(R);  
    }

    public void retirar(cuenta R) {
        System.out.println("Ingrese el monto que desea retirar:");
        double retiro = leer.nextDouble();
        double saldo = R.getSaldo();
        if (retiro > saldo) {
            saldo = 0;
        } else {
            saldo = saldo - retiro;
        }
        R.setSaldo(saldo);
        saldo(R);   
    }

    public void retirarFast(cuenta R) {
        double retiro = 0;
        double saldo = R.getSaldo();
        do {
            System.out.println("Ingrese el monto que desea retirar (inferior al 20% del saldo):");
            retiro = leer.nextDouble();
        } while (saldo * 20 / 100 < retiro);
        saldo = saldo - retiro;
        R.setSaldo(saldo);
        saldo(R);
    }

    public void saldo(cuenta R) {
        System.out.println("El saldo actual es " + R.getSaldo());
    }

    public void consultaDatos(cuenta R) {
        System.out.println(R.toString());
    }
}
