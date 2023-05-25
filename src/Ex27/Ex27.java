package Ex27;

public class Ex27 {
    public static void main(String[] args) {
        ConversorDecimalParaBinario(7);
    }
    private static void ConversorDecimalParaBinario(int n){
        if (n > 0){
            ConversorDecimalParaBinario(n / 2);
            System.out.print(n % 2);
        }
    }
}
