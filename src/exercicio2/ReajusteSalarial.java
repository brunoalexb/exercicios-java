package exercicio2;
import java.util.Scanner;


public class ReajusteSalarial {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

       
        System.out.print("Digite o nome do colaborador: ");
        String nomeColaborador = leia.nextLine();
        
		System.out.println("# ## ### #### #########  Qual é o seu cargo?  ########## #### ### ## #");
		System.out.println("Digite 1: Gerente ");
		System.out.println("Digite 2: Vendedor");
		System.out.println("Digite 3: Supervisor");
		System.out.println("Digite 4: Motorista");
		System.out.println("Digite 5: Estoquista");
		System.out.println("Digite 6: Técnico de TI");

        System.out.print("Digite o código do cargo (1 a 6): ");
        int selecioneCargo = leia.nextInt();
        
        String cargo;
        float percentualReajuste;
        
        
        switch (selecioneCargo) {
        case 1:
            cargo = "Gerente";
            percentualReajuste = 0.10f;
            System.out.println("Você selecionou o cargo: " + selecioneCargo + " - " + cargo);
            break;
        case 2:
            cargo = "Vendedor";
            percentualReajuste = 0.07f;
            System.out.println("Você selecionou o cargo: " + selecioneCargo + " - " + cargo);
            break;
        case 3:
            cargo = "Supervisor";
            percentualReajuste = 0.09f;
            System.out.println("Você selecionou o cargo: " + selecioneCargo + " - " + cargo);
            break;
        case 4:
            cargo = "Motorista";
            percentualReajuste = 0.06f;
            System.out.println("Você selecionou o cargo: " + selecioneCargo + " - " + cargo);
            break;
        case 5:
            cargo = "Estoquista";
            percentualReajuste = 0.05f;
            System.out.println("Você selecionou o cargo: " + selecioneCargo + " - " + cargo);
            break;
        case 6:
            cargo = "Técnico de TI";
            percentualReajuste = 0.08f;
            System.out.println("Você selecionou o cargo: " + selecioneCargo + " - " + cargo);
            break;
        default:
            System.out.println("Código de cargo inválido.");
            leia.close();
            return;
    }
        
        System.out.print("Digite o salário atual: ");
        float salarioAtual = leia.nextFloat();	
        
        float novoSalario = salarioAtual + (percentualReajuste * salarioAtual);

        System.out.println("Nome do Colaborador: " + nomeColaborador);
        System.out.println("Cargo: " + cargo);
        System.out.printf("Novo Salário Reajustado: R$ %.2f%n", novoSalario);
        
        
        leia.close();
        
   
        

        

	}

}
