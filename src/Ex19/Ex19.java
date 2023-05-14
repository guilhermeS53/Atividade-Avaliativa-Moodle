package Ex19;

import javax.swing.*;

public class Ex19 {
    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog("Informe uma frase desejada: ");

        String vog = "";

        for (int i = 0; i < frase.length(); i++) {
            char x = frase.charAt(i);

            if (x == 'a' || x == 'A' || x == 'e' || x == 'E' || x == 'i' || x == 'I' || x == 'o' || x == 'O' || x == 'u' || x == 'U') {
                vog = vog + x;
            }
        }
        System.out.println("Vogais encontradas na frase inserida: " + vog);
    }
}
