package Ex22;

import javax.swing.*;

public class Ex22 {
    public static void main(String[] args) {
        int cat1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do primeiro cateto: "));
        int cat2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do segundo cateto: "));

        double hipot = calcHipot(cat1, cat2);

        System.out.println("Hipotenusa = " + hipot);
    }

    public static double calcHipot (int cat1, int cat2) {
        double hipot = Math.sqrt((cat1 * cat1) + (cat2 * cat2));
        return hipot;
    }
}
