package dia8;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		int num, par = 0, impar = 0;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Quantidade de n�meros �mpares e pares entre 10 n�meros digitados");
		for(int i = 1; i < 11; i++) {
			System.out.println("Digite o "+ i + " � n�mero:");
			num = leia.nextInt();
			
			if (num%2 == 0) {
				par++;
			} else {
				impar++;
			}
		} 
		
		System.out.println("Quantidade de n�meros pares: " + par);
		System.out.println("Quantidade de n�meros �mpares: " + impar);
		
		leia.close();
	}

}
