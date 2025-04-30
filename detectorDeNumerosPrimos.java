package desafiosRevisao;

import java.util.Scanner;

public class detectorDeNumerosPrimos {
	public static void main(String[] args) {
		
		 Scanner ler = new Scanner(System.in);

	        System.out.print("Digite um número inteiro positivo: ");
	        int numero = ler.nextInt();

	        if (numero <= 1) {
	            System.out.println(numero + " não é um número primo.");
	        } else {
	            int divisorEncontrado = 0;

	            for (int i = 2; i * i <= numero; i++) {
	                if (numero % i == 0) {
	                    divisorEncontrado = 1;
	                    break;
	                }
	            }

	            if (divisorEncontrado == 0) {
	                System.out.println(numero + " é um número primo.");
	            } else {
	                System.out.println(numero + " não é um número primo.");
	            }
	        }

	        ler.close();
	}

}
