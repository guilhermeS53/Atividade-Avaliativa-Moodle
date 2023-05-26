package Ex23;

import javax.swing.*;

public class Ex23 {
    public static void main(String[] args) {

        String inpt = JOptionPane.showInputDialog("Informe tamanho para a matriz: ");
        int t = Integer.parseInt(inpt);

        int[][] matriz = new int[t][t];

        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                matriz[i][j] = (int) Math.floor(Math.random() * 10);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }

        int[][] matrizModf = new int[t][t];

        System.out.println("Matriz já com modificação: ");

        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                matrizModf[i][j] = matriz[j][i];
                System.out.print(matrizModf[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
