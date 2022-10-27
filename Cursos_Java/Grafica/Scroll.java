import javax.swing.*;

public class Scroll extends JFrame{

private JTextField textfield1;
private JScrollPane jscroll1;
private JTextArea text1;
public Scroll(){
	setLayout(null);
	textfield1 = new JTextField();
	textfield1.setBounds(10,10,200,30);
	add(textfield1);

	text1 = new JTextArea();
	jscroll1 = new JScrollPane(text1);
	jscroll1.setBounds(10,50,400,300);
	add(jscroll1);
 }
public static void main (String args[]){
	Scroll ventana = new Scroll();
	ventana.setBounds(0,0,540,400);
	ventana.setVisible(true);
	ventana.setResizable(false);
	ventana.setLocationRelativeTo(null);
	}
}