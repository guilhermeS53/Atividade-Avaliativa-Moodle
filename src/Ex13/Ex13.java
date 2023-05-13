package Ex13;

import javax.swing.*;

public class Ex13 {
    public static void main(String[] args) {
        int[] n = new int[100];
        int tam = 0;

        JOptionPane.showMessageDialog(null, "Informe os números solicitados a seguir.");

        while (true) {
            String ent = JOptionPane.showInputDialog("Informe um número aqui: ");
            System.out.println("O número informado é " + ent);

            if (ent.equals("0")) {
                break;
            }
            n[tam] = Integer.parseInt(ent);
            tam++;
        }

        int tamMatriz = (int) Math.ceil(Math.sqrt(tam));
        int[][] matriz = new int[tamMatriz][tamMatriz];

        int k = 0;

        for (int i = 0; i < tamMatriz; i++) {
            for (int j = 0; j < tamMatriz; j++) {
                if (k < tam) {
                    matriz[i][j] = n[k];
                    k++;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }
        StringBuilder matrizString = new StringBuilder();
        for (int i = 0; i < tamMatriz; i++) {
            for (int j = 0; j < tamMatriz; j++) {
                matrizString.append(String.format("%4d", matriz[i][j]));
            }
            matrizString.append("\n");
        }
        System.out.println("\n Matriz: \n" + matrizString);
    }
}

