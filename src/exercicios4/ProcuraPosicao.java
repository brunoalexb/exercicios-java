package exercicios4;

import java.util.Scanner;

public class ProcuraPosicao {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int [] numeros = {2, 3, 1, 5, 7, 6, 8, 10, 9, 4};
		int valorProcurado;
		
		
		
		while(true) {
			boolean posicaoEncontrada = false;
			System.out.print("Digite o numero que você deseja encontrar: ");
			valorProcurado = leia.nextInt();
			
			for (int i = 0; i < numeros.length; i++) {
				if(numeros[i] == valorProcurado) {
					System.out.println("O número " + valorProcurado + " está localizado na posição " + i);
					posicaoEncontrada = true;
					break;
				}
		}
		
		
			if(posicaoEncontrada == false) {
				System.out.println("O valor não foi encontrado.");
			}
		}
			
		
			
	
	}

}
