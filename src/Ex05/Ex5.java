package Ex05;

import javax.swing.*;

public class Ex5 {
    public static void main(String[] args) {

        int x;
        x = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor qualquer para X: "));
        System.out.println("O valor informado para X foi " + x);

        if (x >= 0) {
            System.out.println("O módulo do valor informado para X é: " + x);
        } else {
            System.out.println("O módulo do valor informado para X é: " + x * (-1));
        }
    }
}
