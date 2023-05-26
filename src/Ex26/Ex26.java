package Ex26;

import javax.swing.*;
import java.util.Arrays;

public class Ex26 {
    public static void main(String[] args) {
        String inpt = JOptionPane.showInputDialog("Informe o tamanho da matriz: ");
        int t = Integer.parseInt(inpt);

        int[][] matriz = new int[t][t];

        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                inpt = JOptionPane.showInputDialog("Informe o valor para a posição (" + i + ", " + j + "): ");
                matriz[i][j] = Integer.parseInt(inpt);
            }
        }

        System.out.println("Os valores informados para a matriz são:");
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        JOptionPane.showInputDialog("Informe o valor de k: ");
        int k = Integer.parseInt(inpt);

        int[] flattenedArray = new int[t * t];
        int idx = 0;

        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                flattenedArray[idx] = matriz[i][j];
                idx++;
            }
        }

        Arrays.sort(flattenedArray);

        int kMenor = flattenedArray[k - 1];
        int kMaior = flattenedArray[flattenedArray.length - k];

        System.out.println("O kº MENOR número do Array é: " + kMenor);
        System.out.println("O kº MAIOR número do Array é: " + kMaior);
    }
}
