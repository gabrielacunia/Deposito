import javax.swing.*;
import javax.swing.ImageIcon.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.util.Scanner;
import java.awt.*;

public class CocaCola extends JFrame implements ActionListener{
private JLabel label1, label2, label3, label4;
private JCheckBox box1;
private JButton boton1;
private JTextField text1;
public static String textonombre = "";

public CocaCola(){
setLayout(null);

setDefaultCloseOperation(EXIT_ON_CLOSE);

setTitle("Sistema Vacacional - Bienvenida");
this.getContentPane().setBackground(Color.red);

//setIconImage(new ImageIcon(getClass().getResource("/ruta"));
Image icon = new ImageIcon(getClass().getResource("classes/icon.png")).getImage();
setIconImage(icon);

label1 = new JLabel("©2017 The Coca-Cola Company.");
label1.setBounds(100,550,400,30);
Font fuente1 = new Font("Calibri", 1, 20);
label1.setFont(fuente1); 
label1.setForeground(Color.white);
add(label1);

label2 = new JLabel("Introduzca su nombre: ");
label2.setBounds(50,410,400,30);
Font fuente2 = new Font("Calibri", 3, 15);
label2.setFont(fuente2); 
label2.setForeground(Color.white);
add(label2);

label3 = new JLabel("Sistema de Control Vacacional");
label3.setBounds(85,340,400,50);
Font fuente3 = new Font("Calibri", 3, 25);
label3.setFont(fuente3); 
label3.setForeground(Color.white);
add(label3);

//ImageIcon imagen = new ImageIcon ("/ruta");
label4 = new JLabel();
label4.setIcon(new ImageIcon("classes/logo-coca.png"));
label4.setBounds(90,50,400,300);
add(label4);

boton1 = new JButton("Continuar");
boton1.setBounds(50,500,100,30);
add(boton1);
boton1.addActionListener(this);
boton1.setEnabled(true);

text1 = new JTextField();
text1.setBounds(50,450,200,30);
text1.setBackground(new Color(200,200,200));
Font fuente4 = new Font("Calibri", 3, 20);
text1.setFont(fuente4);
text1.setForeground(Color.black);

add(text1);

}
public void actionPerformed(ActionEvent e){
if(e.getSource() == boton1){
textonombre = text1.getText().trim();
if(textonombre.equals("")) {
JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre");
}else{
CocaFrame2 ventana1 = new CocaFrame2();
ventana1.setBounds(0,0,700,600);
ventana1.setVisible(true);
ventana1.setResizable(false);
ventana1.setBackground(Color.red);
ventana1.setLocationRelativeTo(null);
this.setVisible(false);
}
}
}

public static void main(String args[]){
CocaCola ventana1 = new CocaCola();
ventana1.setBounds(0,0,480,620);
ventana1.setVisible(true);
ventana1.setResizable(false);
ventana1.setLocationRelativeTo(null);

}
}