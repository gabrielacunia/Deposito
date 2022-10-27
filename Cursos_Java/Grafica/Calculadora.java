import javax.swing.*;
import java.awt.event.*;

public class Parseo extends JFrame implements ActionListener{
private JTextField text1, text2;
private JLabel label1, label2, label3;
private JButton boton1, boton2;

public Parseo(){
setLayout(null);
label1 = new JLabel ("Valor 1:");
label1.setBounds(50,5,100,30);
add(label1);

label2 = new JLabel("Valor 2:");
label2.setBounds(50,35,100,30);
add(label2);

label3= new JLabel("Resultado:");
label3.setBounds(120,80,150,30);
add(label3);

text1 = new JTextField();
text1.setBounds(120,10,150,20);
add(text1);

text2 = new JTextField();
text2.setBounds(120,40,150,20);
add(text2);

boton1 = new JButton("Sumar");
boton1.setBounds(10,80,100,30);
add(boton1);
boton1.addActionListener(this);

boton2 = new JButton("Clear");
boton2.setBounds(10,120,100,30);
add(boton2);
boton2.addActionListener(this);
}

public void actionPerformed(ActionEvent e){
if(e.getSource() == boton1){
int valor1 = 0, valor2 = 0, resultado = 0;

valor1 = Integer.parseInt(text1.getText());
valor2 = Integer.parseInt(text2.getText());
resultado = valor1 + valor2;

label3.setText("Resultado: " + resultado);

}

if(e.getSource() == boton2){
label3.setText("Resultado: ");
text1.setText("");
text2.setText("");

}
}
public static void main(String args[]){
Parseo ventana1 = new Parseo();
ventana1.setBounds(0,0,300,200);
ventana1.setVisible(true);
ventana1.setResizable(false);
ventana1.setLocationRelativeTo(null);
}
}