/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.util.ArrayList;

/**
 *
 * @author GACUNA
 */
public class Clientes {
    private String nombreCompleto;
    private int dni;
    private String mail;
    private String domicilio;
    private int telefono;
    private ArrayList<Polizas> polizas;

    public Clientes() {
    }

    public Clientes(String nombreCompleto, int dni, String mail, String domicilio, int telefono, ArrayList<Polizas> polizas) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.mail = mail;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.polizas = polizas;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Polizas> getPolizas() {
        return polizas;
    }

    public void setPolizas(ArrayList<Polizas> polizas) {
        this.polizas = polizas;
    }

    @Override
    public String toString() {
        return "Clientes{" + "nombreCompleto=" + nombreCompleto + ", dni=" + dni + ", mail=" + mail + ", domicilio=" + domicilio + ", telefono=" + telefono + ", polizas=" + polizas + '}';
    }
    
}
