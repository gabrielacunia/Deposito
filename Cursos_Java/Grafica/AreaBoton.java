import javax.swing.*;
import java.awt.event.*;

public class AreaBoton extends JFrame implements ActionListener{
private JTextField text1;
private JScrollPane scroll1;
private JTextArea text2;
private JButton boton1;

String texto = "";

public AreaBoton(){
 setLayout(null);
 text1 = new JTextField();
 text1.setBounds(10,10,200,30);
 add(text1);

 boton1 = new JButton("Agregar");
 boton1.setBounds(250,10,100,30);
 boton1.addActionListener(this);
 add(boton1);

 text2 = new JTextArea();
 scroll1 = new JScrollPane(text2);
 scroll1.setBounds(10,50,400,300);
 add(scroll1);
	}
public void actionPerformed(ActionEvent S){
if(S.getSource() == boton1){
texto += text1.getText() + "\n";
text2.setText(texto);
text1.setText(""); 
}
}
public static void main(String args[]){
	AreaBoton ventana = new AreaBoton();
	ventana.setBounds(0,0,540,400);
	ventana.setVisible(true);
	ventana.setResizable(false);
	ventana.setLocationRelativeTo(null);
}
}