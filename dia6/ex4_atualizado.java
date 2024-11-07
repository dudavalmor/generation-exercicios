package dia6;
import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		float n1, n2, n3, n4, diferenca;
		
		System.out.println("Digite o primeiro valor: ");
		n1 = scanner.nextFloat();
		
		System.out.println("Digite o segundo valor: ");
		n2 = scanner.nextFloat();
		
		System.out.println("Digite o terceiro valor: ");
		n3 = scanner.nextFloat();
		
		System.out.println("Digite o quarto valor: ");
		n4 = scanner.nextFloat();
		
		diferenca = ((n1*n2) - (n3*n4));
		
		System.out.printf("A diferença do produto de n1 e n2 pelo produto entre n3 e n4 é: %.1f", diferenca);
		
		scanner.close();
		
	}
}
