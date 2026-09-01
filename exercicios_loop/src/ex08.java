import javax.swing.JOptionPane;

public class ex08 {

    /* Receba 100 números inteiros reais. Verifique e mostre o maior e o menor valor.
        Obs.: somente valores positivos. */

    public static void main (String[] args) {

        double num, maior, menor;
        int i;

        num = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: ")); // Entrada que vai definir a comparação

        // Validação
        if(num<1)
        {
            JOptionPane.showMessageDialog(null, "Somente números positivos !!");
            return;
        }

        maior = num;
        menor = num;

        for (i=1; i<10; i++)
        {
            num = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));

            // Validação
            if(num<1)
            {
                JOptionPane.showMessageDialog(null, "Somente números positivos !!");
                return;
            }

            // Determina o maior valor
            if (num>maior)
            {
                maior = num;
            }

            // Determina o menor valor
            if (num<menor)
            {
                menor = num;
            }
        } // Fim Loop

        JOptionPane.showMessageDialog(null, "O maior valor é "+maior+", e menor é "+menor);
    }

}
