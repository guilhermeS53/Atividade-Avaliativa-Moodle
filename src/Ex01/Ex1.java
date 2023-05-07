package Ex01;

import javax.swing.*;

public class Ex1 {
    public static void main(String[] args) {
        int qtdMin, qtdMax;
        double estoqueMedio;

        qtdMin = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade mínima da peça: "));
        qtdMax = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade mínima da peça: "));
        System.out.println("O valor informado para a quantidade mínima foi de: " + qtdMin);
        System.out.println("O valor informado para a quantidade máxima foi de: " + qtdMax);

        estoqueMedio = (qtdMin + qtdMax) / 2;

        System.out.println("O estoque médio a partir dos valores informados é de " + estoqueMedio);
    }
}