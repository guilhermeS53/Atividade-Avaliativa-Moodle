package Ex01;

import javax.swing.*;

public class Ex1 {
    public static void main(String[] args) {
        int qtdMin, qtdMax;
        double estoqueMedio;

        qtdMin = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade mínima da peça: "));
        qtdMax = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade mínima da peça: "));

        estoqueMedio = (qtdMin + qtdMax) / 2;

        JOptionPane.showMessageDialog(null, "De acordo com o informado, o estoque médio dessa peça é: " + "\n" + estoqueMedio);
    }
}