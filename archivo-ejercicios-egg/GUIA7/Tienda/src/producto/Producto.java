/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package producto;

/**
 *
 * @author GACUNA
 */
public class Producto {
    private String nombreInsumo;
    private Integer valor;

    public Producto() {
    }

    public Producto(String nombreInsumo, Integer valor) {
        this.nombreInsumo = nombreInsumo;
        this.valor = valor;
    }

    public String getNombreInsumo() {
        return nombreInsumo;
    }

    public void setNombreInsumo(String nombreInsumo) {
        this.nombreInsumo = nombreInsumo;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombreInsumo=" + nombreInsumo + ", valor=" + valor + '}';
    }
    
}
