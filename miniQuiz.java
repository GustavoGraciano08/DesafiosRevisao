package desafiosRevisao;

import java.util.Scanner;

public class miniQuiz {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        int pontuacao = 0;

        System.out.println("Bem-vindo ao Mini Quiz Criativo!");
        System.out.println("Responda com o número da sua escolha.\n");

        // Pergunta 1
        System.out.println("1. Qual destes animais é conhecido por sua inteligência e capacidade de usar ferramentas?");
        System.out.println("   1) Leão");
        System.out.println("   2) Chimpanzé");
        System.out.println("   3) Elefante");
        System.out.print("Sua resposta: ");
        int resposta1 = scanner.nextInt();

        switch (resposta1) {
            case 2:
                System.out.println("Resposta correta! Os chimpanzés são realmente espertos.\n");
                pontuacao++;
                break;
            case 1:
            case 3:
                System.out.println("Resposta incorreta. Que pena!\n");
                break;
            default:
                System.out.println("Opção inválida!\n");
        }

        // Pergunta 2
        System.out.println("2. Se misturarmos as cores primárias azul e amarelo, qual cor obtemos?");
        System.out.println("   1) Vermelho");
        System.out.println("   2) Verde");
        System.out.println("   3) Laranja");
        System.out.print("Sua resposta: ");
        int resposta2 = scanner.nextInt();

        switch (resposta2) {
            case 2:
                System.out.println("Acertou! Verde é a cor resultante.\n");
                pontuacao++;
                break;
            case 1:
            case 3:
                System.out.println("Essa não foi a mistura certa!\n");
                break;
            default:
                System.out.println("Essa opção não existe por aqui!\n");
        }

        // Pergunta 3
        System.out.println("3. Qual planeta do nosso sistema solar é conhecido como o 'Planeta Vermelho'?");
        System.out.println("   1) Júpiter");
        System.out.println("   2) Marte");
        System.out.println("   3) Saturno");
        System.out.print("Sua resposta: ");
        int resposta3 = scanner.nextInt();

        switch (resposta3) {
            case 2:
                System.out.println("Parabéns! Marte é o Planeta Vermelho.\n");
                pontuacao++;
                break;
            case 1:
            case 3:
                System.out.println("Quase lá! Tente outra vez.\n");
                break;
            default:
                System.out.println("Hum... essa escolha não está no menu.\n");
        }

        System.out.println("--- Resultado Final ---");
        System.out.println("Sua pontuação foi: " + pontuacao + " de 3.");

        if (pontuacao == 3) {
            System.out.println("Você é um gênio dos quizzes!");
        } else if (pontuacao >= 1) {
            System.out.println("Bom trabalho! Continue praticando!");
        } else {
            System.out.println("Não desanime! A próxima você acerta!");
        }

        scanner.close();
    
	}

}
