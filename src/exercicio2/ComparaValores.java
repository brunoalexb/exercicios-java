package exercicio2;

import java.util.Scanner;

public class ComparaValores {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o valor de A: ");
        int a = leia.nextInt();
        
		System.out.print("Digite o valor de B: ");
        int b = leia.nextInt();
        
		System.out.print("Digite o valor de C: ");
        int c = leia.nextInt();
        
        
        if(a + b == c) {
        	System.out.println("A soma de A: " + a + " e B: " + b + " é igual a C: " + c);
        }else if(a + b > c) {
        	System.out.println("A soma de A: " + a + " e B: " + b + " é maior que C: " + c);
        }else {
        	System.out.println("A soma de A: " + a + " e B: " + b + " é menor que C: " + c);
        }
        
        
        leia.close();

	}

}
