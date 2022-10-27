import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuColor extends JFrame implements ActionListener{
private JMenuBar menubar;
private JMenu menu1;
private JMenuItem menuitem1, menuitem2, menuitem3;

public MenuColor(){
setLayout(null);
menubar = new JMenuBar();
setJMenuBar(menubar);

menu1 = new JMenu("Opciones");
menubar.add(menu1);

menuitem1 = new JMenuItem("Rojo");
menuitem1.addActionListener(this);
menu1.add(menuitem1);

menuitem2 = new JMenuItem("Verde");
menuitem2.addActionListener(this);
menu1.add(menuitem2);

menuitem3 = new JMenuItem("Azul");
menuitem3.addActionListener(this);
menu1.add(menuitem3);
}
public void actionPerformed(ActionEvent e){
Container fondo = this.getContentPane();
if (e.getSource() == menuitem1){
fondo.setBackground(new Color(255,0,0));
}
if (e.getSource() == menuitem2){
fondo.setBackground(new Color(0,255,0));
}
if (e.getSource() == menuitem3){
fondo.setBackground(new Color(222,222,0));
}
}
public static void main (String args[]){
MenuColor ventana1 = new MenuColor();
ventana1.setBounds(0,0,400,300);
ventana1.setVisible(true);
ventana1.setResizable(true);
ventana1.setLocationRelativeTo(null);

 }
}