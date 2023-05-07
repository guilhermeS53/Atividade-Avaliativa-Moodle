package Ex09;

import javax.swing.*;

public class Ex9 {
    public static void main(String[] args) {
        int c, n;
        // C é código e N é número de horas
        int auxi;
        double sal, exc = 0;
        String executarCodigo = "N";

        while (!executarCodigo.equalsIgnoreCase("S")) {
            c = Integer.parseInt(JOptionPane.showInputDialog("Por favor, informe o código do funcionário: "));
            n = Integer.parseInt(JOptionPane.showInputDialog("Por favor, informe o número de horas trabalhadas do funcionário: "));
            System.out.println("O código informado foi: " + c);
            System.out.println("O número de horas trabalhadas informadas foram " + n + " horas");

            if (n > 50) {
                auxi = n - 50;
                exc = exc + (auxi * 20);
                sal = 50 * 10 + exc;
            } else {
                sal = (n * 10);
            }
            System.out.println("O salário totalizado para o funcionário é de: R$ " + sal);
            System.out.println("O salário excedente do funcionário é de: R$ " + exc);

            executarCodigo = JOptionPane.showInputDialog("Deseja finalizar o código? Dica: Digite S para SIM ou N para NÃO");
        }
    }
}
