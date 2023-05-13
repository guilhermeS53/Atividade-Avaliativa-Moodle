package Ex11;

import javax.swing.*;

public class Ex11 {
    public static void main(String[] args) {
        int[] n = new int[100];
        int i = 0;

        JOptionPane.showMessageDialog(null, "Informe os números, por favor: (Dica: para finalizar a aplicação, digite 0): ");

        while (true) {
            String ent = JOptionPane.showInputDialog("Informe um número aqui: ");
            System.out.println("O número informado é " + ent);

            if (ent.equals("0")) {
                break;
            }

            n[i] = Integer.parseInt(ent);
            i++;
        }

        int maior = n[0];
        int menor = n[0];

        for (int j = 1; j < i; j++) {
            if (n[j] > maior) {
                maior = n[j];
            }
            if (n[j] < menor) {
                menor = n[j];
            }
        }
        System.out.println("O MAIOR número entre os que foram inseridos é: " + maior);
        System.out.println("O MENOR número entre os que foram inseridos é: " + menor);
    }
}
