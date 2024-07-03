package calculadora;

import java.util.Scanner;

public class Inicio {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);	
		Metodos metodos = new Metodos();
		
		System.out.println("Escolha a função matemática que você deseja");
			System.out.println("\n1: Adição");
			System.out.println("2: Subtração");
			System.out.println("3: Multiplicação");
			System.out.println("4: Divisão");
		System.out.print("\nEscolha o número referente a opção: ");
			int funcao = leitor.nextInt();
			
			if (funcao > 4 || funcao < 1) {
				Inicio.main(args);
			}
		
			switch(funcao) {
				case 1:
					System.out.println("Opção adição");
						metodos.adicao();
						
						break;
						
				case 2: 
					System.out.println("Opção subtração");
						metodos.subtracao();
						
						break;		
						
				case 3: 
					System.out.println("Opção multiplicação");
						metodos.multiplica();
						
						break;
				
				case 4: 
					System.out.println("Opção divisão");
						metodos.div();
						
						break;
					
			}
 }
}