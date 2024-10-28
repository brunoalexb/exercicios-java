package exercicio1;

import java.util.Scanner;

public class SalarioAbono {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor do salário: ");
        float salario = scanner.nextFloat();
        
        System.out.print("Digite o valor do abono: ");
        float abono = scanner.nextFloat();
        
        float novoSalario = salario + abono;
        
        System.out.println("Com salário de: " + salario + " e abono de: " + abono + ". O novo salário é de: " + novoSalario);
        
        scanner.close();

	}

}




