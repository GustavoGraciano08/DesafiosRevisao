package desafiosRevisao;

public class contagemRegressiva {
	public static void main(String[] args) {
		
		int contador = 100;
		 
        System.out.println("Contagem Regressiva de 100 a 0 (pulando de 10 em 10):");

        while (contador >= 0) {
            System.out.println(contador);
            contador -= 10; 
        }

        System.out.println("FIM!");
	}

}
