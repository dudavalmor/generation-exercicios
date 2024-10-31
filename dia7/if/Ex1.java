package dia_7;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		int A, B, C, soma;
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite o primeiro número: ");
		A = scanner.nextInt();
		
		System.out.println("Digite o segundo número: ");
		B = scanner.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		C = scanner.nextInt();
		
		soma = A + B;
		
		if (soma > C) {
			System.out.println("A soma de A + B é Maior do que C.");
		} else if (soma < C) {
			System.out.println("A soma de A + B é Menor do que C.");
		} else {
			System.out.println("A soma de A + B é Igual a C.");
		}
		
		scanner.close();
	}

}
