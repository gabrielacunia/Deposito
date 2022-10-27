
import java.util.Scanner;


public class EjemploUno {

    public static void main(String[] args) {
  
        String cadena_original="", caracter_solo="";
int num_caracteres=0;

Scanner in= new Scanner(System.in);
System.out.print("Introduce una cadena de carateres:");
cadena_original= in.nextLine();

int i = cadena_original.length();
int g = i -1;
//caracter_solo = cadena_original.substring(g,i);
  while (i > 0){
  caracter_solo = cadena_original.substring(g,i);
  System.out.print(caracter_solo);
  i = i-1;
  g = g-1;
    }

//(i,y)
    }  
}