package exercicio3;

import java.util.Scanner;

public class SomaNumeros {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numeros;
		int somaNumeros = 0;
		
		do {
			System.out.print("Digite um número(ou 0 para sair): ");
			numeros = leia.nextInt();
			
			if(numeros != 0) {
				somaNumeros = somaNumeros + numeros;
			}
			
		}while(numeros != 0);
		
		leia.close();
		
		System.out.println("A soma dos números digitados é: " + somaNumeros);
		
	}

}
