package desafiosRevisao;

import java.util.Random;
import java.util.Scanner;

public class jogoParOuImpar {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
	 	Random random = new Random();
	 
	 	System.out.print("Escolha Par ou Ímpar: ");
	 	String escolhausuario = ler.nextLine().toLowerCase();
	 
	 	System.out.print("digite um número: ");
	 	int numerousuario = ler.nextInt();
	 
	 	int numerosistema = random.nextInt(10) + 1;
	 	System.out.println("O número do sistema é: " + numerosistema);
	 
	 	int soma = numerousuario + numerosistema;
	 	System.out.println("A soma dos números é: " + soma);
	 
	 	if ((soma % 2 == 0 && escolhausuario.equals("par")) || (soma % 2 != 0 && escolhausuario.equals("impar"))) {
	 	System.out.println("Você venceu!");
	 	} else {
	 	System.out.println("Você perdeu!");
	 	}
	 
	 	ler.close();
	}

}
