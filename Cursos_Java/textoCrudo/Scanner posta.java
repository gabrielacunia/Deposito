import java.util.Scanner;

public class Sistema{
 public static void main(String args []){
  System.out.println("Bienvenido al sistema vacacional de CocaCola Company");
   Scanner in = new Scanner (System.in);
    String nombre = "";

     int Clase=0, Antiguedad=0;

 System.out.println("Cual es su nombre?");
  nombre = in.nextLine();
   System.out.println("Ingrese su clave:");
    Clase = in.nextInt();
     System.out.println("Ingrese sus años de servicio;");
      Antiguedad = in.nextInt();

if (Clase!=1 && Clase!=2 && Clase!=3) {
 System.out.println("El codigo de Clase no existe");
}

else

if (Clase==1 && Antiguedad == 1) {
 System.out.println(nombre + ", tienes derecho a 6 dias de vacaciones");
}
 else 
  
if (Clase==1 && Antiguedad >= 2 && Antiguedad <=6) {
 System.out.println(nombre + ", tienes derecho a 14 dias de vacaciones");
}   

else

if (Clase==1 && Antiguedad > 6) {
 System.out.println(nombre + ", tienes derecho a 20 dias de vacaciones");
}
 else 
   
if (Clase==2 && Antiguedad ==1) {
 System.out.println(nombre + ", tienes derecho a 7 dias de vacaciones");
}
 else
    
if (Clase==2 && Antiguedad >= 2 && Antiguedad <=6) {
 System.out.println(nombre + ", tienes derecho a 15 dias de vacaciones");
}
 else
     
if (Clase==2 && Antiguedad > 6) {
 System.out.println(nombre + ", tienes derecho a 22 dias de vacaciones");
}
 else
      
if (Clase==3 && Antiguedad ==1) {
 System.out.println(nombre + ", tienes derecho a 10 dias de vacaciones");
}
 else
       
if (Clase==3 && Antiguedad >= 2 && Antiguedad <=6) {
 System.out.println(nombre + ", tienes derecho a 20 dias de vacaciones");
}
 else
        
if (Clase==3 && Antiguedad > 6) {
 System.out.println(nombre + ", tienes derecho a 30 dias de vacaciones");
}
 else

{System.out.println(nombre + ", note corresponden vacaciones");
}

}
}
