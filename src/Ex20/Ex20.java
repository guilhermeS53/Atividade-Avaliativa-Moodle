package Ex20;

import javax.swing.*;
import java.sql.SQLOutput;

public class Ex20 {
    public static void main(String[] args) {
        int tam = Integer.parseInt(JOptionPane.showInputDialog("Informe por favor a quantidade de números para leitura: "));
        int[] n = new int[tam];
        double media;

        int sum = 0, maiorV = 0;

        for (int i = 0; i < tam; i++) {
            String nums = JOptionPane.showInputDialog("Informe o " + (i+1) + " número INTEIRO sendo POSITIVO.");
            System.out.println("Os números informados foram: " + nums);
            int ns = Integer.parseInt(nums);

            if (ns <= 0) {
                System.out.println("O número precisa ser INTEIRO e POSITIVO");
                i--;
                continue;
            }

            n[i] = ns;
            sum = sum + ns;

            if (ns > maiorV) {
                maiorV = ns;
            }
        }
        media = (double) sum / tam;

        System.out.println("A MÉDIA dos números informados é: " + media);
        System.out.println("O MAIOR número dos informados é: " + maiorV);
    }
}
