package dia8;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		int menor, maior;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("########### ########################## Jogo do intervalo ########################## ###########");
		System.out.println("Neste jogo, voc� ir� definir um intervalo, e diremos quem nesse intervalo � m�ltiplo de 3 e de 5");
		
		System.out.println("Digite o primeiro n�mero do intervalo: ");
		menor = leia.nextInt();
		
		System.out.println("Digite o segundo n�mero do intervalo ");
		maior = leia.nextInt();
		
		if (menor < maior ) {
			for(int i = menor; i <= maior; i++) {
				if((i%3 == 0) & (i%5 == 0)){
					System.out.println(i + " � m�ltiplo de 3 e 5.");
				}
			}
		} else {
			System.out.println("Erro: intervalo inv�lido - O primeiro n�mero deve ser menor que o primeiro. ");
		}
		leia.close();
	}

}
