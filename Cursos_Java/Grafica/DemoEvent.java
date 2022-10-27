import javax.swing.*;
import java.awt.event.*;
class DemoEvent {
    static JButton boton;
    static JTextField text;
    public static void main( String ... args ) {
      new JFrame(){{
        add( new JPanel(){{
          add(( text = new JTextField(5){{
            addKeyListener( new KeyAdapter() {
              public void keyReleased( KeyEvent e ) { // <-- Este es el importante  
                boton.setEnabled(
                  text.getText().length() != 0
                );
              }
            });
          }}));
          add(( boton = new JButton("Click"){{
            setEnabled( false );
          }}));
        }});
        pack();
        setLocationRelativeTo( null );
        setVisible( true );
      }};
    }    
}