package Ex17;

import javax.swing.*;

public class Ex17 {
    public static void main(String[] args) {
        int numSorteio = (int) (Math.random() * 101);
        int tentativa = 0;

        while (true) {
            String chuteNum = JOptionPane.showInputDialog("Informe um valor de 0 a 100: ");
            System.out.println("Número informado: " + chuteNum);
            int chuteNume = Integer.parseInt(chuteNum);
            tentativa++;

            if (chuteNume == numSorteio) {
                System.out.println("\n Parabéns, você acertou em " + tentativa + " tentativa(s)");
                break;
            } else
            if (chuteNume < numSorteio) {
                System.out.println("\n O número é MAIOR que " + chuteNume);
            } else {
                System.out.println("\n O número é MENOR que " + chuteNume);
            }
        }
    }
}
