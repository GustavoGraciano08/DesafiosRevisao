package desafiosRevisao;

import java.util.Scanner;

public class verificadorTriangulo {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		 
	     System.out.println("Digite o primeiro lado do triângulo:");
	     double lado1 = scanner.nextDouble();
	 
	     System.out.println("Digite o segundo lado do triângulo:");
	     double lado2 = scanner.nextDouble();
	 
	     System.out.println("Digite o terceiro lado do triângulo:");
	     double lado3 = scanner.nextDouble();
	 
	     if ((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1)) {
	         System.out.println("Os lados formam um triângulo.");
	         if (lado1 == lado2 && lado2 == lado3) {
	             System.out.println("É um triângulo equilátero.");
	         } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
	             System.out.println("É um triângulo isósceles.");
	         } else {
	             System.out.println("É um triângulo escaleno.");
	         }
	     } else {
	         System.out.println("Os lados não formam um triângulo.");
	     }
	 
	     scanner.close();
	}

}
