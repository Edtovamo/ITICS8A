package menuop;
//menú de opciones promedio de 3 calif, tabla de multiplicar de un numero e imprimir los num del 1 al 100
import javax.swing.JOptionPane;
public class MenuOp {
    public static void main(String[] args) {
       int opcion=0;
       do {
           opcion=Integer.parseInt(JOptionPane.showInputDialog("<<<<<<<<<<<<<<<<<<<menu>>>>>>>>>>>>>>>>>"
                   + "\n1.-promedio de 3 calificaciones"
                   + "\n2.-tabla de multiplicar de un número"
                   + "\n3.-imprimir del 1 al 100"
                   + "\n4.-salir"));
          switch(opcion){
              case 1:
                  JOptionPane.showMessageDialog(null, "Promedio");
                  break;
              case 2:
                  JOptionPane.showMessageDialog(null, "Tabla");

                  break;
                  
              case 3:
                  JOptionPane.showMessageDialog(null, "serie");

                  break;
                  
              case 4:
                JOptionPane.showMessageDialog(null, "Adios");

                  break;
                  
              default:
                JOptionPane.showMessageDialog(null, "Opcion no valida");

                  break;
          }
           
       }while(opcion != 4);
    }
}
