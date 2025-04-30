package desafiosRevisao;

import java.util.Random;
import java.util.Scanner;

public class adivinhacao {
	public static void main(String[] args) {
		
		Random random = new Random();
	     int numeroAleatorio = random.nextInt(10) + 1;
	 
	     Scanner scanner = new Scanner(System.in);
	     int tentativa;
	     int tentativas = 0;
	 
	     System.out.println("Tente adivinhar o número que estou pensando (entre 1 e 10):");
	 
	     while (true) {
	         System.out.print("Sua tentativa: ");
	         tentativa = scanner.nextInt();
	         tentativas++;
	 
	         if (tentativa < numeroAleatorio) {
	             System.out.println("Dica: O número é MAIOR.");
	         } else if (tentativa > numeroAleatorio) {
	             System.out.println("Dica: O número é MENOR.");
	         } else {
	             System.out.println("Parabéns! Você acertou em " + tentativas + " tentativa(s). O número era " + numeroAleatorio + ".");
	             break;
	         }
	     }
	 
	     scanner.close();
	}

}
