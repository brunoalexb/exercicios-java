package exercicios6;

import java.util.Scanner;
import java.util.Stack;

public class PilhaLivros {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int opcaoSelecionada;
		
		Stack<String> pilhaLivros = new Stack<String>();

		System.out.println("Bem vindo ao gerenciador de livros");
		
		do {
			
			System.out.println("O que deseja?");
			System.out.println("Opção 1: Adicionar livro na pilha");
			System.out.println("Opção 2: Listar todos os livros");
			System.out.println("Opção 3: Retirar livros da pilha");
			System.out.println("Opção 0: Sair");
			
			System.out.print("Entre com a opção desejada: ");
			opcaoSelecionada = leia.nextInt();
			leia.nextLine();
			
			String nomeLivro;
			
			switch(opcaoSelecionada) {
			
			case 0:
				System.out.println("Você selecionou a opção: " + opcaoSelecionada);
				System.out.println("Aplicação finalizada!");
				break;
				
			case 1:
				System.out.println("Você selecionou a opção: " + opcaoSelecionada);
				System.out.print("Digite o nome do livro: ");
				nomeLivro= leia.nextLine();
				
				pilhaLivros.push(nomeLivro);
				
				if(pilhaLivros.contains(nomeLivro)) {
					System.out.println("O livro " + nomeLivro + " foi adicionado à pilha!");	
				}else {
					System.out.println("O livro não pôde ser dicionado à fila. Tente novamente!");
				}
				break;
				
			case 2:
				System.out.println("Você selecionou a opção: " + opcaoSelecionada);
				if(pilhaLivros.isEmpty()) {
					System.out.println("Não há livros na pilha!");
				} else {
					System.out.println("Lista de livros na pilha: " + pilhaLivros);
				}
				break;
				
			case 3:
				System.out.println("Você selecionou a opção: " + opcaoSelecionada);
				if(pilhaLivros.isEmpty()) {
					System.out.println("Não há livros para retirar!");
				}else {
					String livroRetirado = pilhaLivros.pop();
					System.out.println("O livro " + livroRetirado + " foi removido da pilha");
					System.out.println("Pilha de livros atualizada: " + pilhaLivros);
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
