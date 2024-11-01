package dia7;
import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		
		int codOperacao, continua = 1;
		float saldo = 1000, novoSaldo = 0;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Aplicativo Bancário");
		System.out.println("----------------------------------");
		System.out.println("| Código da Operação | Operação  |");
		System.out.println("|         1          |   Saldo   |");
		System.out.println("|         2          |   Saque   |");
		System.out.println("|         3          |  Depósito |");
		System.out.println("----------------------------------");
		
		do {
		System.out.println("Digite o código da operação que deseja fazer: ");
		codOperacao = leia.nextInt();
		
		switch(codOperacao) {
		case 1:
			System.out.println("----------------------------------");
			System.out.printf("O seu saldo atual é R$%s \n", saldo);
			break;
		case 2:
			System.out.println("\n----------------------------------");
			System.out.println("Operação: saque");
			System.out.println("Digite o valor que deseja sacar: ");
			float valorSaque = leia.nextFloat();
			
			if (valorSaque > saldo) {
				System.out.println("\nCarregando operação...");
				System.out.printf("O saldo é insuficiente.\n");
				break;
			} else {
				System.out.printf("\nPreparando para o saque...");
				novoSaldo = saldo - valorSaque;
				System.out.println("\nDinheiro pronto para o saque.");
				System.out.printf("\nO novo saldo em conta é R$%s \n", novoSaldo);
				novoSaldo = saldo;
				break;
			}
		case 3:
			System.out.printf("\nOperação: depósito");
			System.out.println("\nDigite o valor que deseja depositar: ");
			float valorDeposito = leia.nextFloat();
			
			System.out.printf("\nPreparando o depósito..");
			novoSaldo = saldo + valorDeposito;
			System.out.println("Depósito realizado.");
			System.out.printf("O novo saldo em conta é R$%s\n", novoSaldo);
			novoSaldo = saldo;
			break;
		default:
			System.out.println("Operação inválida!");
		}
		
		System.out.println("----------------------------------");
		System.out.println("Deseja fazer outra operação?");
		System.out.println("1 - Sim");
		System.out.println("2 - Não");
		continua = leia.nextInt(); 
		
		} while (continua == 1);
		
		System.out.println("Encerrando sessão...");
		System.out.println("Sesão encerrada.");
		leia.close();
	}

}
