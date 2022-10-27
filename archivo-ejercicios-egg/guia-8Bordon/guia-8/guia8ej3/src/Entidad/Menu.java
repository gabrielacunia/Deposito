/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Pablo
 */
public class Menu {
   
    private String opcion1 = "1 - Agregar alumno";
    private String opcion2 = "2 - Mostrar alumnos";
    private String opcion3 = "3 - Eliminar alumno";
    private String opcion4 = "4 - Obtener promedio de alumno";
    private String opcion5 = "5 - Salir";

    public String getOpcion1() {
        return opcion1;
    }

    public void setOpcion1(String opcion1) {
        this.opcion1 = opcion1;
    }

    public String getOpcion2() {
        return opcion2;
    }

    public void setOpcion2(String opcion2) {
        this.opcion2 = opcion2;
    }

    public void setOpcion3(String opcion3) {
        this.opcion3 = opcion3;
    }

    public String getOpcion3() {
        return opcion3;
    }

    public void setOpcion4(String opcion4) {
        this.opcion4 = opcion4;
    }

    public String getOpcion4() {
        return opcion4;
    }

    public String getOpcion5() {
        return opcion5;
    }

    public void setOpcion5(String opcion5) {
        this.opcion5 = opcion5;
    }

    public void imprimirMenu(){
        System.out.println("Menú de opciones");
        System.out.println("");
        System.out.println(this.opcion1);
        System.out.println(this.opcion2);
        System.out.println(this.opcion3);
        System.out.println(this.opcion4);
        System.out.println(this.opcion5);
    }
}
