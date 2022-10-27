
package logica;

import cancion.Cancion;

public class Logica {
    
    public void setearCancion(Cancion a, String b, String c){
        a.setAutor(b);
        a.setTitulo(c);  
    }
    public String mostrarCancion(Cancion a){
        return a.toString();
    }
}
