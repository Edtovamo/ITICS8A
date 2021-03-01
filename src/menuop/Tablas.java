package menuop;
import javax.swing.JOptionPane; 
public class Tablas {
        int n1,n2,res;
    public void tablasdemulti(){
        n1=Integer.parseInt(JOptionPane.showInputDialog("Dame el número que quieres multiplicar"));
        n2=Integer.parseInt(JOptionPane.showInputDialog("¿hasta que numero quieres multiplicar"));
        for (int i = 0; i <= n2; i++) {
            res=n1*i;
            JOptionPane.showMessageDialog(null, n1+"X"+i+"="+res);
            
        }
    }
}
