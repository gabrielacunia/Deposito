public class Variables{
 public static void main(String args[]){
int i=1, a=100;

System.out.println("Secuencia 1 al 10 con 'for'");
	for (i=1; i<=5; i++){
if (a-i>95){
System.out.print(i + ", " + (a -i) + ", ");
}
else{System.out.println(i + ", " + (a -i));
}
}

System.out.println("Secuencia 1 al 10 con 'while'");

i=1;

while (i<=5){
if (a-i>95){
System.out.print(i + ", " + (a -i) + ", ");
} else {
System.out.println(i + ", " + (a -i));
}
i++;
}

System.out.println("Secuencia 1 al 10 con 'do-while'");

i=1;

do{
if (a-i>95){
System.out.print(i + ", " + (a -i) + ", ");
} else {System.out.print(i + ", " + (a -i));
}
i++;
}while (i<=5);

}
}
