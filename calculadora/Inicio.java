package calculadora;

import java.util.ArrayList;
import java.util.Scanner;

public class Inicio {

    public static void main(String[] args) {
        
    	Scanner leitor = new Scanner(System.in);
    	
    	ArrayList<Double> memoria = new ArrayList<>();
        //uma variável "memoria" que é uma ArrayList que contém números de ponto flutuante (Double)
    	Metodos metodos = new Metodos();
    	//Estou criando uma nova istância da classe "Metodos" isso me permite que eu acesse os métodos e os atributos dentro da classe "Metodos"
        Historico historico = new Historico();
        //Estou criando uma nova istância da classe "Historico" isso me permite que eu acesse os métodos e os atributos dentro da classe "Historico"
        int opcao;

        // Loop principal para manter o programa em execução
        while (true) {
            System.out.println("\nBem-vindo à calculadora");

            try {
                System.out.println("\n1. Adição");
                System.out.println("2. Subtração");
                System.out.println("3. Multiplicação");
                System.out.println("4. Divisão");
                System.out.println("5. Raiz quadrada");
                System.out.println("6. Potenciação");
                System.out.println("7. Histórico");
                System.out.println("8. Encerrar o programa");
                System.out.print("\nEscolha uma opção: ");

                opcao = leitor.nextInt();
                leitor.nextLine();  // Limpa o buffer do Scanner

                switch (opcao) {
                    case 1:
                        System.out.println("\nAdição");
                        double resultadoAdicao = metodos.adicao();
                        memoria.add(resultadoAdicao);
                        historico.adicionarOperacao("Adição: " + resultadoAdicao);
                        break;
                    case 2:
                        System.out.println("\nSubtração");
                        double resultadoSub = metodos.subtracao();
                        memoria.add(resultadoSub);
                        historico.adicionarOperacao("Subtração: " + resultadoSub);
                        break;
                    case 3:
                        System.out.println("\nMultiplicação");
                        double resultadoMult = metodos.multiplica();
                        memoria.add(resultadoMult);
                        historico.adicionarOperacao("Multiplicação: " + resultadoMult);
                        break;
                    case 4:
                        System.out.println("\nDivisão");
                        double resultadoDiv = metodos.div();
                        memoria.add(resultadoDiv);
                        historico.adicionarOperacao("Divisão: " + resultadoDiv);
                        break;
                    case 5:
                        System.out.println("\nRaiz quadrada");
                        double resultadoRaiz = metodos.raiz();
                        memoria.add(resultadoRaiz);
                        historico.adicionarOperacao("Raiz quadrada: " + resultadoRaiz);
                        break;
                    case 6:
                        System.out.println("\nPotenciação");
                        double resultadoPont = metodos.potencia();
                        memoria.add(resultadoPont);
                        historico.adicionarOperacao("Potenciação: " + resultadoPont);
                        break;
                    case 7:
                        System.out.println("\nHistórico:");
                        ArrayList<String> historicoOperacoes = historico.getHistoricoOperacoes();
                        if (historicoOperacoes.isEmpty()) {
                            System.out.println("Histórico vazio");
                        } else {
                            for (String operacao : historicoOperacoes) {
                                System.out.println(operacao);
                            }
                        }
                        break;
                    case 8:
                        System.out.println("\nEncerrando o programa...");
                        leitor.close(); // Fecha o Scanner antes de encerrar o programa
                        return; // Retorna para encerrar o método main e, consequentemente, o programa
                    default:
                        System.out.println("\nOpção inválida. Tente novamente.");
                }
            } catch (Exception e) {
                System.out.println("\nEntrada inválida. Digite apenas números");
                leitor.nextLine(); // Limpa o buffer do Scanner
            }
        }
    }
} 