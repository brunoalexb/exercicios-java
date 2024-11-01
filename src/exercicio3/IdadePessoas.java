package exercicio3;

import java.util.Scanner;

public class IdadePessoas {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade;
		int menor21= 0;
		int maior50 = 0;
		
		while(true) {
			System.out.print("Digite uma idade (ou número negativo para finalizar): ");
			idade = leia.nextInt();
			
				if(idade < 0) {
					System.out.println("Você digitou uma idade negativa e a aplicação foi encerrada.");
					break;
				}else if(idade < 21) {
					menor21++;
				}else if(idade > 50){
					maior50++;
				}
		}
		
		 leia.close();
		 
		   System.out.println("Total de pessoas com menos de 21 anos: " + menor21);
	       System.out.println("Total de pessoas com mais de 50 anos: " + maior50);
	       
	       
	
	}

}
