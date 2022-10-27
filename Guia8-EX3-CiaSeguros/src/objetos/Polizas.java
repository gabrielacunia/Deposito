/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import clasesEnum.Cobertura;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author GACUNA
 */
public class Polizas {
    private Clientes cliente;
    private ArrayList<Vehiculo> vehiculos;
    private int poliza;
    private Date fechaInicio;
    private Date fechaFin;
    private Cuotas cuotas;
    private int montoAsegurado;
    private boolean granizo;
    private int montoGranizo;
    private Cobertura tipoCobertura;

//    public Polizas() {
//    }

    public Polizas(Clientes cliente, ArrayList<Vehiculo> vehiculos, int poliza, Date fechaInicio, Date fechaFin, Cuotas cuotas, int montoAsegurado, boolean granizo, int montoGranizo, Cobertura tipoCobertura) {
        this.cliente = cliente;
        this.vehiculos = vehiculos;
        this.poliza = poliza;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cuotas = cuotas;
        this.montoAsegurado = montoAsegurado;
        this.granizo = granizo;
        this.montoGranizo = montoGranizo;
        this.tipoCobertura = tipoCobertura;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public int getPoliza() {
        return poliza;
    }

    public void setPoliza(int poliza) {
        this.poliza = poliza;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Cuotas getCuotas() {
        return cuotas;
    }

    public void setCuotas(Cuotas cuotas) {
        this.cuotas = cuotas;
    }

    public int getMontoAsegurado() {
        return montoAsegurado;
    }

    public void setMontoAsegurado(int montoAsegurado) {
        this.montoAsegurado = montoAsegurado;
    }

    public boolean isGranizo() {
        return granizo;
    }

    public void setGranizo(boolean granizo) {
        this.granizo = granizo;
    }

    public int getMontoGranizo() {
        return montoGranizo;
    }

    public void setMontoGranizo(int montoGranizo) {
        this.montoGranizo = montoGranizo;
    }

    public Cobertura getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(Cobertura tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    @Override
    public String toString() {
        return "Polizas{" + /*"cliente=" + cliente + ",*/ "vehiculos=" + vehiculos + ", poliza=" + poliza + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", cuotas=" + cuotas + ", montoAsegurado=" + montoAsegurado + ", granizo=" + granizo + ", montoGranizo=" + montoGranizo + ", tipoCobertura=" + tipoCobertura + '}';
    }

}
