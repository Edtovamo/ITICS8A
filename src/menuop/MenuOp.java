package menuop;
//menú de opciones promedio de 3 calif, tabla de multiplicar de un numero e imprimir los num del 1 al 100
import javax.swing.JOptionPane;
import menuop.Serie;
import menuop.Tablas;
public class MenuOp {
    public static void main(String[] args) {
       int opcion=0;
           int calif1=0,calif2=0,calif3=0,promedio; 
       do {
           opcion=Integer.parseInt(JOptionPane.showInputDialog("<<<<<<<<<<<<<<<<<<<menu>>>>>>>>>>>>>>>>>"
                   + "\n1.-promedio de 3 calificaciones"
                   + "\n2.-tabla de multiplicar de un número"
                   + "\n3.-imprimir del 1 al 100"
                   + "\n4.-salir"));
          switch(opcion){
              case 1:
                  JOptionPane.showMessageDialog(null, "Promedio");
                  calif1=Integer.parseInt(JOptionPane.showInputDialog("Dame la primer calificación"));
                  calif2=Integer.parseInt(JOptionPane.showInputDialog("Dame la segunda calificación"));
                  calif3=Integer.parseInt(JOptionPane.showInputDialog("Dame la última calificación"));
                  promedio=(calif1+calif2+calif3)/3;
                  JOptionPane.showMessageDialog(null, "El Promedio es: "+promedio);
                  break;
              case 2:
                  JOptionPane.showMessageDialog(null, "Tabla");
                  Tablas multi;
                  multi = new Tablas();
                  multi.tablasdemulti();
                  
                  break;
                  
              case 3:
                  JOptionPane.showMessageDialog(null, "serie");
                    Serie numero;
                    numero=new Serie();
                    numero.laserie();
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
