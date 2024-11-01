package exercicios5;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ListarDados {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numeroDigitado;
		
		Set<Integer> setNumeros = new HashSet<Integer>();
		
		
		for(int i= 0; i < 10; i++) {
			System.out.print("Digite um número: ");
			numeroDigitado = leia.nextInt();
			setNumeros.add(numeroDigitado);
			
		}
		
		Iterator<Integer> isetNumeros = setNumeros.iterator();
		
		System.out.print("Listar dados do Set: ");
		while (isetNumeros.hasNext()) {
			System.out.print(isetNumeros.next() + " ");
		}
		
		leia.close();
	}

}
