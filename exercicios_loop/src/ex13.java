import javax.swing.JOptionPane;

public class ex13 {

    /* Calcule e mostre quantos anos serão necessários para que Ana seja maior que Maria,
     sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m e cresce 2 cm ao ano. */

    public static void main (String[] args) {

        int anos=0;
        double ana = 1.10, maria = 1.50;

        // Enquanto ana for menor que maria...
        while (ana<=maria)
        {
            ana += 0.03;
            maria += 2.0;

            anos += 1;
        }

        JOptionPane.showMessageDialog(null, "Levará "+anos+" para que Ana seja maior que Maria.");
    }
}
