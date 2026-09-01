import javax.swing.JOptionPane;

public class ex01 {

    /* Calcule e mostre o quadrado dos números entre 10 e 150. */

    public static void main(String[] args) {

        int num, quad;

        for (num = 10;num<=150;num++)
        {
            quad = num*num;

            JOptionPane.showMessageDialog(null , "O quadrado de "+num+" é igual à "+quad);

        } // Fim Loop

    }

}
