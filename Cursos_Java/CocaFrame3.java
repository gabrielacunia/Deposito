import javax.swing.*;
import javax.swing.ImageIcon.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.util.Scanner;
import java.awt.*;

public class CocaFrame3 extends JFrame implements ActionListener{
private JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9, label10;
private JCheckBox box1;
private JButton boton1;
private JTextField text1, text2, text3;
private JComboBox combo1, combo2;
private JTextArea area1;
private JMenuBar menubar;
private JMenu menu1, menu2, menu3, menu1_1;
private JMenuItem menuitem1, menuitem2, menuitem3, menuitem4, menuitem5, menuitem6, menuitem7;
private JScrollPane jscroll1;
String nombrerecuperado = "";

public CocaFrame3 (){
setLayout(null);

setDefaultCloseOperation(EXIT_ON_CLOSE);

setTitle("Sistema Vacacional - Panel Principal");
this.getContentPane().setBackground(Color.red);

Image icon = new ImageIcon(getClass().getResource("classes/icon.png")).getImage();
setIconImage(icon);

CocaCola ventanaCocaCola = new CocaCola();
nombrerecuperado = ventanaCocaCola.textonombre;

area1 = new JTextArea();
area1.setBackground(new Color(200,200,200));
Font fuente12 = new Font("Calibri", 3, 15);
area1.setFont(fuente12); 
area1.setForeground(Color.black);
area1.setEditable(false);
add(area1);
jscroll1 = new JScrollPane(area1);
jscroll1.setBounds(300,390,450,100);
add(jscroll1);

//labelfooter = new JLabel(©2017 The Coca-Cola Company | Todos los derechos reservados.");
label1 = new JLabel("©2017 The Coca-Cola Company | Todos los derechos reservados.");
label1.setBounds(170,510,500,30);
Font fuente1 = new Font("Calibri", 1, 15);
label1.setFont(fuente1); 
label1.setForeground(Color.white);
add(label1);

label2 = new JLabel("Datos del trabajador para el calculo de vacaciones: ");
label2.setBounds(50,170,700,30);
Font fuente2 = new Font("Calibri", 3, 30);
label2.setFont(fuente2); 
label2.setForeground(Color.white);
add(label2);

label3 = new JLabel("Bienvenido "+ nombrerecuperado);
label3.setBounds(350,70,300,30);
Font fuente3 = new Font("Calibri", 3, 30);
label3.setFont(fuente3); 
label3.setForeground(Color.white);
add(label3);

label4 = new JLabel();
label4.setIcon(new ImageIcon("classes/logo-coca.png"));
label4.setBounds(0,0,300,150);
add(label4);

label5 = new JLabel("Nombre Completo:");
label5.setBounds(30,230,300,40);
Font fuente4 = new Font("Calibri", 3, 15);
label5.setFont(fuente4); 
label5.setForeground(Color.white);
add(label5);

label6 = new JLabel("Apellido Paterno:");
label6.setBounds(30,310,300,40);
Font fuente5 = new Font("Calibri", 3, 15);
label6.setFont(fuente5); 
label6.setForeground(Color.white);
add(label6);

label7 = new JLabel("Apellido Materno:");
label7.setBounds(30,390,300,40);
Font fuente6 = new Font("Calibri", 3, 15);
label7.setFont(fuente6); 
label7.setForeground(Color.white);
add(label7);

label8 = new JLabel("Seleccione Area:");
label8.setBounds(300,230,300,40);
Font fuente10 = new Font("Calibri", 3, 15);
label8.setFont(fuente10); 
label8.setForeground(Color.white);
add(label8);

label9 = new JLabel("Seleccione years de servicio:");
label9.setBounds(300,310,300,40);
Font fuente11 = new Font("Calibri", 3, 15);
label9.setFont(fuente11); 
label9.setForeground(Color.white);
add(label9);

label10 = new JLabel("Resultado del Calculo:");
label10.setBounds(300,390,300,40);
Font fuente13 = new Font("Calibri", 3, 15);
label10.setFont(fuente13); 
label10.setForeground(Color.white);
add(label10);


text1 = new JTextField();
text1.setBounds(30,260,200,30);
text1.setBackground(new Color(200,200,200));
Font fuente7 = new Font("Calibri", 3, 20);
text1.setFont(fuente7);
text1.setForeground(Color.black);
add(text1);

text2 = new JTextField();
text2.setBounds(30,340,200,30);
text2.setBackground(new Color(200,200,200));
Font fuente8 = new Font("Calibri", 3, 20);
text2.setFont(fuente8);
text2.setForeground(Color.black);
add(text2);

text3 = new JTextField();
text3.setBounds(30,420,200,30);
text3.setBackground(new Color(200,200,200));
Font fuente9 = new Font("Calibri", 3, 20);
text3.setFont(fuente9);
text3.setForeground(Color.black);
add(text3);

combo1 = new JComboBox();
combo1.setBounds(300,260,200,30);
combo1.setBackground(new Color(200,200,200));
combo1.addItem("");
combo1.addItem("Atencion al Cliente");
combo1.addItem("Departamento de Logistica");
combo1.addItem("Departamento de Gerencia");
add(combo1);

combo2 = new JComboBox();
combo2.setBounds(300,340,200,30);
combo2.setBackground(new Color(200,200,200));
combo2.addItem("");
combo2.addItem("1 year de servicio");
combo2.addItem("2 a 6 years de servicio");
combo2.addItem("7 o mas years de servicios");
add(combo2);

menubar = new JMenuBar();
setJMenuBar(menubar);

menu1 = new JMenu("Opciones");
menubar.add(menu1);

menu2 = new JMenu("Calcular");
menubar.add(menu2);

menu3 = new JMenu("Acerca de..");
menubar.add(menu3);

menu1_1 = new JMenu("Color de Fondo");
menu1.add(menu1_1);

menuitem1 = new JMenuItem("Rojo");
menu1_1.add(menuitem1);
menuitem1.addActionListener(this);

menuitem2 = new JMenuItem("Gris");
menu1_1.add(menuitem2);
menuitem2.addActionListener(this);

menuitem3 = new JMenuItem("Negro");
menu1_1.add(menuitem3);
menuitem3.addActionListener(this);

menuitem4 = new JMenuItem("Nuevo");
menu1.add(menuitem4);
menuitem4.addActionListener(this);

menuitem5 = new JMenuItem("Salir");
menu1.add(menuitem5);
menuitem5.addActionListener(this);

menuitem6 = new JMenuItem("Vacaciones");
menu2.add(menuitem6);
menuitem6.addActionListener(this);

menuitem7 = new JMenuItem("El Creador");
menu3.add(menuitem7);
menuitem7.addActionListener(this);
}
public void actionPerformed(ActionEvent e){
if(e.getSource() == menuitem5){
CocaCola ventana1 = new CocaCola();
ventana1.setBounds(0,0,480,620);
ventana1.setVisible(true);
ventana1.setResizable(false);
ventana1.setLocationRelativeTo(null);
this.setVisible(false);
}

if(e.getSource() == menuitem4){
text3.setText("");
text1.setText("");
text2.setText("");
combo1.setSelectedIndex(0);
combo2.setSelectedIndex(0);
area1.setText("");
}
if(e.getSource() == menuitem6){
int z = text1.getText().length();
int x = text2.getText().length();
int c = text3.getText().length();
int v = combo1.getSelectedIndex();
int b = combo2.getSelectedIndex();
String tex1 = text1.getText();
String tex2 = text2.getText();
String tex3 = text3.getText();
String comb1 = combo1.getSelectedItem().toString();
String comb2 = combo2.getSelectedItem().toString();

if(z != 0 && x != 0 && c != 0 && v !=0 && b !=0){

if(v==1){
if(b==1){area1.setText("El empleado " + tex1 +" "+ tex2 +" "+ tex3 + " perteneciente al area de " + comb1 +" con " + comb2 +" le pertenecen 5 dias de vacaciones");
}
if(b==2){area1.setText("El empleado " + tex1 +" "+ tex2 +" "+ tex3 + " perteneciente al area de " + comb1 +" con " + comb2 +" le pertenecen 10 dias de vacaciones");
}
if(b==3){area1.setText("El empleado " + tex1 +" "+ tex2 +" "+ tex3 + " perteneciente al area de " + comb1 +" con " + comb2 +" le pertenecen 15 dias de vacaciones");
}
}
if (v==2) {
if(b==1){area1.setText("El empleado " + tex1 +" "+ tex2 +" "+ tex3 + " perteneciente al area de " + comb1 +" con " + comb2 +" le pertenecen 6 dias de vacaciones");
}
if(b==2){area1.setText("El empleado " + tex1 +" "+ tex2 +" "+ tex3 + " perteneciente al area de " + comb1 +" con " + comb2 +" le pertenecen 12 dias de vacaciones");
}
if(b==3){area1.setText("El empleado " + tex1 +" "+ tex2 +" "+ tex3 + " perteneciente al area de " + comb1 +" con " + comb2 +" le pertenecen 16 dias de vacaciones");
}
}
if (v==3) {
if(b==1){area1.setText("El empleado " + tex1 +" " + tex2 +" "+ tex3 + " perteneciente al area de " + comb1 +" con " + comb2 +" le pertenecen 11 dias de vacaciones");
}
if(b==2){area1.setText("El empleado " + tex1 +" "+ tex2 +" "+ tex3 + " perteneciente al area de " + comb1 +" con " + comb2 +" le pertenecen 18 dias de vacaciones");
}
if(b==3){area1.setText("El empleado " + tex1 +" "+ tex2 +" "+ tex3 + " perteneciente al area de " + comb1 +" con " + comb2 +" le pertenecen 30 dias de vacaciones");
}
}

}else {
JOptionPane.showMessageDialog(menuitem6, "Rellena todos los campos");
}
}

Container fondo = this.getContentPane();
if (e.getSource() == menuitem1){
fondo.setBackground(new Color(255,0,0));
}
if (e.getSource() == menuitem2){
fondo.setBackground(new Color(120,120,120));
}
if (e.getSource() == menuitem3){
fondo.setBackground(new Color(0,0,0));
}
if (e.getSource() == menuitem7){
JOptionPane.showMessageDialog(menuitem7, "YO SOY EL MALDITO CREADORRRR");
}
}
public static void main(String args[]){
CocaFrame3 ventana1 = new CocaFrame3 ();
ventana1.setBounds(0,0,800,600);
ventana1.setVisible(true);
ventana1.setResizable(false);
ventana1.setLocationRelativeTo(null);
}
}