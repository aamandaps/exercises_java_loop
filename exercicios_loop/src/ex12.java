import javax.swing.JOptionPane;

public class ex12 {

    /* Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99 */

    public static void main (String[] args) {

        int num=1, den=1;
        double soma=0;

        // Loop que percorre o termo
        while (num<=50)
        {
            soma += (double) num/den;
            num += 1;
            den += 2;
        }

        JOptionPane.showMessageDialog(null, "A série é igual à: "+
                                        String.format("%.2f", soma));
    }
}
