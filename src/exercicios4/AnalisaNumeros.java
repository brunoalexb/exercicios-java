package exercicios4;

import java.util.Scanner;

public class AnalisaNumeros {

	public static void main(String[] args) {
		

		Scanner leia = new Scanner(System.in);
		
		int[] numeros = new int[10];
		
		int valorSoma= 0;
		
		for(int i= 0; i < numeros.length; i++) {
			
			System.out.print("Digite um número: ");
			int valorInserido = leia.nextInt();
			numeros[i] = valorInserido;
			
			
			valorSoma = valorSoma + valorInserido;
			
		}
		
		System.out.print("Elementos pares: ");
		for(int i = 0; i < numeros.length; i++ ) {
			if(numeros[i] % 2 == 0) {
				 System.out.print(numeros[i] + " ");
			}
		}
		
		
		System.out.print("Elementos nos índices ímpares: ");
		for(int i = 1; i < numeros.length; i+=2 ) {
				System.out.println(numeros[i]);
			}
		
		System.out.println("Soma: " + valorSoma);
		
		
		float calculoMedia = (float) valorSoma / numeros.length;
		
		System.out.print("Média: " + calculoMedia);
		
		
		

	}

}
