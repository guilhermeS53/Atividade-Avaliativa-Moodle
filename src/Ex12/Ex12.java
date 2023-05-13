package Ex12;

import java.math.BigInteger;

public class Ex12 {
    public static void main(String[] args) {
        BigInteger numGraos = BigInteger.ONE; // por conta do valor ser muito alto
        int qtdQuadros = 64; // por conta do tabuleiro de xadrez

        for (int i = 1; i < qtdQuadros; i++) {
            numGraos = numGraos.multiply(BigInteger.TWO); // melhoria no desempenho do código e melhoria na organização do código
        }
        System.out.println("O monge no caso irá esperar receber " + numGraos + " grãos de trigo!");
    }
}
