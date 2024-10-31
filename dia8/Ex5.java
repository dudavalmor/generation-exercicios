package dia8;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		int num, soma = 0; 
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Soma dos números POSITIVOS digitados");
		System.out.println("Digite zero para finalizar");
		
		do {
			System.out.println("Digite um número: ");
			num = leia.nextInt();
			
			if(num > 0) {
				soma += num;
			}
			
		} while(!(num == 0));
		
		System.out.println("A soma dos números positivos é " + soma);
		
		leia.close();
		
	}

}
