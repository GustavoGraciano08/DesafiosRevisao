package desafiosRevisao;

import java.util.Scanner;

public class somaNumerosPositivos {
	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
	        int numero;
	        int soma = 0;

	        System.out.println("Digite números positivos para somar (digite um negativo para parar):");

	        do {
	            System.out.print("Digite um número: ");
	            numero = scanner.nextInt();

	            if (numero > 0) {
	                soma += numero; 
	            }
	        } while (numero >= 0); 
	        System.out.println("A soma dos números positivos digitados é: " + soma);

	        scanner.close();
	}

}
