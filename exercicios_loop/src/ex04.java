import javax.swing.JOptionPane;

public class ex04 {

    /* Receba um número. Calcule e mostre os resultados da tabuada desse número. */

    public static void main (String[] args) {

        int num, tab, cont = 0;

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

        while(cont<=10)
        {
            tab = num*cont;

            cont = cont+1;

            JOptionPane.showMessageDialog(null,tab);
        } // Fim Loop Tabuada


    }

}
