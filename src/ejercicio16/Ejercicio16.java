package ejercicio16;

import com.arturo.academia.Academia;
import com.arturo.persoal.Persoal;
import javax.swing.JOptionPane;
import notas.CalcularNota;

/**
 *
 * @author Arturo
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome=JOptionPane.showInputDialog("Introduce un Nombre");
        Persoal p1=new Persoal(JOptionPane.showInputDialog("Introduce un Teléfono"),JOptionPane.showInputDialog("Introduce un Email"));
        float nota=CalcularNota.calcularNotaFin();
        Academia ac=new Academia(nome, (int) nota,p1);
        System.out.println(ac.toString());
    }

}
