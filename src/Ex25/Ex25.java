package Ex25;

import javax.swing.*;
import java.util.Arrays;

public class Ex25 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Informe o tamanho da matriz: ");
        int t = Integer.parseInt(input);

        int[][] matriz = new int[t][t];

        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                matriz[i][j] = (int) Math.floor(Math.random() * 50);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        input = JOptionPane.showInputDialog("Informe o valor de k: ");
        int k = Integer.parseInt(input);

        int[] flattenedArray = new int[t * t];
        int index = 0;

        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                flattenedArray[index] = matriz[i][j];
                index++;
            }
        }

        Arrays.sort(flattenedArray);

        StringBuilder maiores = new StringBuilder();
        StringBuilder menores = new StringBuilder();

        for (int i = flattenedArray.length - 1; i >= flattenedArray.length - k; i--) {
            maiores.append(flattenedArray[i]).append(" ");
        }

        for (int i = 0; i < k; i++) {
            menores.append(flattenedArray[i]).append(" ");
        }

        System.out.println("Os " + k + " MAIORES números do Array são: " + maiores);
        System.out.println("Os " + k + " MENORES números do Array são: " + menores);
    }
}