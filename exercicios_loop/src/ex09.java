import javax.swing.JOptionPane;

public class ex09 {

    /* Calcule a quantidade de grãos contidos em um tabuleiro de xadrez, os grãos
        dobram a cada casa.*/

    public static void main (String[] args) {

        int soma=0, grao=1, casa=1;

        while (casa<=64)
        {
            soma += grao;
            grao *= 2;

            casa += 1;
        } // Fim Loop

        JOptionPane.showMessageDialog(null, "Total de grãos = "+soma);
    }

}
