package Ex14;

import javax.swing.*;

public class Ex14 {
    public static void main(String[] args) {
        int[] v = new int[2];
        int x;
        int maior, menor, igual;
        // declaro todos inicialmente valendo 0
        maior = menor = igual = 0;

        for (int i = 0; i < v.length; i++) {
            String ent = JOptionPane.showInputDialog("Informe um número para o array de 10 posições " + (i+1) + " :");
            System.out.println("Os números informados foram: " + i);
            v[i] = Integer.parseInt(ent);
        }

        System.out.println("\n");
        String xString = JOptionPane.showInputDialog("Informe o número X: ");
        System.out.println("O valor informado de X foi " + xString);
        x = Integer.parseInt(xString);

        for (int i = 0; i < v.length; i++) {
            if (v[i] > x) {
                maior++;
            } else
            if (v[i] < x) {
                menor++;
            } else {
                igual++;
            }
        }
        System.out.println("Quantidade de números maiores que X: " + maior);
        System.out.println("Quantidade de números menores que X: " + menor);
        System.out.println("Quantidade de números iguais a X: " + igual);
    }
}
