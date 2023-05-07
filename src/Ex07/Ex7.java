package Ex07;

import javax.swing.*;

public class Ex7 {
    public static void main(String[] args) {
        int x;

        x = Integer.parseInt(JOptionPane.showInputDialog("Por favor, informe a quantidade de números para serem processados de X: "));
        System.out.println("O valor informado pelo usuário foi " + x);

        for (int i = 0; i < x; i++) {
            int y = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro para o cálculo do fatorial: "));
            while (y <= 0) {
                JOptionPane.showMessageDialog(null, "Esse valor é inválido. Por favor, escreva um valor positivo");
                y = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor positivo para cálculo do fatorial: "));
            }
            int fat = 1;
            for (int j = y; j > 1; j--) {
                fat = (fat * j);
            }
            System.out.println("O fatorial de " + y + " é: " + fat);
        }
    }
}