package Ex24;

import javax.swing.*;

public class Ex24 {
    public static void main(String[] args) {

        String inpt = JOptionPane.showInputDialog("Informe tamanho para a matriz: ");
        int t = Integer.parseInt(inpt);

        boolean[][] matriz = new boolean[t][t];

        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                int n = (int) Math.floor(Math.random() * 2);
                matriz[i][j] = n == 1;

                System.out.println(matriz[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("Resultados obtidos a partir do proposto: ");

        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                System.out.println("(" + i + "," + j + ") && (" + j + "," + i + ") = " + (matriz[i][j] && matriz[j][i]));
            }
            System.out.println("");
        }
    }
}
