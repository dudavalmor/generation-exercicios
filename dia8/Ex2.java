package dia8;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		int num, par = 0, impar = 0;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Quantidade de números ímpares e pares entre 10 números digitados");
		for(int i = 1; i < 11; i++) {
			System.out.println("Digite o "+ i + " º número:");
			num = leia.nextInt();
			
			if (num%2 == 0) {
				par++;
			} else {
				impar++;
			}
		} 
		
		System.out.println("Quantidade de números pares: " + par);
		System.out.println("Quantidade de números ímpares: " + impar);
		
		leia.close();
	}

}
