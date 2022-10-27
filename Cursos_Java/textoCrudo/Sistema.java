import java.util.Scanner;

public class Sistema {
  public static void main(String args[]) {

Scanner in = new Scanner ( System.in) ; 

String nombre = ""; 
int clave= 0 , antiguedad = 0 ; 

System.out.println("*********************************************") ; 
System.out.println("BIENVENIDOS AL SISTEMA VACACIONAL DE COCACOLA") ;
System.out.println("*********************************************") ; 
 

System.out.println( "Nombre del Empleado" ) ;
nombre =  in.nextLine(); 
System.out.print("");

System.out.println ( "Clave del Empleado: " ) ;
clave =  in.nextInt();
do{
System.out.println("Esa Clave no existe ");
System.out.println ( "Clave del Empleado: " ) ;
clave =  in.nextInt();
}while(clave!=1 && clave!=2 && clave!=3);


System.out.print("");


System.out.println ( " Cual es la  Antiguedad del Empleado: " ) ;
antiguedad =  in.nextInt(); 
System.out.print("");


if (clave==1){

if (antiguedad==1) {
System.out.println(" El empleado tiene derecho a 6 dias de vacaciones " ) ; 
}

else if ( antiguedad>=2 && antiguedad <=6){
System.out.println(" El empleado tiene derecho a 14 dias de vacaciones " ) ; 
}

else if ( antiguedad>6){
System.out.println(" El empleado tiene derecho a 20 dias de vacaciones " ) ; 
}

else {
System.out.println(" El empleado no tiene  derecho a  vacaciones " ) ; 
}
}

else

if (clave==2){

if (antiguedad==1) {
System.out.println(" El empleado tiene derecho a 7 dias de vacaciones " ) ; 
}

else if ( antiguedad<=6 && antiguedad >1){
System.out.println(" El empleado tiene derecho a 15 dias de vacaciones " ) ; 
}

else if ( antiguedad>=7){
System.out.println(" El empleado tiene derecho a 22 dias de vacaciones " ) ; 
}
else {
System.out.println(" El empleado no tiene  derecho a  vacaciones " ) ; 
}
}


else if (clave==3){

if (antiguedad==1) {
System.out.println(" El empleado tiene derecho a 10 dias de vacaciones " ) ; 
}

else if ( antiguedad<=6 && antiguedad >1){
System.out.println(" El empleado tiene derecho a 20 dias de vacaciones " ) ; 
}

else if ( antiguedad>=7){
System.out.println(" El empleado tiene derecho a 30 dias de vacaciones " ) ; 
}
else {
System.out.println(" El empleado no tiene  derecho a  vacaciones " ) ; 
}
}

}
}