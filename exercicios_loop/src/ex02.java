import javax.swing.JOptionPane;

public class ex02 {

    /* Receba um número inteiro. Calcule e mostre o seu fatorial. */

    public static void main(String[] args) {

        int num, fat = 1, cont ;

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

        // Loop para o fatorial
        for (cont=num;cont>1;cont--)
        {
            fat = (fat*cont);
        }

        JOptionPane.showMessageDialog(null, "O fatorial de "+num+" é igual à "+fat);
    }

}
