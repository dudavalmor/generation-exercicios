package dia7;
import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		float num1, num2 = 0;
		int codOperacao, continua;
		float soma = 0, subtracao = 0, multiplicacao = 0, divisao = 0;
		
		do {
			System.out.println(" ####Calculadora online#### ");
			System.out.println("---------------------------");
			System.out.println("|  C�digo |    Opera��o   |");
			System.out.println("|    1    |     Soma      |");
			System.out.println("|    2    |   Subtra��o   |");
			System.out.println("|    3    | Multiplica��o |");
			System.out.println("|    4    |    Divis�o    |");
			System.out.println("---------------------------");
			
			System.out.println("Digite o primeiro n�mero: ");
			num1 = leia.nextFloat();
			
			System.out.println("Digite o segundo numero: ");
			num2 = leia.nextFloat();
			
			System.out.println("Digite o c�digo da opera��o que deseja realizar: ");
			codOperacao = leia.nextInt();
			
			switch(codOperacao) {
			case 1:
				soma = (num1 + num2);
				System.out.printf("%s + %s = %s.", num1, num2, soma);
				break;
			case 2:
				subtracao = (num1 - num2);
				System.out.printf("%s - %e = %s", num1, num2, subtracao);
				break;
			case 3:
				multiplicacao = (num1 * num2);
				System.out.printf("%s * %s = %s.", num1, num2, multiplicacao);
				break;
			case 4:
				if (num2 != 0) {
					divisao = (num1/num2);
					System.out.printf("%s / %s = %s.", num1, num2, divisao);
				} else {
					System.out.println("Erro: Divis�o por zero n�o � permitido.");
				}
							
				break;
			default:
				System.out.println("Erro: c�digo de opera��o inv�lido.");
			}
			
			System.out.println("\nDeseja fazer outra opera��o?");
			System.out.println("1 - Sim");
			System.out.println("2 - N�o");
			continua = leia.nextInt();
			
			if ((continua != 1) || (continua != 0)) {
				System.out.println("Erro: entrada inv�lida. Finaliza��o autom�tica. ");
				break;
			}
			
		} while(continua == 1);
		
		System.out.println("\nFinalizando....");
		System.out.println("Sistema finalizado");
		
		leia.close();
	}

}
