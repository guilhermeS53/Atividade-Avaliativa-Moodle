package Ex15;

import javax.swing.*;

public class Ex15 {
    public static void main(String[] args) {
        String[] nomeM = new String[10];
        int[] idadeM = new  int[10];
        int apta = 0;

        for (int i = 0; i < 10; i++) {
            String nome = JOptionPane.showInputDialog("Informe o nome da candidata: " + (i+1));
            String idadeString = JOptionPane.showInputDialog("Informe a idade da candidata: " + (i+1));
            System.out.println("Nome informado: " + nome);
            System.out.println("Idade informada: " + idadeString);

            int idade = Integer.parseInt(idadeString);

            nomeM[i] =  nome;
            idadeM[i] = idade;

            if (idade >= 18 && idade <= 20) {
                apta++;
            }
        }
        String[] nomeApta = new String[apta];
        int j = 0;

        for (int i = 0; i < 10; i++) {
            if (idadeM[i] >= 18 && idadeM[i] <= 20) {
                nomeApta[j] = nomeM[i];
                j++;
            }
        }
        System.out.println("A(s) candidata(s) apta(s) para tal campanha é(são): ");
        for (int i = 0; i < apta; i++) {
            System.out.println(nomeApta[i] + ",");
        }
    }
}
