package Ex06;

import javax.swing.*;

public class Ex6 {
    public static void main(String[] args) {
        int a, b, c;
        int min, max;

        a = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor inteiro: "));
        if (a <= 0) {
            JOptionPane.showMessageDialog(null, "Esse valor é inválido. Por favor, escreva um valor maior que 0");
            a = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor inteiro maior que zero: "));
        }

        b = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor inteiro: "));
        if (b <= 0) {
            JOptionPane.showMessageDialog(null, "Esse valor é inválido. Por favor, escreva um valor maior que 0");
            b = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor inteiro maior que zero: "));
        }

        c = Integer.parseInt(JOptionPane.showInputDialog("Informe o terceiro valor inteiro: "));
        if (c <= 0) {
            JOptionPane.showMessageDialog(null, "Esse valor é inválido. Por favor, escreva um valor maior que 0");
            c = Integer.parseInt(JOptionPane.showInputDialog("Informe o terceiro valor inteiro maior que zero: "));
        }

        System.out.println("Os números inseridos foram: " + a + ", " + b + " e " + c);

        min = a < b ? (a < c ? a : c) : (b < c ? b : c);
        max = a > b ? (a > c ? a : c) : (b > c ? b : c);

        System.out.println("O menor valor informado foi: " + min);
        System.out.println("O maior valor informado foi: " + max);
        System.out.println("O maior valor dividido pelo menor é: " + (max / min));
        System.out.println("O menor valor dividido pelo maior é: " + (min * max));
    }
}
