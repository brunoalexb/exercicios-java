package exercicio2;

import java.util.Scanner;

public class OpcaoProdutos {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("# ## ### #### #########   Menu   ########## #### ### ## #");
		System.out.println("Opção 1: Cachorro Quente - R$10.00");
		System.out.println("Opção 2: X-Salada - R$15.00");
		System.out.println("Opção 3: X-Bacon - R$18.00");
		System.out.println("Opção 4: Bauru - R$12.00");
		System.out.println("Opção 5: Refrigerante - R$8.00");
		System.out.println("Opção 6: Suco de laranja - R$13.00");
		
		
		System.out.print("Selecione a opção do menu de 1 a 6: ");
		int produto = leia.nextInt();
		
		
		
		
		String nomeProduto;
		double precoUnidade;
		
		
		
		switch (produto) {
		case 1:
			nomeProduto = "Cachorro Quente";
            precoUnidade = 10.00;
            System.out.println("Você selecionou a opção: " + produto + " - " + nomeProduto);
            break;
		case 2:
			nomeProduto = "X-Salada";
            precoUnidade = 15.00;
            System.out.println("Você selecionou a opção: " + produto + " - " + nomeProduto);
			break;
		case 3:
			nomeProduto = "X-Bacon";
            precoUnidade = 18.00;
            System.out.println("Você selecionou a opção: " + produto + " - " + nomeProduto);
			break;
		case 4:
			nomeProduto = "Bauru";
            precoUnidade = 12.00;
            System.out.println("Você selecionou a opção: " + produto + " - " + nomeProduto);
			break;
			
		case 5:
			nomeProduto = "Refrigerante";
            precoUnidade = 8.00;
            System.out.println("Você selecionou a opção: " + produto + " - " + nomeProduto);
			break;
		case 6:
			nomeProduto = "Suco de laranja";
            precoUnidade = 13.00;
            System.out.println("Você selecionou a opção: " + produto + " - " + nomeProduto);
			break;
			
		default:
            System.out.println("Código de cargo inválido.");
            leia.close();
            return;
		
		}
		
		System.out.print("Digite a quantidade comprada:  ");
		int quantidadeComprada = leia.nextInt();
		
		
		
		double valorTotal = precoUnidade * quantidadeComprada;
		
		
		
		System.out.println("Você comprou " + quantidadeComprada + " unidades de " + nomeProduto + " no valor de R$" + precoUnidade +" por unidade. Totalizando: R$" + valorTotal );
		
		leia.close();
		

	}

}
