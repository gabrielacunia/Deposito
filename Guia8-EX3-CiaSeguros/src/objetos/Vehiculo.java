/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import clasesEnum.Color;
import clasesEnum.MarcaVehiculo;
import clasesEnum.TipoVehiculo;

/**
 *
 * @author GACUNA
 */
public class Vehiculo {
    private MarcaVehiculo marca;
    private String modelo;
    private int ano;
    private int numMotor;
    private int numChasis;
    private Color color;
    private TipoVehiculo tipo;

    public Vehiculo() {
    }

    public Vehiculo(MarcaVehiculo marca, String modelo, int ano, int numMotor, int numChasis, Color color, TipoVehiculo tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.numMotor = numMotor;
        this.numChasis = numChasis;
        this.color = color;
        this.tipo = tipo;
    }

    public MarcaVehiculo getMarca() {
        return marca;
    }

    public void setMarca(MarcaVehiculo marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getNumMotor() {
        return numMotor;
    }

    public void setNumMotor(int numMotor) {
        this.numMotor = numMotor;
    }

    public int getNumChasis() {
        return numChasis;
    }

    public void setNumChasis(int numChasis) {
        this.numChasis = numChasis;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public TipoVehiculo getTipo() {
        return tipo;
    }

    public void setTipo(TipoVehiculo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", numMotor=" + numMotor + ", numChasis=" + numChasis + ", color=" + color + ", tipo=" + tipo + '}';
    }
    
}
