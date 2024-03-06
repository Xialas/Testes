import java.util.Scanner;

public class SeqFibonnaci {

    public static void main(String[] args) {
        
		Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para verificar se ele pertence à sequência de Fibonacci:");
        int n = scanner.nextInt();

        if (isInFibonacci(n)) {
            System.out.println(n + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(n + " não pertence à sequência de Fibonacci.");
        }
    }

    private static boolean isInFibonacci(int num) {
        if (num == 0 || num == 1) {
            return true;
        }

        int anterior = 0;
        int proximo = 1;

        while (proximo < num) {
            int resultado = anterior + proximo;
            anterior = proximo;
            proximo = resultado;
        }

        return proximo == num;
    }
}
