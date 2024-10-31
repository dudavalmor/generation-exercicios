package dia8;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		int idade = 0, menor21 = 0, maior50 = 0;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Para finalizar, digite uma idade NEGATIVA.");
		
		while(!(idade < 0)) {
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();
			
			if (idade < 21 && idade > 0) { //para não contar a idade negativa
				menor21++;
			} else if (idade > 50){
				maior50++;
			}
		}
		
		System.out.println("Total de pessoas menores de 21 anos: " + menor21);
		System.out.println("Total de pessoas maiores de 50 anos: " + maior50);
		
		leia.close();
	}

}
