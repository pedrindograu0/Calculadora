package calculadora;

import java.util.ArrayList;

public class Historico {
    private ArrayList<String> historicoOperacoes = new ArrayList<>();
    //uma variável "historicoOperacoes" que é uma ArrayList do tipo String
    
    public void adicionarOperacao(String operacao) {
        historicoOperacoes.add(operacao);
        //Adiciona uma nova operação ao histórico
    }
    public void exibirHistorico() {
        if (historicoOperacoes.isEmpty()) {
        	// Verifica se a lista historicoOperacoes está vazia usando o método "isEmpty()".
            System.out.println("Histórico vazio");
            //se estiver, essa mensagem será printada. 
        } else {
        	//senao
            System.out.println("Histórico de operações:");
            for (String operacao : historicoOperacoes) {
            	//Este é um loop (laço de repetição) que percorre cada elemento da lista historicoOperacoes.
                System.out.println(operacao);
                //Senão estiver vazia o código então printara a operação escolhida.
            }
        }
    }

    public ArrayList<String> getHistoricoOperacoes() {
    	//uma variável "getHistroricoOperacoes" que é uma ArrayList do tipo String.
        return historicoOperacoes;
        //O código retornará a varíavel "historicoOperacoes" que é uma Arraylist do tipo String e está definida no método "Historico"
    }
}
