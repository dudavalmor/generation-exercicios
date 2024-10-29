package dia_6;

import java.util.Scanner;


public class ex2 {

	public static void main(String[] args) {
		
		float nota1, nota2, nota3, nota4, media;
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite a primeira nota do participante: ");
		nota1 = scanner.nextFloat();
		
		System.out.println("Digite a segunda nota do participante: ");
		nota2 = scanner.nextFloat();
		
		System.out.println("Digite a terceira nota do participante: ");
		nota3 = scanner.nextFloat();
		
		System.out.println("Digite a quarta nota do participante");
		nota4 = scanner.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.printf("A nota final do participante foi de %.1f",media);
		
		scanner.close();
		
	}

}
