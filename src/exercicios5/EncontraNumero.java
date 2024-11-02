package exercicios5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EncontraNumero {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numeroDigitado;
		Set<Integer> setListaNumeros = new HashSet<Integer>();
		
		
		for (int i = 1; i <= 10; i++) {
			setListaNumeros.add(i);
		}
		
		System.out.println(setListaNumeros);
		
		System.out.print("Digite o número que você deseja encontrar: ");
		numeroDigitado = leia.nextInt();
		
		if(setListaNumeros.contains(numeroDigitado)) {
			System.out.print("O número " + numeroDigitado + " foi encontrado.");
		}else {
			System.out.print("O número " + numeroDigitado + " não foi encontrado.");
		}
		leia.close();
	}

}
