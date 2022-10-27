import javax.swing.*;
import java.awt.event.*;

public class CampoScanner extends JFrame implements ActionListener{
	private JTextField textfield1;
	private JLabel label1;
	private JButton boton1;
public CampoScanner(){
	setLayout(null);
	label1 = new JLabel("Usuario:");
	label1.setBounds(10,10,100,30);
	add(label1);

	textfield1 = new JTextField();
	textfield1.setBounds(120,17,150,20);
	add(textfield1);	
	boton1 = new JButton("Aceptar");
	boton1.setBounds(10,80,100,30);
	add(boton1);
	boton1.addActionListener(this);
 }
public void actionPerformed(ActionEvent N){
	if(N.getSource() == boton1){
	String texto = textfield1.getText();
	setTitle(texto);
   }
 }
public static void main(String args[]){
	CampoScanner ventana1 = new CampoScanner();
	ventana1.setBounds(0,0,300,150);
	ventana1.setVisible(true);
	ventana1.setResizable(false);
	ventana1.setLocationRelativeTo(null);
 }
}