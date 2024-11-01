package exercicios5;

import java.util.ArrayList;
import java.util.Scanner;

public class PosicaoNumeroo {

	public static void main(String[] args) {
		
		ArrayList<Integer> listaNumeros= new ArrayList<Integer>();
		Scanner leia = new Scanner(System.in);
		int numeroDesejado;
	
		for (int i = 1; i <= 10; i++) {
			listaNumeros.add(i);
		}
		
		System.out.println( "Temos os seguintes números: " + listaNumeros);
		System.out.print("Digite o número que você deseja encontrar a posição: ");
		numeroDesejado = leia.nextInt();
		
		if(listaNumeros.contains(numeroDesejado)) {
			System.out.print("O número " + numeroDesejado + " está localizado na posição: " + listaNumeros.indexOf(numeroDesejado));
		}else {
			System.out.print("O número " + numeroDesejado + " não foi encontrado.");
		}
		leia.close();
	}

}
