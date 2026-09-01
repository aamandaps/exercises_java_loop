import javax.swing.JOptionPane;

public class ex05 {

    /* Receba 2 números inteiros, verifique qual o maior entre eles.
    Calcule e mostre o resultado da somatória dos números ímpares entre esses valores. */

    public static void main (String[] args) {

        int n1, n2, soma = 0,cont, maior, menor;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um segundo número: "));

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

        cont = menor +1; // Inicializando o contador com o menor valor

        while (cont<maior)
        {
            // Verificando se é ímpar
            if (cont%2 != 0)
            {
                soma = soma + cont;
            }

            cont = cont + 1; // Incrementando contador
        } // Fim Loop

        // Saída
        JOptionPane.showMessageDialog(null, "A soma dos valores ímpares entre esses dois números é igual à "+ soma);
    }

}
