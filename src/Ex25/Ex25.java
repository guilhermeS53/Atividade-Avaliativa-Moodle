package Ex25;

import java.util.Arrays;

public class Ex25 {
    public static void main(String[] args) {
        int[][] mat = {
                {9, 2, 5},
                {9, 4, 3},
                {6, 7, 3}
        };

        int k = 3;

        int[] maiorElem = encontrarMaiorElem(mat, k);

        System.out.println("Os " + k + " maiores elementos na matriz são os seguintes:");
        System.out.println(Arrays.toString(maiorElem));
    }

    public static int[] encontrarMaiorElem(int[][] mat, int k) {
        int[] element = new int[mat.length * mat[0].length];
        int index = 0;

        for (int[] line : mat) {
            for (int elemento : line) {
                element[index] = elemento;
                index++;
            }
        }

        Arrays.sort(element);

        int[] maior = new int[k];

        for (int i = element.length - 1, j = 0; i >= element.length - k; i--, j++) {
            maior[j] = element[i];
        }
        return maior;
    }
}