/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SUBE.sube_operacion;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Gabriel
 */


public class Panelx extends JFrame implements ActionListener{
private JLabel label1, label2, label3, label4;
private JCheckBox box1;
private JButton boton1, boton2,  boton3, boton4, boton5, boton6, boton7, boton8, boton9, boton10, boton11, boton12, boton13, boton14, boton15, boton16, boton17, boton18, boton19, boton20, boton21, boton22, boton23, boton24, boton25, boton26, boton27, boton28, boton29, boton30, boton31, boton32, boton33, boton34, boton35, boton36, boton37, boton38, boton39, boton40;   ;
private JTextField text1;
public static String textonombre = "";

public Panelx(){
setLayout(null);

setDefaultCloseOperation(EXIT_ON_CLOSE);

setTitle("Simulador - SUBE");
this.getContentPane().setBackground(Color.blue);

//setIconImage(new ImageIcon(getClass().getResource("classes/icon.png")).getImage());
//Image icon = new ImageIcon(getClass().getResource("classes/icon.png")).getImage();
//setIconImage(icon);



label2 = new JLabel("Introduzca su nombre: ");
label2.setBounds(50,410,400,30);
Font fuente2 = new Font("Calibri", 3, 15);
label2.setFont(fuente2); 
label2.setForeground(Color.white);
//add(label2);

//ImageIcon imagen = new ImageIcon ("/ruta");
label4 = new JLabel();
label4.setIcon(new ImageIcon("classes/LogoSube.gif"));
label4.setBounds(700,2,250,150);
add(label4);

label3 = new JLabel("Simulador de Sistema Sube");
label3.setBounds(715,110,400,50);
Font fuente3 = new Font("Calibri", 3, 20);
label3.setFont(fuente3); 
label3.setForeground(Color.white);
add(label3);

boton1 = new JButton("F1");
boton1.setBounds(20,380,100,50);
add(boton1);
boton1.addActionListener(this);
boton1.setEnabled(true);

boton2 = new JButton("F4");
boton2.setBounds(20,435,100,50);
add(boton2);
boton2.addActionListener(this);
boton2.setEnabled(true);

boton3 = new JButton("F7");
boton3.setBounds(20,490,100,50);
add(boton3);
boton3.addActionListener(this);
boton3.setEnabled(true);

boton4 = new JButton("F10");
boton4.setBounds(20,545,100,50);
add(boton4);
boton4.addActionListener(this);
boton4.setEnabled(true);

boton5 = new JButton("F13");
boton5.setBounds(20,600,100,50);
add(boton5);
boton5.addActionListener(this);
boton5.setEnabled(true);

boton6 = new JButton("F2");
boton6.setBounds(125,380,100,50);
add(boton6);
boton6.addActionListener(this);
boton6.setEnabled(true);

boton7 = new JButton("F5");
boton7.setBounds(125,435,100,50);
add(boton7);
boton7.addActionListener(this);
boton7.setEnabled(true);

boton8 = new JButton("F8");
boton8.setBounds(125,490,100,50);
add(boton8);
boton8.addActionListener(this);
boton8.setEnabled(true);

boton9 = new JButton("F11");
boton9.setBounds(125,545,100,50);
add(boton9);
boton9.addActionListener(this);
boton9.setEnabled(true);

boton10 = new JButton("F14");
boton10.setBounds(125,600,100,50);
add(boton10);
boton10.addActionListener(this);
boton10.setEnabled(true);

boton11 = new JButton("F3");
boton11.setBounds(230,380,100,50);
add(boton11);
boton11.addActionListener(this);
boton11.setEnabled(true);

boton12 = new JButton("F6");
boton12.setBounds(230,435,100,50);
add(boton12);
boton12.addActionListener(this);
boton12.setEnabled(true);

boton13 = new JButton("F9");
boton13.setBounds(230,490,100,50);
add(boton13);
boton13.addActionListener(this);
boton13.setEnabled(true);

boton14 = new JButton("F12");
boton14.setBounds(230,545,100,50);
add(boton14);
boton14.addActionListener(this);
boton14.setEnabled(true);

boton15 = new JButton("F15");
boton15.setBounds(230,600,100,50);
add(boton15);
boton15.addActionListener(this);
boton15.setEnabled(true);

boton16 = new JButton("<html><center>Servicio<p>Codigo<html>");
boton16.setBounds(345,380,100,50);
add(boton16);
boton16.addActionListener(this);
boton16.setEnabled(true);

boton17 = new JButton("1");
boton17.setBounds(345,435,100,50);
add(boton17);
boton17.addActionListener(this);
boton17.setEnabled(true);

boton18 = new JButton("<html><center>4<p>ghi<html>");
boton18.setBounds(345,490,100,50);
add(boton18);
boton18.addActionListener(this);
boton18.setEnabled(true);

boton19 = new JButton("<html><center>7<p>pqrs<html>");
boton19.setBounds(345,545,100,50);
add(boton19);
boton19.addActionListener(this);
boton19.setEnabled(true);

boton20 = new JButton("*");
boton20.setBounds(345,600,100,50);
add(boton20);
boton20.addActionListener(this);
boton20.setEnabled(true);

boton21 = new JButton("Seccion");
boton21.setBounds(450,380,100,50);
add(boton21);
boton21.addActionListener(this);
boton21.setEnabled(true);

boton22 = new JButton("<html><center>2<p>abc<html>");
boton22.setBounds(450,435,100,50);
add(boton22);
boton22.addActionListener(this);
boton22.setEnabled(true);

boton23 = new JButton("<html><center>5<p>jkl<html>");
boton23.setBounds(450,490,100,50);
add(boton23);
boton23.addActionListener(this);
boton23.setEnabled(true);

boton24 = new JButton("<html><center>8<p>tuv<html>");
boton24.setBounds(450,545,100,50);
add(boton24);
boton24.addActionListener(this);
boton24.setEnabled(true);

boton25 = new JButton("0");
boton25.setBounds(450,600,100,50);
add(boton25);
boton25.addActionListener(this);
boton25.setEnabled(true);

boton26 = new JButton("Multiventa");
boton26.setBounds(555,380,100,50);
add(boton26);
boton26.addActionListener(this);
boton26.setEnabled(true);

boton27 = new JButton("<html><center>3<p>def<html>");
boton27.setBounds(555,435,100,50);
add(boton27);
boton27.addActionListener(this);
boton27.setEnabled(true);

boton28 = new JButton("<html><center>6<p>mno<html>");
boton28.setBounds(555,490,100,50);
add(boton28);
boton28.addActionListener(this);
boton28.setEnabled(true);

boton29 = new JButton("<html><center>9<p>wxyz<html>");
boton29.setBounds(555,545,100,50);
add(boton29);
boton29.addActionListener(this);
boton29.setEnabled(true);

boton30 = new JButton(".");
boton30.setBounds(555,600,100,50);
add(boton30);
boton30.addActionListener(this);
boton30.setEnabled(true);

boton31 = new JButton("C");
boton31.setBounds(670,380,100,50);
add(boton31);
boton31.addActionListener(this);
boton31.setBackground(new Color(255,109,13));
boton31.setEnabled(true);

boton32 = new JButton("<html><center>Shift<p>🡱<html>");
boton32.setBounds(670,435,100,50);
add(boton32);
boton32.addActionListener(this);
boton32.setEnabled(true);

boton33 = new JButton("🡰");
boton33.setBounds(670,490,100,50);
add(boton33);
boton33.addActionListener(this);
boton33.setEnabled(true);

boton34 = new JButton("<html><center>Saldo<p>🡳<html>");
boton34.setBounds(670,545,100,50);
add(boton34);
boton34.addActionListener(this);
boton34.setEnabled(true);

boton35 = new JButton("ENTER");
boton35.setBounds(670,600,100,50);
add(boton35);
boton35.addActionListener(this);
boton35.setBackground(new Color(150,150,150));
boton35.setEnabled(true);

boton36 = new JButton("Cancelar");
boton36.setBounds(775,380,100,50);
add(boton36);
boton36.addActionListener(this);
boton36.setBackground(new Color(255,109,13));
boton36.setEnabled(true);

boton37 = new JButton("MENU");
boton37.setBounds(775,435,100,50);
add(boton37);
boton37.addActionListener(this);
boton37.setBackground(Color.yellow);
boton37.setEnabled(true);

boton38 = new JButton("🡲");
boton38.setBounds(775,490,100,50);
add(boton38);
boton38.addActionListener(this);
boton38.setEnabled(true);

boton39 = new JButton("ENTER");
boton39.setBounds(775,545,100,50);
add(boton39);
boton39.addActionListener(this);
boton39.setBackground(new Color(150,150,150));
boton39.setEnabled(true);

boton40 = new JButton("ENTER");
boton40.setBounds(775,600,100,50);
add(boton40);
boton40.addActionListener(this);
boton40.setBackground(new Color(150,150,150));
boton40.setEnabled(true);


text1 = new JTextField();
text1.setBounds(50,450,200,30);
text1.setBackground(new Color(200,200,200));
Font fuente4 = new Font("Calibri", 3, 20);
text1.setFont(fuente4);
text1.setForeground(Color.black);

//add(text1);

label1 = new JLabel("2021 - Nacion Servicios SA.");
label1.setBounds(400,660,400,30);
Font fuente1 = new Font("Calibri", 1, 20);
label1.setFont(fuente1); 
label1.setForeground(Color.white);
add(label1);

}
public void actionPerformed(ActionEvent e){
if(e.getSource() == boton1){
textonombre = text1.getText().trim();
if(textonombre.equals("")) {
JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre");
}else{
Panel2 ventana1 = new Panel2();
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
Panel1 ventana1 = new Panel1();
ventana1.setBounds(0,0,1024,720);
ventana1.setVisible(true);
ventana1.setResizable(false);
ventana1.setLocationRelativeTo(null);

}
}