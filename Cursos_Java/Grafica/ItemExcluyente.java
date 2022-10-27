import javax.swing.*;
import javax.swing.event.*;

public class ItemExcluyente extends JFrame implements ChangeListener{

private JRadioButton boton1, boton2, boton3;
private ButtonGroup grupo;

public ItemExcluyente(){
setLayout(null);
grupo = new ButtonGroup();

boton1 = new JRadioButton("640*480");
boton1.setBounds(10,20,100,30);
boton1.addChangeListener(this);
add(boton1);
grupo.add(boton1);

boton2 = new JRadioButton("800*600");
boton2.setBounds(10,70,100,30);
boton2.addChangeListener(this);
add(boton2);
grupo.add(boton2);

boton3 = new JRadioButton("1024*768");
boton3.setBounds(10,120,100,30);
boton3.addChangeListener(this);
add(boton3);
grupo.add(boton3);
}
public void stateChanged(ChangeEvent e){
if(boton1.isSelected()){
setSize(640,480);
}
if(boton2.isSelected()){
setSize(800,600);
}
if(boton3.isSelected()){
setSize(1024,768);
}
 }
public static void main(String args[]){
ItemExcluyente ventana1 = new ItemExcluyente();
ventana1.setBounds(0,0,350,230);
ventana1.setVisible(true);
ventana1.setResizable(false);
}

}