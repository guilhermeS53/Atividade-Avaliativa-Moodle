package Ex18;

import javax.sound.midi.Soundbank;
import javax.swing.*;

public class Ex18 {
    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog("Informe uma frase de até 50 caracteres (espaço conta como caractere): ");
        int tam = frase.length();
        int qtdSpace = 0;

        if (tam > 50) {
            System.out.println("A frase deve ter no máximo 50 caracteres!");
        } else {
            String novaFrase = "";

            for (int i = 0; i < tam; i++) {
                char letra = frase.charAt(i);

                if (letra != ' ') {
                    novaFrase = novaFrase + letra;
                } else {
                    qtdSpace++;
                }
            }
            System.out.println("Frase completa sem os ESPAÇOS EM BRANCO: " + novaFrase);
            System.out.println("Quantidade de ESPAÇOS EM BRANCO: " + qtdSpace);
        }
    }
}
