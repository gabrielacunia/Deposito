public class Variables3{
 public static void main(String args[]){


int a=0, b=1, c=0;

System.out.println("Secuencia con 'for'");

	for (int i=0; i<10; i++){
if (a<34){
System.out.print(a + ", ");
}
else {System.out.println(a);
}
c=a+b;
a=b;
b=c;
}

a=0;
b=1; 
c=0;

System.out.println("Secuencia con 'while'");

	while(a<=34){
if (a<34){
System.out.print(a + ", ");
}
else {System.out.println(a);
}
c=a+b;
a=b;
b=c;
}

a=0;
b=1; 
c=0;

System.out.println("Secuencia con 'do-while'");

	do{
if (a<34){
System.out.print(a + ", ");
}
else {System.out.println(a);
}
c=a+b;
a=b;
b=c;
}while(a<=34);



}
}