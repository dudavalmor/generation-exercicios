package dia_7;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		int A, B, C, soma;
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		A = scanner.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		B = scanner.nextInt();
		
		System.out.println("Digite o terceiro n�mero: ");
		C = scanner.nextInt();
		
		soma = A + B;
		
		if (soma > C) {
			System.out.println("A soma de A + B � Maior do que C.");
		} else if (soma < C) {
			System.out.println("A soma de A + B � Menor do que C.");
		} else {
			System.out.println("A soma de A + B � Igual a C.");
		}
		
		scanner.close();
	}

}
