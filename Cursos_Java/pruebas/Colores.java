import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Colores extends JFrame implements ActionListener{
private JLabel label1, label2, label3;
private JComboBox combo1, combo2, combo3;
private JButton boton1;
private JTextField text1;
public Colores(){
setLayout(null);
label1 = new JLabel ("Rojo:");
label1.setBounds(10,10,100,10);
add(label1);

combo1 = new JComboBox();
combo1.setBounds(120,10,50,30);
combo1.addItem("i1c1");
combo1.addItem("i2c1");
combo1.addItem("i2c1");
add(combo1);

text1 = new JTextField();
text1.setBounds(150,120,150,30);
add(text1);

label2 = new JLabel ("Verde:");
label2.setBounds(10,50,100,10);
add(label2);

combo2 = new JComboBox();
combo2.setBounds(120,50,50,30);
combo2.addItem("i1c2");
combo2.addItem("i2c2");
combo2.addItem("i3c2");
add(combo2);

label3 = new JLabel ("Azul:");
label3.setBounds(10,90,100,10);
add(label3);

combo3 = new JComboBox();
combo3.setBounds(120,90,50,30);
combo3.addItem("i1c3");
combo3.addItem("i2c3");
combo3.addItem("i3c3");
add(combo3);

boton1 = new JButton("Fijar Color");
boton1.setBounds(10,130,100,30);
add(boton1);
boton1.addActionListener(this);

}
public void actionPerformed(ActionEvent e){
if(e.getSource() == boton1){

int cad1 = combo1.getSelectedIndex();
int cad2 = combo2.getSelectedIndex();
int cad3 = combo3.getSelectedIndex();
//int rojo = Integer.parseInt(cad1);
//int verde= Integer.parseInt(cad2);
//int azul = Integer.parseInt(cad3);

text1.setText(cad1 + cad2 + cad3 );
}
}
public static void main (String args[]){
Colores ventana1 = new Colores();
ventana1.setBounds(0,0,300,300);
ventana1.setResizable(false);
ventana1.setLocationRelativeTo(null);
ventana1.setVisible(true);
}
}