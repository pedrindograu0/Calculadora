package calculadora;

import java.util.ArrayList;
import java.util.Scanner;

public class Metodos {
	
	Scanner leitor = new Scanner(System.in);
		
	
	public double adicao() {
		
		System.out.print("\nDigite o primeiro número: ");
			double escolha = leitor.nextInt();
		System.out.print("\nDigite o segundo número: ");
			double escolha1 = leitor.nextInt();
			
		double resultado = escolha + escolha1;
			System.out.print("O resultado do cálculo é: " + resultado + "\n");
			
			return resultado;	
			
	}
	
	public double subtracao() {
		
		System.out.print("\nDigite o primeiro número: ");
			double escolha = leitor.nextInt();
		System.out.print("\nDigite o segundo número: ");
			double escolha1 = leitor.nextInt();
			
		double resultado = escolha - escolha1;
			System.out.println("O resultado do cálculo é: " + resultado + "\n");
						
			return resultado;
	}
	
	public double multiplica() {
		
		System.out.print("\nDigite o primeiro número: ");
			double escolha = leitor.nextDouble();
		System.out.print("\nDigite o segundo número: ");
			double escolha1 = leitor.nextDouble();
		
		double resultado = escolha * escolha1;
			System.out.println("O resultado do cálculo é: " + resultado + "\n");
						
			return resultado;
	}
	
	public double div() {
		
			System.out.print("\nDigite o primeiro número: ");
				double escolha = leitor.nextDouble();
						
			System.out.print("\nDigite o segundo número: ");
				double escolha1 = leitor.nextDouble();
					
				if(escolha == 0 || escolha1 == 0) {
					
					System.out.println("Erro: Divisão com 0 não existe");
					System.out.println("Tente novamente");
				}
					//return resultado;	
			double resultado = escolha / escolha1;
				System.out.println("O resultado do cálculo é: " + resultado + "\n");
				
				return resultado;
	}
		
	public double raiz() {		
			
			System.out.print("\nDigite o número desejado: ");
				double escolha = leitor.nextInt();

				if (escolha == 0) {
						Inicio.main(null);
				}
				
				Double resultado = Math.sqrt(escolha);
				System.out.println("A raiz quadrada de " + escolha + " é: " + resultado);
				
				  return resultado;
				  
				  
	}
	
	public double potencia() {
	   
	    System.out.print("\nDigite o primeiro número: ");
	    double base = leitor.nextDouble();

	    System.out.print("Digite o expoente: ");
	    double expoente = leitor.nextDouble();

	    double resultado = Math.pow(base, expoente);
	    
	    System.out.println("O resultado do cálculo é: " + resultado + "\n");
	    
	    return resultado;
	}
}