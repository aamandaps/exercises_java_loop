import javax.swing.JOptionPane;

public class ex15 {

    /*  Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 - ... + 15/225 */

    public static void main (String[] args) {

        int num, den;
        double termo, soma=0;

        // Loop que percorre a série
        for(num=1; num<15; num++)
        {
            // Calculando a série
            den = num*num;
            termo = (double)num/den;

            // Verificando a próxima operação da sequência
            if(num%2 == 0)
            {
                soma -= termo;
            }
            else
            {
                soma += termo;
            }
        }

        JOptionPane.showMessageDialog(null,"A soma da série é "+
                                   String.format("%.2f",soma) );
    }
}
