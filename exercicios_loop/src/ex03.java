import javax.swing.JOptionPane;

public class ex03 {

    /* Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N. */

    public static void main (String[] args) {

        int num, cont=1;
        double soma=1;

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

        while(cont<num+1)
        {
            soma = (soma + ((double) 1 /cont));

            cont = cont + 1;
        }

        JOptionPane.showMessageDialog(null, "A soma é igual à "+String.format("%.2f",soma));

    }

}
