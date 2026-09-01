import javax.swing.JOptionPane;

public class ex14 {

    /* Receba o número da base e do expoente. Calcule e mostre o valor da potência. */

    public static void main (String[] args) {

        int base, exp, pot=1, cont=1;

        base = Integer.parseInt(JOptionPane.showInputDialog("Insira a base: "));
        exp = Integer.parseInt(JOptionPane.showInputDialog("Insira o expoente: "));

        while (cont<=exp)
        {
            pot *= base;
            cont += 1;
        }

        JOptionPane.showMessageDialog(null, "O resultado da potência é: "+pot);
    }
}
