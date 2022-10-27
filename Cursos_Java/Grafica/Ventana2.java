import javax.swing.*;

public class Ventana2 extends JFrame{

private JLabel label1;
private JLabel label2;

public Ventana2(){
setLayout(null);
label1 = new JLabel("Interfaz grafica");
label1.setBounds(10,20,300,30);
add (label1);
label2 = new JLabel("version1.0");
label2.setBounds(10,100,100,30);
add(label2);
}

public static void main (String args[]){
Ventana2 ventana2 = new Ventana2();
ventana2.setBounds(0,0,300,200);
ventana2.setResizable(false);
ventana2.setVisible(true);
ventana2.setLocationRelativeTo(null);

}
}