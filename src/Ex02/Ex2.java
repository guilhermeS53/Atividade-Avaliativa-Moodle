package Ex02;

import javax.swing.*;

public class Ex2 {
    public static void main(String[] args) {
        double cotaDolar, valDolar;
        double valReal;

        cotaDolar = Double.parseDouble(JOptionPane.showInputDialog("Informe a cotação do dólar: "));
        valDolar = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor em dólar: "));
        System.out.println("O valor da cotação do dólar informado foi " + cotaDolar);
        System.out.println("O valor informado em dólar foi " + valDolar);

        valReal = (cotaDolar * valDolar);

        System.out.println("O valor convertido para reais é: " + valReal);
    }
}
