package exercicio3;

import java.util.Scanner;

public class NumerosMultiplos {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("O valor do primeiro número deve ser menor do que o valor do segundo número");
		
		
		System.out.print("Digite o primeiro número: ");
		int primeiroNumero = leia.nextInt();
		
		System.out.print("Digite o segundo número: ");
		int segundoNumero = leia.nextInt();
		
		if(segundoNumero > primeiroNumero) {
			int i;
			
			System.out.println("No intervalo entre " + primeiroNumero + " e " + segundoNumero + ":");
			
			for (i = primeiroNumero; i <= segundoNumero; i++ ) {
				if(i % 3 == 0  && i % 5 == 0) {
					System.out.println(i + " é múltiplo de 3 e 5");
				}
			}
		}else {
			System.out.print("O intervalo é inválido");
		}
		
		leia.close();

	}

}
