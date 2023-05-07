package Ex10;

import javax.swing.*;

public class Ex10 {
    public static void main(String[] args) {
        String executarCodigo = "N";

        while (!executarCodigo.equalsIgnoreCase("S")) {
            int n;

            n = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro: "));
            System.out.println("O número inteiro informado é: " + n);

            if (n % 2 == 0) {
                System.out.println("O número informado é um número PAR.");
            } else {
                System.out.println("O número informado é um número ÍMPAR.");
            }

            if (n > 0) {
                System.out.println("O número informado é POSITIVO.");
            } else
            if (n < 0) {
                System.out.println("O número informado é NEGATIVO.");
            } else {
                System.out.println("O número informado é ZERO.");
            }
            executarCodigo = JOptionPane.showInputDialog("Deseja finalizar o código? Dica: Digite S para SIM ou N para NÃO");
        }
    }
}
