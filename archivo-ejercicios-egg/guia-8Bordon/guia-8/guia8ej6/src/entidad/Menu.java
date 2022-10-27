/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 * Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 * @author Pablo
 */
public class Menu {
    private String opcionUno = "1 - Cargar Producto";
    private String opcionDos = "2 - Mostrar Productos cargados";
    private String opcionTres = "3 - Buscar Producto";
    private String opcionCuatro = "4 - Eliminar Producto";
    private String opcionCinco = "5 - Salir";

    public String getOpcionUno() {
        return opcionUno;
    }

    public void setOpcionUno(String opcionUno) {
        this.opcionUno = opcionUno;
    }

    public String getOpcionDos() {
        return opcionDos;
    }

    public void setOpcionDos(String opcionDos) {
        this.opcionDos = opcionDos;
    }

    public String getOpcionTres() {
        return opcionTres;
    }

    public void setOpcionTres(String opcionTres) {
        this.opcionTres = opcionTres;
    }

    public String getOpcionCuatro() {
        return opcionCuatro;
    }

    public void setOpcionCuatro(String opcionCuatro) {
        this.opcionCuatro = opcionCuatro;
    }

    public String getOpcionCinco() {
        return opcionCinco;
    }

    public void setOpcionCinco(String opcionCinco) {
        this.opcionCinco = opcionCinco;
    }

    
}
