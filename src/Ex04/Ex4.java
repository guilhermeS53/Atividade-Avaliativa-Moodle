package Ex04;

import javax.swing.*;

public class Ex4 {
    public static void main(String[] args) {
        int a, b;
        int auxi;

        a = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de A: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de B: "));

        System.out.println("O valor ORIGINAL inserido para A é: " + a);
        System.out.println("O valor ORIGINAL inserido para B é: " + b);

        auxi = a;
        a = b;
        b = auxi;

        System.out.println("\n");
        System.out.println("Agora o valor de A é: " + a);
        System.out.println("Agora o valor de A é: " + b);
    }
}
