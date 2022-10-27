import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class TerminosCondiciones extends JFrame implements ActionListener, ChangeListener{
private JLabel label1;
private JCheckBox box1;
private JButton boton1;

public TerminosCondiciones(){
setLayout(null);
label1 = new JLabel("Aceptar terminos y condiciones");
label1.setBounds(10,10,400,30);
add(label1);

box1 = new JCheckBox("Acepto");
box1.setBounds(10,50,100,30);
box1.addChangeListener(this);
add(box1);

boton1 = new JButton("Continuar");
boton1.setBounds(10,100,100,30);
add(boton1);
boton1.addActionListener(this);
boton1.setEnabled(false);
}
public void stateChanged(ChangeEvent e){
if (box1.isSelected() == true){
boton1.setEnabled(true);
}else{
boton1.setEnabled(false);
}
 }
public void actionPerformed(ActionEvent e){
if(e.getSource() == boton1){
System.exit(0);
}
}
public static void main(String args[]){
TerminosCondiciones ventana1 = new TerminosCondiciones();
ventana1.setBounds(0,0,350,200);
ventana1.setVisible(true);
ventana1.setResizable(false);
ventana1.setLocationRelativeTo(null);
}
}