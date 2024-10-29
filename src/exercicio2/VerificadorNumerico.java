package exercicio2;

import java.util.Scanner;

public class VerificadorNumerico {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
        int numeroUsuario = leia.nextInt();
		
        
        if(numeroUsuario % 2 == 0 ) {
        	System.out.print("O número " + numeroUsuario + " é um número par");
        }else {
        	System.out.print("O número " + numeroUsuario + " é um número ímpar");
        }
        
        if (numeroUsuario > 0) {
            System.out.println(" e também é um número positivo.");
        } else if (numeroUsuario < 0) {
            System.out.println(" e também é um número negativo.");
        } else {
            System.out.println(" e também um número neutro" );
        }
        
        leia.close();

	}

}
