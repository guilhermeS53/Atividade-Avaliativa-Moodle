package Ex21;

import javax.swing.*;

public class Ex21 {
    public static void main(String[] args) {

        String caract = JOptionPane.showInputDialog("Informe o primeiro caractere: ");
        String caract2 = JOptionPane.showInputDialog("Informe o primeiro caractere: ");
        System.out.println("O primeiro caractere digitado foi: " + caract + " e o segundo foi: " + caract2);
        char car1 = caract.charAt(0);
        char car2 = caract2.charAt(0);

        if (car2 < car1) {
            System.out.println("O SEGUNDO caractere precisa ser maior que o primeiro informado!");
        } else {
            int sub = car2 - car1 - 1;

            System.out.println("A quantidade de caracteres entre os intervalos " + car1 + " e " + car2 + " é IGUAL a: " + sub);
        }
    }
}
