package exercicios6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FilaBanco {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int opcaoSelecionada;
		Queue<String> fila = new LinkedList<String>();
		
		System.out.println("Bem vindo ao gerenciador de filas do GoodBank");
		
		do {
		
			System.out.println("O que deseja?");
			System.out.println("Opção 1: Adicionar cliente na fila");
			System.out.println("Opção 2: Listar todos os clientes");
			System.out.println("Opção 3: Retirar cliente da fila");
			System.out.println("Opção 0: Sair");
			
			
			System.out.print("Entre com a opção desejada: ");
			opcaoSelecionada = leia.nextInt();
			leia.nextLine();
			 
			 
			String nomeCliente;
			
			switch(opcaoSelecionada) {
			
			case 0:
				System.out.println("Você selecionou a opção: " + opcaoSelecionada + " e essa aplicação foi finalizada!");
				break;
				
			case 1:	
				System.out.println("Você selecionou a opção: " + opcaoSelecionada);
				System.out.print("Digite o nome: ");
				nomeCliente = leia.nextLine();
				
				fila.add(nomeCliente);
				
				if(fila.contains(nomeCliente)) {
					System.out.println("O cliente " + nomeCliente + " foi adicionado à fila!");
				}else {
					System.out.println("O nome do cliente " + nomeCliente + " não pôde ser dicionado à fila. Tente novamente!");
				}
				
				break;
				
			case 2:
				System.out.println("Você selecionou a opção: " + opcaoSelecionada);
				if(fila.isEmpty() ) {
					System.out.println("A fila está vazia!");
				}else {
					System.out.println("Lista de clientes na fila: " + fila);
				}
				break;
				
			case 3:
				if(fila.isEmpty()) {
					System.out.println("A fila está vazia! Não há clientes para remover.");
				}else {
					System.out.println("O cliente " + fila.remove() + " foi chamado!");
					System.out.println("Fila atualizada: " + fila);
				}
				break;
				
			default:
	            System.out.println("Opção inválida! Por favor, escolha uma opção válida.");	
				break;
				
			}
		
		}while(opcaoSelecionada != 0);
		
		leia.close();
	}

}
