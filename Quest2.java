import java.util.Scanner;

//programa que verifica a existencia de um caractereem uma string e mostra suas repetições

public class Quest2 {

    public static void main(String[] args) {
        // Criação do scanner para leitura de input do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita a string do usuário
        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();

        // Conta a ocorrência da letra 'a' (minúscula e maiúscula)
        int contador = contarOcorrenciasDeA(input);

        // Verifica se a letra 'a' foi encontrada
        if (contador > 0) {
            System.out.println("A letra 'a' aparece " + contador + " vezes na string.");
        } else {
            System.out.println("A letra 'a' não foi encontrada na string.");
        }

        // Fecha o scanner
        scanner.close();
    }

    // Função para contar ocorrências de 'a' e 'A'
    private static int contarOcorrenciasDeA(String texto) {
        int contador = 0;

        // Itera por cada caractere da string
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            // Verifica se o caractere é 'a' ou 'A'
            if (c == 'a' || c == 'A') {
                contador++;
            }
        }

        return contador;
    }
}