/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import clasesEnum.FormasPago;
import java.util.Date;

/**
 *
 * @author GACUNA
 */
public class Cuotas {
    private int numCuota;
    private int montoCuota;
    private boolean cuotaPaga;
    private Date fechaVencimiento;
    private FormasPago formaPago;

    public Cuotas(int numCuota, int montoCuota, boolean cuotaPaga, Date fechaVencimiento, FormasPago formaPago) {
        this.numCuota = numCuota;
        this.montoCuota = montoCuota;
        this.cuotaPaga = cuotaPaga;
        this.fechaVencimiento = fechaVencimiento;
        this.formaPago = formaPago;
    }

    public Cuotas() {
    }

    public int getNumCuota() {
        return numCuota;
    }

    public void setNumCuota(int numCuota) {
        this.numCuota = numCuota;
    }

    public int getMontoCuota() {
        return montoCuota;
    }

    public void setMontoCuota(int montoCuota) {
        this.montoCuota = montoCuota;
    }

    public boolean isCuotaPaga() {
        return cuotaPaga;
    }

    public void setCuotaPaga(boolean cuotaPaga) {
        this.cuotaPaga = cuotaPaga;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public FormasPago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormasPago formaPago) {
        this.formaPago = formaPago;
    }
   
}
