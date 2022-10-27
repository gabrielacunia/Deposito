/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 * • Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 * @author Pablo
 */
public class menu {

        private String option1 = "1 - Load movie";
        private String option2 = "2 - Show All Movies"; 
        private String option3 = "3 - Order by Timelength (Max-Min)";
        private String option4 = "4 - Order by Timelength (Min-Max)";
        private String option5 = "5 - Order by Title (A-Z)";
        private String option6 = "6 - Order by Director (A-Z)";
        private String option7 = "7 - Exit";

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public String getOption4() {
        return option4;
    }

    public void setOption4(String option4) {
        this.option4 = option4;
    }

    public String getOption5() {
        return option5;
    }

    public void setOption5(String option5) {
        this.option5 = option5;
    }

    public String getOption6() {
        return option6;
    }

    public void setOption6(String option6) {
        this.option6 = option6;
    }

    public String getOption7() {
        return option7;
    }

    public void setOption7(String option7) {
        this.option7 = option7;
    }
    
    public void printMenu(){
    
        System.out.println("Options");
        System.out.println("");
        System.out.println(this.option1);
        System.out.println(this.option2);
        System.out.println(this.option3);
        System.out.println(this.option4);
        System.out.println(this.option5);
        System.out.println(this.option6);
        System.out.println(this.option7);
        System.out.println("");        
    }
    
}
