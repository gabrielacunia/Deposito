import javax.swing.* ;
public class Multitexto extends JFrame{
	private JTextField textfield1;
	private JTextArea textarea1;
public Multitexto(){
	setLayout(null);
	textfield1 = new JTextField();
	textfield1.setBounds(10,10,200,30);
	add(textfield1);
	
	textarea1 = new JTextArea();
	textarea1.setBounds(10,50,400,300);
	add(textarea1);
	}
public static void main(String args[]){
	Multitexto ventana1 = new Multitexto();
	ventana1.setBounds(0,0,540,400);
	ventana1.setVisible(true);
	ventana1.setResizable(false);
	ventana1.setLocationRelativeTo(null);
}

}