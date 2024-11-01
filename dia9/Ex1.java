package dia9;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		int vet [] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int num, tamanho = vet.length;
		int cont = 1, i;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("|-----------------------------------------|");
		System.out.println("|--Encontre a posi��o do n�mero desejado--|");
		System.out.println("|Vetor -  {2, 5, 1, 3, 4, 9, 7, 8, 10, 6} |");
		System.out.println("|posi��es: 0  1  2  3  4  5  6  7  8   9  |");
		System.out.println("|-----------------------------------------|");
		
		while(cont == 1){
			System.out.println("Digite o valor que voc� que encontrar a posi��o: ");
			num = leia.nextInt();
			
			for(i = 0; i < tamanho; i++){
				if (num == vet[i]){
					System.out.println("\nO n�mero " + num + " est� na posi��o " + i + ".");
					cont = 2;
					break;
				}	
			}
			
			if ((cont != 2) && (cont != 1)) {
				System.out.println("O n�mero n�o foi encontrado.");
			}

			System.out.println("----------------------------------------------");
			System.out.println("Deseja encontrar a posi��o de outro n�mero?");
			System.out.println("1 - Sim");
			System.out.println("2 - N�o");
			System.out.println("----------------------------------------------");
			cont = leia.nextInt();
			
			switch(cont) {
			case 1:
				break;
			case 2:
				System.out.println("\nFinalizando o programa....");
				System.out.println("                  Finalizando...");
				System.out.println("                       Programa finalizado.");
				cont = 0;
				break;
			default:
				System.out.println("--------------------------");
				System.out.println("Erro: Sa�da Inv�lida");
				System.out.println("Digite uma op��o v�lida");
				System.out.println("1 - Sim");
				System.out.println("2 - N�o");
				System.out.println("--------------------------");
				cont = leia.nextInt();			
			}
			
		}  
		
		leia.close();
		
	}

}
