package desafiosRevisao;

import java.util.Random;
import java.util.Scanner;

public class numerosMagicos {
	
	public static void main(String[] args) {
		
		 Scanner ler = new Scanner(System.in);
	        Random random = new Random();
	        int[] numerosMagicos = new int[5];
	        int acertos = 0;
	        int[] palpitesUsuario = new int[5];

	        System.out.println("Bem-vindo ao Jogo dos Números Mágicos!");
	        System.out.println("Tente adivinhar 5 números únicos entre 1 e 50.");


	        for (int i = 0; i < 5; i++) {
	            int numeroAleatorio;
	            boolean repetido;
	            do {
	                numeroAleatorio = random.nextInt(50) + 1;
	                repetido = false;
	                for (int j = 0; j < i; j++) {
	                    if (numerosMagicos[j] == numeroAleatorio) {
	                        repetido = true;
	                        break;
	                    }
	                }
	            } while (repetido);
	            numerosMagicos[i] = numeroAleatorio;
	        }

	      
	        for (int i = 0; i < 5; i++) {
	            System.out.print("Digite seu " + (i + 1) + "º palpite: ");
	            palpitesUsuario[i] = ler.nextInt();
	        }

	        System.out.println("\n--- Resultado ---");
	        System.out.print("Seus palpites foram: ");
	        for (int i = 0; i < 5; i++) {
	            System.out.print(palpitesUsuario[i] + (i < 4 ? " " : ""));
	        }
	        System.out.println();

	     
	        for (int palpite : palpitesUsuario) {
	            for (int magico : numerosMagicos) {
	                if (palpite == magico) {
	                    acertos++;
	                    break; 
	                }
	            }
	        }

	        System.out.println("Você acertou " + acertos + " número(s)!");

	        ler.close();
	}

}
