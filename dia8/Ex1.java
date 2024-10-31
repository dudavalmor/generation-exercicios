package dia8;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		int menor, maior;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("########### ########################## Jogo do intervalo ########################## ###########");
		System.out.println("Neste jogo, você irá definir um intervalo, e diremos quem nesse intervalo é múltiplo de 3 e de 5");
		
		System.out.println("Digite o primeiro número do intervalo: ");
		menor = leia.nextInt();
		
		System.out.println("Digite o segundo número do intervalo ");
		maior = leia.nextInt();
		
		if (menor < maior ) {
			for(int i = menor; i <= maior; i++) {
				if((i%3 == 0) & (i%5 == 0)){
					System.out.println(i + " é múltiplo de 3 e 5.");
				}
			}
		} else {
			System.out.println("Erro: intervalo inválido - O primeiro número deve ser menor que o primeiro. ");
		}
		leia.close();
	}

}
