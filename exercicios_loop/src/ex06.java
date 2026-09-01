import javax.swing.JOptionPane;

public class ex06 {

    /* Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N! */

    public static void main (String[] args) {

        int num, i, j, fat=1;
        double soma=0;

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

        // Primeiro Loop para ir até num
        for (i=1; i<num+1; i++)
        {
            // Segundo Loop para calcular fatorial de num
            for (j=1; j<i+1; j++)
            {
                fat = fat*j;
            }
            // Fim Loop Fatorial

            soma += ((double) 1 / fat); // Esse (double) é pra converter de int p/ double
        }
        // Fim Loop Principal

        JOptionPane.showMessageDialog(null, "Soma = "+ String.format("%.2f",soma));

    }
}
