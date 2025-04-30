package desafiosRevisao;

import java.util.Scanner;

public class calculadoraDeMédia {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
        double[] notas = new double[100]; 
        int numNotas = 0;
        double soma = 0;
        double nota;

        System.out.println("Calculadora de Média com Aprovação!");
        System.out.println("Digite as notas do aluno (digite um valor negativo para parar):");

        while (true) {
            System.out.print("Digite a nota: ");
            nota = ler.nextDouble();

            if (nota < 0) {
                break; 
            }

            if (numNotas < notas.length) {
                notas[numNotas] = nota;
                soma += nota;
                numNotas++;
            } else {
                System.out.println("Limite de notas atingido.");
                break;
            }
        }

        if (numNotas == 0) {
            System.out.println("Nenhuma nota foi digitada.");
        } else {
            double media = soma / numNotas;
            System.out.println("--- Resultado ---");
            System.out.printf("Média: %.2f%n", media);

            if (media >= 7.0) {
                System.out.println("Situação: APROVADO");
            } else if (media >= 5.0) {
                System.out.println("Situação: RECUPERAÇÃO");
            } else {
                System.out.println("Situação: REPROVADO");
            }
        }

        ler.close();
	}

}
