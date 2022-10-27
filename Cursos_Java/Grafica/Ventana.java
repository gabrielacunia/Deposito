import javax.swing.*;

public class Ventana extends JFrame{

public Ventana(){
setLayout(null);
}
public static void main (String args[]){
Ventana ventana1 = new Ventana();
ventana1.setBounds(0,0,400,550);
ventana1.setVisible(true);
ventana1.setLocationRelativeTo(null);
ventana1.setResizable(false);

}
}
