package Ex16;

import javax.swing.*;

public class Ex16 {
    public static void main(String[] args) {
        int[] V1 = new int[5];
        int[] V2 = new int[5];

        for (int i = 0; i < V1.length; i++) {
            String val = JOptionPane.showInputDialog("Informe um valor: " + (i+1));
            System.out.println("Os números informados do V1: " + i);
            V1[i] = Integer.parseInt(val);
        }

        for (int i = 0; i < V2.length; i++) {
            String val2 = JOptionPane.showInputDialog("Informe um valor: " + (i+1));
            System.out.println("Os números informados do V2: " + i);
            V2[i] = Integer.parseInt(val2);
        }

        int cont = 0;

        for (int i = 0; i < V1.length; i++) {
            if (V1[i] == V2[i]) {
                cont++;
            }
        }

        System.out.println("Os vetores de V1 e V2 têm " + cont + " valores idênticas em mesmas posições!");
    }
}
