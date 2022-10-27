/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8.ej3.baraja;

import logica.Logica;

/**
 *
 * @author GACUNA
 */
public class GUIA8EJ3BARAJA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Logica log1 = new Logica();
        log1.crearBaraja();
        log1.barajar();
        log1.siguienteCarta();
        log1.cartasDisponibles();
        log1.darCartas();
        log1.cartasMonton();
        log1.mostrarBaraja();
    }
    
}
