package Ex03;

import javax.swing.*;

public class Ex3 {
    public static void main(String[] args) {
        int n1, n2, n3;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor inteiro: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor inteiro: "));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Informe o terceiro valor inteiro: "));

        System.out.println("Os números inseridos foram: " + n1 + ", " + n2 + " e " + n3);

        if (n1 == n2 && n2 == n3) {
            System.out.println("Os três números são IGUAIS!");
        } else {
            if (n1 != n2 && n2 != n3 && n1 != n3) {
                System.out.println("Os três números NÃO são IGUAIS!");
            }

            if (n1 == n2 || n1 == n3 || n2 == n3) {
                System.out.println("Dois números são IGUAIS!");
            }

            if (n1 > n2 && n1 > n3) {
                System.out.println(n1 + " é MAIOR que os outros dois!");
            } else if (n2 > n1 && n2 > n3) {
                System.out.println(n2 + " é MAIOR que os outros dois!");
            } else if (n3 > n1 && n3 > n2) {
                System.out.println(n3 + " é MAIOR que os outros dois!");
            }

            if (n1 < n2 && n1 < n3) {
                System.out.println(n1 + " é MENOR que os outros dois!");
            } else if (n2 < n1 && n2 < n3) {
                System.out.println(n2 + " é MENOR que os outros dois!");
            } else if (n3 < n1 && n3 < n2) {
                System.out.println(n3 + " é MENOR que os outros dois!");
            }

            if (n1 >= n2 && n1 >= n3) {
                System.out.println(n1 + " é MAIOR ou IGUAL que os outros dois!");
            } else if (n2 >= n1 && n2 >= n3) {
                System.out.println(n2 + " é MAIOR ou IGUAL que os outros dois!");
            } else if (n3 >= n1 && n3 >= n2) {
                System.out.println(n3 + " é MAIOR ou IGUAL que os outros dois!");
            }

            if (n1 <= n2 && n1 <= n3) {
                System.out.println(n1 + " é MENOR ou IGUAL que os outros dois!");
            } else if (n2 <= n1 && n2 <= n3) {
                System.out.println(n2 + " é MENOR ou IGUAL que os outros dois!");
            } else if (n3 <= n1 && n3 <= n2) {
                System.out.println(n3 + " é MENOR ou IGUAL que os outros dois!");
            }
        }
    }
}