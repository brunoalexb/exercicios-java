package exercicio3;


import java.util.Scanner;

public class VerificaNumeros {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int i;
		int numero;
		int numeroPar = 0;
		int numeroImpar= 0;
		
		for(i = 1; i <= 10; i++) {
			System.out.print("Digite um número: ");
			numero = leia.nextInt();
			
			if (numero % 2 == 0) {
				numeroPar++;
			}else {
				numeroImpar++;
			}
			
		}
		
		leia.close();
		
		System.out.println("Total de números pares: " + numeroPar);
		System.out.println("Total de números ímpares: " + numeroImpar);
	}
	
}
