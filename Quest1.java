import java.util.Scanner;

//programa que verifica se um numero pertence ou não a sequência de Fibonacci

public class Quest1{
  

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = scanner.nextInt();
        
        if (isInFibonacci(n)) {
            System.out.println("O número " + n + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + n + " não pertence à sequência de Fibonacci.");
        }
        
        scanner.close();
    }

    // Função para verificar se o número pertence à sequência de Fibonacci
    private static boolean isInFibonacci(int n) {
        int anterior = 0, atual = 1, proximo;
        
        if (n == anterior || n == atual) {
            return true; // Caso o número seja 0 ou 1, que estão na sequência
        }

        while (atual <= n) {
            proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
            
            if (atual == n) {
                return true;
            }
        }
        
        return false;
    }
}