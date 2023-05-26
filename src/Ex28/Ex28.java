package Ex28;

public class Ex28 {
    public static void main(String[] args) {
        int[] array = {5, -4, 8, -2, 0, 7, -4, 6, -7};

        int esq = 0;
        int dir = array.length - 1;

        while (esq < dir) {
            while (esq < dir && array[esq] >= 0) {
                esq++;
            }

            while (esq < dir && array[dir] < 0) {
                dir--;
            }
            if (esq < dir) {
                int aux = array[esq];
                array[esq] = array[dir];
                array[dir] = aux;
            }
        }
        System.out.print("\n");
        System.out.println("Organizando: ");
            for (int n : array) {
                System.out.println(n + " ");
            }
        }
    }
