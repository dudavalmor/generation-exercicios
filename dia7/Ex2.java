package dia7;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		int num;
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite o n�mero desejado: ");
		num = scanner.nextInt();
		
		if (num < 0 && (num%2) == 0) {
			System.out.println("O n�mero � negativo e par.");
		} else if (num < 0 && (num%2) != 0) {;
			System.out.println("O n�mero � negativo e �mpar.");
		} else if (num > 0 && (num%2) == 0) {
			System.out.println("O n�mero � positivo e par.");
		} else {
			System.out.println("O n�mero � positivo e �mpar.");
		}
		
		scanner.close();
	}

}
