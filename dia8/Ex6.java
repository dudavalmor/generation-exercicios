package dia8;
import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		int num, i = 0;
		double media = 0, soma = 0;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("M�dia de todos os m�ltiplos de 3 entre os n�meros digitados.");
		System.out.println("Digite 0 para sair");
		
		do {
			System.out.println("Digite um n�mero: ");
			num = leia.nextInt();
			if((num%3) == 0 && num != 0) {
				soma += num;
				i++; //i contador de quantidade de numeros
			}
			
		} while (num != 0);
		
		media = soma/i;
		
		System.out.printf("A m�dia de todos os n�meros m�ltiplos de 3 �: %.2f",media);
		
		leia.close();

	}

}
