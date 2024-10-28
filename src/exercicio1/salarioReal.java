package exercicio1;
import java.util.Scanner;

public class salarioReal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o salário bruto: ");
        float salarioBruto = scanner.nextFloat();
        
        
        System.out.print("Digite o adicional noturno: ");
        float adicionalNoturno = scanner.nextFloat();
		
        System.out.print("Digite o valor das horas extras: ");
        float horasExtras = scanner.nextFloat();
		
        
        System.out.print("Digite o valor dos descontos: ");
        float descontos = scanner.nextFloat();
		
		float salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		System.out.printf("O salário líquido é de: %.2f", salarioLiquido);
		
		scanner.close();

	}

}
