
package java_0507;

import javax.swing.JOptionPane;

/**
 *
 * @author Jeverson Nery
 */
public class Java_0507 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String num = JOptionPane.showInputDialog(null, "Informe um número: ");
        double op = Double.parseDouble(num);
        
        double res = Math.sqrt(op);
        
        JOptionPane.showMessageDialog(null, "Rais quadrada de " + num + " é: " + res);
    }
    
}
