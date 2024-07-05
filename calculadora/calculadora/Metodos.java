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
			
			Inicio.main(null);
	}
	
	public void subtracao() {
		
		System.out.print("\nDigite o primeiro número: ");
			int escolha = leitor.nextInt();
		System.out.print("\nDigite o segundo número: ");
			int escolha1 = leitor.nextInt();
			
		int resultado = escolha - escolha1;
			System.out.println("O resultado do cálculo é: " + resultado);
			
			Inicio.main(null);
	}
	
	public void multiplica() {
		
		System.out.print("\nDigite o primeiro número: ");
			double escolha = leitor.nextDouble();
		System.out.print("\nDigite o segundo número: ");
			double escolha1 = leitor.nextDouble();
		
		double resultado = escolha * escolha1;
			System.out.println("O resultado do cálculo é: " + resultado);
			
			Inicio.main(null);
	}
	
	public void div() {
		
			System.out.print("\nDigite o primeiro número: ");
				double escolha = leitor.nextDouble();
						
			System.out.print("\nDigite o segundo número: ");
				double escolha1 = leitor.nextDouble();
					
				if(escolha == 0 || escolha1 == 0) {
					
					System.out.println("Erro: Divisão com 0 não existe");
					System.out.println("Tente novamente");
					
					
					Inicio.main(null);
					
				}
			double resultado = escolha / escolha1;
				System.out.println("O resultado do cálculo é: " + resultado);
				
				Inicio.main(null);
	}
}