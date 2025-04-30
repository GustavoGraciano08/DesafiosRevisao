package desafiosRevisao;

import java.util.Scanner;

public class simuladorCofrinho {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
        double total = 0;
        int quantidadeMoedas = 0;
        double valorInserido;

        System.out.println("Simulador de Cofrinho");
        System.out.println("Digite os valores que você quer adicionar.");
        System.out.println("Para parar, digite 0.");

        do {
            System.out.print("Digite o valor a inserir (ou 0 para parar): R$ ");
            valorInserido = ler.nextDouble();

            if (valorInserido > 0) {
                total += valorInserido;
                quantidadeMoedas++;
                System.out.println("R$ " + String.format("%.2f", valorInserido) + " adicionado ao cofrinho.");
            } else if (valorInserido < 0) {
                System.out.println("Valor inválido. Digite um valor positivo ou 0 para parar.");
            }

        } while (valorInserido != 0);

        System.out.println("Resultado do Cofrinho: ");
        System.out.println("Quantidade de itens inseridos: " + quantidadeMoedas);
        System.out.println("Total no cofrinho: R$ " + String.format("%.2f", total));

        ler.close();
		
	
		}
		}
