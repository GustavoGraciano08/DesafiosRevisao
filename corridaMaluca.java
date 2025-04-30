package desafiosRevisao;

import java.util.Random;
import java.util.Scanner;

public class corridaMaluca {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
        Random random = new Random();
        String[] nomes = new String[3];
        int[] distancias = {0, 0, 0};

        System.out.println("Corrida Maluca!");
        for (int i = 0; i < 3; i++) {
            System.out.print("Nome do corredor " + (i + 1) + ": ");
            nomes[i] = ler.nextLine();
        }

        System.out.println("\nComeçou!");
        for (int volta = 1; volta <= 5; volta++) {
            System.out.println("\nVolta " + volta + ":");
            for (int i = 0; i < 3; i++) {
                distancias[i] += random.nextInt(10) + 1;
                System.out.println(nomes[i] + " -> " + distancias[i]);
            }
        }

        int campeao = 0;
        for (int i = 1; i < 3; i++) {
            if (distancias[i] > distancias[campeao]) {
                campeao = i;
            }
        }

        System.out.println("\n--- Fim ---");
        System.out.println("Campeão: " + nomes[campeao] + " (Distância: " + distancias[campeao] + ")");

        ler.close();
	}

}
