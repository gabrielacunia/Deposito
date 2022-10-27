import java.util.Scanner;

public class Login{
public static void main (String args[]){
 
String usuario="", password="";
Scanner entrada = new Scanner (System.in);

System.out.print("Ingresa tu nombre de usuario:");
usuario= entrada.nextLine();

System.out.print("Ingresa tu password:");
password= entrada.nextLine();

 if (usuario.equals("gabriel")&& password.equals("1234"))
{System.out.print("Inicio de sesion correcto");
} else {
System.out.print("Inicio de sesion incorrecto");
}

}
}