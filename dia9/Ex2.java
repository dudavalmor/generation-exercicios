package dia9;
import java.util.Scanner;


public class Ex2 {

	public static void main(String[] args) {
		
		int vet [] = new int[10];
		int soma = 0, continua;
		double media = 0;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("----------------------------------------------------------------------------");
		System.out.println(" Digite 10 entradas NUM�RICAS INTEIRAS. A seguir, ser� mostrado na tela: ");
		System.out.println(" 1- Todos os elementos pares digitados;");
		System.out.println(" 2-Todos os elementos digitados nos �NDICES �mpares;");
		System.out.println(" 3- A soma de todos os elemenos digitados;");
		System.out.println(" 4- A m�dia de todos os elementos digitados.");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Deseja Continuar?");
		System.out.println("1- Sim, quero jogar.");
		System.out.println("2- N�o, quero sair.");
		System.out.println("----------------------------------------------------------------------------");
		continua = leia.nextInt();
		
		if (continua == 1) {
			for (int i = 0; i < vet.length; i++) {
				System.out.println("\nDigite o " + (i+1) + "� n�mero do vetor: ");
				vet[i] = leia.nextInt(); 
				soma += vet[i];
			}
			
			media = soma/vet.length;
			
			System.out.println("---------------------------------");
			System.out.println("Elementos pares: ");
			for (int i = 0; i < vet.length; i++) {
				if(vet[i] % 2 == 0) {
					System.out.print(vet[i] + "  ");
				}
			}
			
			System.out.println("\n---------------------------------");	
			System.out.println("Elementos nos �ndices �mpares: ");
			for (int i = 0; i < vet.length; i++) {
				if((i%2) != 0 ) {
					System.out.print(vet[i] + "  ");
				}
			}
			
				System.out.println("\n---------------------------------");
				System.out.println("Soma: " + soma);
				System.out.printf("A m�dia �: %.2f", media);
				System.out.println("\n---------------------------------");
		}   else {
				System.out.println("\nFinalizando o programa....");
				System.out.println("                  Finalizando...");
				System.out.println("                       Programa finalizado.");
		} 
		
		leia.close();
		
	}

}
