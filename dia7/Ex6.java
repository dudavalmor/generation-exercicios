package dia7;
import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		String colaborador, Cargo = "";
		int cargoColaborador;
		double salario, novoSalario = 0, reajuste = 0;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("                Calculadora de reajuste salarial                ");
		System.out.println("------------------------------------------------------------------");
		System.out.println("|Código do Cargo |         Cargo         | Percentual de Reajuste|");
		System.out.println("|       1        |        Gerente        |          10%          |");
		System.out.println("|       2        |        Vendedor       |           7%          |");
		System.out.println("|       3        |       Supervisor      |           9%          |");
		System.out.println("|       4        |        Motorista      |           6%          |");
		System.out.println("|       5        |       Estoquista      |           5%          |");
		System.out.println("|       6        |     Técnico de TI     |           7%          |");
		System.out.println("------------------------------------------------------------------");
		
		System.out.println("Digite o nome do colaborador: ");
		colaborador = leia.nextLine();
		System.out.println("Digite o cargo do colaborador: ");
		cargoColaborador = leia.nextInt();
		System.out.println("Digite o salário do colaborador: ");
		salario = leia.nextDouble();
		
		switch(cargoColaborador) {
		case 1:
			reajuste = 0.1;
			Cargo = "Gerente";
			break;
		case 2:
			reajuste = 0.07;
			Cargo = "Vendedor";
			break;
		case 3:
			reajuste = 0.09;
			Cargo = "Supervisor";
			break;
		case 4:
			reajuste = 0.06;
			Cargo = "Motorista";
			break;
		case 5:
			reajuste = 0.05;
			Cargo = "Estoquista";
			break;
		case 6:
			reajuste = 0.08;
			Cargo = "Técnico de TI";
			break;
		default:
			System.out.println("Erro: Opção inválida.");
		}
		
		novoSalario = salario + (reajuste * salario);
		
		System.out.printf("\nNome do colaborador %s", colaborador);
		System.out.printf("\nCargo do colaborador: %s", Cargo);
		System.out.printf("\nSalário reajustado: R$%.2f", novoSalario);	
		
		leia.close();
		
	}

}
