package exercicios5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExibeCores {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		String corDigitada;
		ArrayList<String> cores= new ArrayList<String>();
		
		for (int i= 0; i < 5; i++) {
			System.out.print("Digite uma cor: ");
			corDigitada = leia.nextLine();
			cores.add(corDigitada);
			
		}
		
		System.out.println("Cores inseridas: " + cores);
		
		Collections.sort(cores);
		
		System.out.println("Cores ordenadas: " + cores );
		
		leia.close();

	}

}
