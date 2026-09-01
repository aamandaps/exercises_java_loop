import javax.swing.JOptionPane;

public class ex11 {

    /* Mostre todas as possibilidades de 2 dados de forma que a soma tenha como resultado 7. */

    public static void main(String[] args) {

        int d1, d2=1, soma;

        // Loop d1
        for (d1=1; d1<7; d1++)
        {

            // Loop d2
            for (d2=1; d2<7; d2++)
            {
                soma = (d1 + d2);

                // Verificação soma = 7
                if (soma==7)
                {
                    JOptionPane.showMessageDialog(null, "Combinação que resulta em 7: "
                                                    +d1+" e "+d2);
                }
            }
        }
    }

}
