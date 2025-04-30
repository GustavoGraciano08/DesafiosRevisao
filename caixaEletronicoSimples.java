package desafiosRevisao;

import java.util.Scanner;

public class caixaEletronicoSimples {
	public static void main(String[] args) {
		
		 Scanner ler = new Scanner(System.in);
	        double saldo = 100.0; 
	        int opcao;

	        System.out.println("Bem-vindo ao Caixa Eletrônico!");

	        while (true) {
	            System.out.println("Escolha uma opção:");
	            System.out.println("1. Ver Saldo");
	            System.out.println("2. Depositar");
	            System.out.println("3. Sacar");
	            System.out.println("4. Sair");
	            System.out.print("Digite o número da opção desejada: ");
	            opcao = ler.nextInt();

	            switch (opcao) {
	                case 1:
	                    System.out.println("Seu saldo atual é: R$ " + String.format("%.2f", saldo));
	                    break;
	                case 2:
	                    System.out.print("Digite o valor a depositar: R$ ");
	                    double deposito = ler.nextDouble();
	                    if (deposito > 0) {
	                        saldo += deposito;
	                        System.out.println("Depósito de R$ " + String.format("%.2f", deposito) + " realizado com sucesso.");
	                        System.out.println("Seu novo saldo é: R$ " + String.format("%.2f", saldo));
	                    } else {
	                        System.out.println("Valor de depósito inválido.");
	                    }
	                    break;
	                case 3:
	                    System.out.print("Digite o valor a sacar: R$ ");
	                    double saque = ler.nextDouble();
	                    if (saque > 0 && saque <= saldo) {
	                        saldo -= saque;
	                        System.out.println("Saque de R$ " + String.format("%.2f", saque) + " realizado com sucesso.");
	                        System.out.println("Seu novo saldo é: R$ " + String.format("%.2f", saldo));
	                    } else if (saque <= 0) {
	                        System.out.println("Valor de saque inválido.");
	                    } else {
	                        System.out.println("Saldo insuficiente.");
	                    }
	                    break;
	                case 4:
	                    System.out.println("Obrigado por usar nosso caixa eletrônico!");
	                    ler.close();
	                    return;
	                default:
	                    System.out.println("Opção inválida. Por favor, escolha uma das opções do menu.");
	            }
	        }
	    }
	}
	

