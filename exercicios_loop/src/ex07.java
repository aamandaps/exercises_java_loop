import javax.swing.JOptionPane;

public class ex07 {

    /* Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu N’nésimo termo. */

    public static void main (String[] args) {

        int num, i=0, prim=0, seg=1, prox;

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

        // Inicio sequência
        while (i<num)
        {
            prox = prim + seg;

            // Atualizando a sequência
            prim =seg;
            seg = prox;

            System.out.println(prim);

            i += 1;
        } // Fim Loop

    }

}
