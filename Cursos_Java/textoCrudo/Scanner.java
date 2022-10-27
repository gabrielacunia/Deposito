 public class Operaciones{
 public static void main(String args[]){
 
 int operacion =3;
 int numUno =8;
 int numDos=4;
 int resultado=0;

{System.out.println("Seleccionar 1 para suma, dos para resta, tres para multiplicacion y 4 para division"); 

 if(operacion==1){
 resultado= numUno + numDos;
 System.out.println("El resultado de la suma es " + resultado);
 } else 
  if(operacion==2){
 resultado= numUno - numDos;
 System.out.println("El resultado de la resta es " + resultado);
 } else
  if(operacion==3){
 resultado= numUno * numDos;
 System.out.println("El resultado de la multiplicacion es " + resultado);
 } else
  if(operacion==4){
 resultado= numUno / numDos;
 System.out.println("El resultado de la division es   " + resultado);
 } else


 {System.out.println("El valor de la operacion es incorrecto");}


}
}
}