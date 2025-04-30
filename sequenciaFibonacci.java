package desafiosRevisao;

import java.util.Scanner;

public class sequenciaFibonacci {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		 
        System.out.print("Digite o número de termos da sequência de Fibonacci desejado (N): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Digite um número positivo:");
        } else if (n == 1) {
            System.out.println("Sequência de Fibonacci até o 1º termo: 1");
        } else {
            System.out.println("Sequência de Fibonacci até o " + n + "º termo:");
            int primeiroTermo = 0;
            int segundoTermo = 1;

            System.out.print(primeiroTermo + " " + segundoTermo);

            for (int i = 2; i < n; i++) {
                int proximoTermo = primeiroTermo + segundoTermo;
                System.out.print(" " + proximoTermo);
                primeiroTermo = segundoTermo;
                segundoTermo = proximoTermo;
            }
            System.out.println(); 
        }

        scanner.close();
	}

}
