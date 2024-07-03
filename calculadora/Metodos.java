package calculadora;

import java.util.Scanner;

public class Metodos {
	
	Scanner leitor = new Scanner(System.in);
	
	public void adicao() {
		
		System.out.print("\nDigite o primeiro número: ");
			int escolha = leitor.nextInt();
		System.out.print("\nDigite o segundo número: ");
			int escolha1 = leitor.nextInt();
			
		int resultado = escolha + escolha1;
			System.out.print("O resultado do cálculo é: " + resultado);
	}
	
	public void subtracao() {
		
		System.out.print("\nDigite o primeiro número: ");
			int escolha = leitor.nextInt();
		System.out.print("\nDigite o segundo número: ");
			int escolha1 = leitor.nextInt();
			
		int resultado = escolha - escolha1;
			System.out.println("O resultado do cálculo é: " + resultado);
	}
	
	public void multiplica() {
		
		System.out.print("\nDigite o primeiro número: ");
			int escolha = leitor.nextInt();
		System.out.print("\nDigite o segundo número: ");
			int escolha1 = leitor.nextInt();
		
		int resultado = escolha * escolha1;
			System.out.println("O resultado do cálculo é: " + resultado);
	}
	
	public void div() {
		
			System.out.print("\nDigite o primeiro número: ");
				int escolha = leitor.nextInt();
			System.out.print("\nDigite o segundo número: ");
				int escolha1 = leitor.nextInt();
			
			double resultado = escolha / escolha1;
				System.out.println("O resultado do cálculo é: " + resultado);
	}
}