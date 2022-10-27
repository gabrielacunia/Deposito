import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;

public class CocaFrame2 extends JFrame implements ActionListener, ChangeListener{
private JLabel label2, label1;
private JCheckBox box1;
private JButton boton1, boton2;
private JTextArea area1;
private JScrollPane jscroll1;

public CocaFrame2(){
setLayout(null);

setTitle("Terminos y Condiciones");
this.getContentPane().setBackground(new Color (220,220,220));

Image icon = new ImageIcon(getClass().getResource("classes/icon.png")).getImage();
setIconImage(icon);


label2 = new JLabel("TERMINOS Y CONDICIONES");
label2.setBounds(230,50,300,30);
Font fuente1 = new Font("Calibri", 1, 20);
label2.setFont(fuente1); 
label2.setForeground(Color.black);
add(label2);

label1 = new JLabel();
label1.setIcon(new ImageIcon("classes/coca-cola.png"));
label1.setBounds(380,400,300,150);
add(label1);


area1 = new JTextArea("TÉRMINOS Y CONDICIONES" + "\n" + 
"" + "\n" +
            "A.  PROHIBIDA SU VENTA O DISTRIBUCIÓN SIN AUTORIZACIÓN DE LA GEEKIPEDIA DE ERNESTO." + "\n" +
            "B.  PROHIBIDA LA ALTERACIÓN DEL CÓDIGO FUENTE O DISEÑO DE LAS INTERFACES GRÁFICAS." + "\n" +
            "C.  LA GEEKIPEDIA DE ERNESTO NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE." + "\n" +
"" + "\n" +
          "LOS ACUERDOS LEGALES EXPUESTOS ACONTINUACIÓN RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE" + "\n" +
          "(LA GEEKIPEDIA DE ERNESTO Y EL AUTOR ERNESTO), NO SE RESPONSABILIZAN DEL USO QUE USTED" + "\n" +
          "HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TERMINOS HAGA CLIC EN (ACEPTO)" + "\n" +
          "SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLIC EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE." + "\n" +
"" + "\n" +
          "PARA MAYOR INFORMACIÓN SOBRE NUESTROS PRODUCTOS O SERVICIOS, POR FAVOR VISITE" + "\n" +
          "http://www.youtube.com/ernestoperezm");         

area1.setBackground(Color.white);
Font fuente2 = new Font("Calibri", 3, 15);
area1.setFont(fuente2); 
area1.setForeground(Color.black);
area1.setEditable(false);
add(area1);

jscroll1 = new JScrollPane(area1);
jscroll1.setBounds(50,100,600,300);
add(jscroll1);

box1 = new JCheckBox("Yo, Fulano, acepto los terminos");
box1.setBounds(30,460,200,30);
box1.addChangeListener(this);
add(box1);

boton1 = new JButton("Continuar");
boton1.setBounds(30,500,100,30);
add(boton1);
boton1.addActionListener(this);
boton1.setEnabled(false);

boton2 = new JButton("No Acepto");
boton2.setBounds(150,500,100,30);
add(boton2);
boton2.addActionListener(this);
boton2.setEnabled(true);

}
public void stateChanged(ChangeEvent e){
if (box1.isSelected() == true){
boton1.setEnabled(true);
boton2.setEnabled(false);
}else{
boton1.setEnabled(false);
boton2.setEnabled(true);
}
 }
public void actionPerformed(ActionEvent e){
if(e.getSource() == boton1){
System.exit(0);
}
}
public static void main(String args[]){
CocaFrame2 ventana1 = new CocaFrame2();
ventana1.setBounds(0,0,700,600);
ventana1.setVisible(true);
ventana1.setResizable(false);
ventana1.setBackground(Color.red);
ventana1.setLocationRelativeTo(null);
}
}