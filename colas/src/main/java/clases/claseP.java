package clases;

import javax.swing.JOptionPane;

public class claseP {

    public static void main(String[] args) {

        int opcion = 0, nodo_informacion = 0;
        cola cola = new cola();

        do {
            
try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Menu de Opciones \n\n"
                        + "1. insertar un nodo \n\n"
                        + "2. Extraer un nodo \n\n"
                        + "3.Mostrar contenido \n\n"
                        + "4.Salir\n\n"));

                switch (opcion) {
                    case 1:
                        nodo_informacion = Integer.parseInt(JOptionPane.showInputDialog(null, 
                                " Por favor introduce el Valor"));
                        cola.Insertar(nodo_informacion);
                        break;
                    case 2:
                        if (!cola.ColaVacia()){
                            JOptionPane.showMessageDialog(null, "Se extrajo un nodo con el valor : "
                            + cola.Extraer());
                        }else{
                            JOptionPane.showMessageDialog(null, "La cola esta vacia ");
                        }
                        break;
                    case 3:
                        cola.Mostrarresultado();
                        break;
                    case 4:
                        opcion=4;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, " Opcion no disponible ");
                        break;
                }
            

} catch  (Exception e) {
      System.out.println("Cancelar.");
            
        }  
        } while (opcion != 4);

    }
}
