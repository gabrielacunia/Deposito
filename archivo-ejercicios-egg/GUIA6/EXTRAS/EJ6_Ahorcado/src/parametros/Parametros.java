/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parametros;

/**
 *
 * @author GACUNA
 */
public class Parametros {
    private String[] palabra;
    private String[] parcial;
    private int intentos;
    private int letrasEncontradas;
    

    public Parametros() {
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public String[] getParcial() {
        return parcial;
    }

    public void setParcial(String[] parcial) {
        this.parcial = parcial;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public Parametros(String[] palabra, String[] parcial, int intentos, int letrasEncontradas) {
        this.palabra = palabra;
        this.parcial = parcial;
        this.intentos = intentos;
        this.letrasEncontradas = letrasEncontradas;
    }

}
