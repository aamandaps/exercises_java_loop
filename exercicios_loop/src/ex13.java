public class ex13 {

    /* Calcule e mostre quantos anos serão necessários para que Ana seja maior que Maria,
     sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m e cresce 2 cm ao ano. */

    public static void main (String[] args) {

        int anos = 0;
        double ana = 1.10, maria = 1.50;

        while (ana <= maria) {
            ana += 0.03;
            maria += 0.02;
            anos += 1;
        }

        // Exibe direto na aba 'Run' / Console do IntelliJ
        System.out.println("Levará " + anos + " anos para que Ana seja maior que Maria.");
    }
}

/*OBS: Por algum caralho de motivo não roda com JOptionPane ???????????*/