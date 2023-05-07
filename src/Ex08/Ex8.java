package Ex08;

import javax.swing.*;

public class Ex8 {
    public static void main(String[] args) {
        int x;

        x = Integer.parseInt(JOptionPane.showInputDialog("Por favor, informe o número inteiro para cálculo da tabuada: "));
        System.out.println("O valor informado pelo usuário foi " + x);
        System.out.println("\n");
        System.out.println("***Tabuada do Número " + x + " ***");
        for (int i = 1; i <= 10; i++) {
            System.out.println(x + " × " + i + " = " + (x * i));
        }
    }
}
