import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
 
import javax.swing.JButton;
import javax.swing.JFrame;
 
@SuppressWarnings("serial")
public class EscucharTeclas extends JFrame implements KeyListener {
 
 private JButton bAceptar;
 
 public EscucharTeclas() {
 
  add(getbAceptar());
  inicializador();
 }
 
 private void inicializador() {
 
  setLayout(null);
  setTitle("Prueba con Teclas");
  setVisible(true);
  setSize(300, 300);
  setLocationRelativeTo(null);
  setDefaultCloseOperation(EXIT_ON_CLOSE);
 
 }
 
 private JButton getbAceptar() {
  bAceptar = new JButton("Aceptar");
  bAceptar.addKeyListener(this);
  bAceptar.setBounds(10, 10, 100, 20);
  return bAceptar;
 }
 
 @Override
 public void keyPressed(KeyEvent e) {
 
  int key = e.getKeyCode();
 
  if (key == KeyEvent.VK_ENTER) {
 
   System.out.println("Presionó Enter!" + (char) key);
  }
  if (key == KeyEvent.VK_SPACE) {
 
   System.out.println("Presionó Espacio!" + (char) key);
  }
 
 }
 
 @Override
 public void keyReleased(KeyEvent e) {
  System.out.println("Soltó una tecla");
 }
 
 @Override
 public void keyTyped(KeyEvent e) {
  System.out.println("Escribió una tecla");
 }
 
}

