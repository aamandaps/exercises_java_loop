import javax.swing.JOptionPane;

public class ex10 {

    /* Receba 2 números inteiros.
    Verifique e mostre todos os números primos existentes entre eles. */

    public static void main (String[] args) {

        int n1, n2, divisor, qnt_divisor, maior, menor;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

        // Verificando qual número é maior
        if (n1>n2)
        {
            maior = n1;
            menor = n2;
        }
        else
        {
            maior = n2;
            menor = n1;
        }

        // Loop que vai percorrer os números
        for (int num = maior; num<=menor; num++)
        {
            qnt_divisor = 0;

            // Loop que vai percorrer os divisores
            for (divisor=1; divisor<=num; divisor++)
            {
                // Verificando quantidade de divisores entre os números
                if (num%divisor == 0)
                {
                    qnt_divisor += 1;
                }

                // Condicional para números primos
                if (qnt_divisor==2)
                {
                    JOptionPane.showMessageDialog(null, "Número primo -> "+num);
                }
            } // Fim Loop Divisores
        } // Fim Loop Números


    }
}
