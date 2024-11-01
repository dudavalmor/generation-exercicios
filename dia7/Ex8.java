package dia7;
import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		
		int codOperacao, continua = 1;
		float saldo = 1000, novoSaldo = 0;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Aplicativo Banc�rio");
		System.out.println("----------------------------------");
		System.out.println("| C�digo da Opera��o | Opera��o  |");
		System.out.println("|         1          |   Saldo   |");
		System.out.println("|         2          |   Saque   |");
		System.out.println("|         3          |  Dep�sito |");
		System.out.println("----------------------------------");
		
		do {
		System.out.println("Digite o c�digo da opera��o que deseja fazer: ");
		codOperacao = leia.nextInt();
		
		switch(codOperacao) {
		case 1:
			System.out.println("----------------------------------");
			System.out.printf("O seu saldo atual � R$%s \n", saldo);
			break;
		case 2:
			System.out.println("\n----------------------------------");
			System.out.println("Opera��o: saque");
			System.out.println("Digite o valor que deseja sacar: ");
			float valorSaque = leia.nextFloat();
			
			if (valorSaque > saldo) {
				System.out.println("\nCarregando opera��o...");
				System.out.printf("O saldo � insuficiente.\n");
				break;
			} else {
				System.out.printf("\nPreparando para o saque...");
				novoSaldo = saldo - valorSaque;
				System.out.println("\nDinheiro pronto para o saque.");
				System.out.printf("\nO novo saldo em conta � R$%s \n", novoSaldo);
				novoSaldo = saldo;
				break;
			}
		case 3:
			System.out.printf("\nOpera��o: dep�sito");
			System.out.println("\nDigite o valor que deseja depositar: ");
			float valorDeposito = leia.nextFloat();
			
			System.out.printf("\nPreparando o dep�sito..");
			novoSaldo = saldo + valorDeposito;
			System.out.println("Dep�sito realizado.");
			System.out.printf("O novo saldo em conta � R$%s\n", novoSaldo);
			novoSaldo = saldo;
			break;
		default:
			System.out.println("Opera��o inv�lida!");
		}
		
		System.out.println("----------------------------------");
		System.out.println("Deseja fazer outra opera��o?");
		System.out.println("1 - Sim");
		System.out.println("2 - N�o");
		continua = leia.nextInt(); 
		
		} while (continua == 1);
		
		System.out.println("Encerrando sess�o...");
		System.out.println("Ses�o encerrada.");
		leia.close();
	}

}
