package dia7;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		int item, quantidade = 0;
		double precoTotal = 0;
		String nomeItem = "";
		Scanner leia = new Scanner (System.in);
		
		System.out.println("*------------------- Barraquinha de lanches -------------------*");
		System.out.println("|--------------------------------------------------------------|");
		System.out.println("| CÓDIGO DO PRODUTO |         PRODUTO         | PREÇO UNITÁRIO |");
		System.out.println("|--------------------------------------------------------------|");
		System.out.println("|          1        |       Cachorro Quente   |     R$ 10,00   |");
		System.out.println("|          2        |          X-Salada       |     R$ 15,00   |");
		System.out.println("|          3        |          X-Bacon        |     R$ 18,00   |");
		System.out.println("|          4        |           Bauru         |     R$ 12,00   |");
		System.out.println("|          5        |        Refrigerante     |     R$ 8,00    |");
		System.out.println("|          6        |     Suco de Laranja     |     R$ 13,00   |");
		System.out.println("----------------------------------------------------------------");
		
		System.out.println("Digite o código do produto que você que comprar: ");
		item = leia.nextInt();
		System.out.println("Digite a quantidade desse produto: ");
		quantidade = leia.nextInt();
		
		switch(item) {
		case 1:
			nomeItem = "X-Salada";
			precoTotal = (quantidade * 10.0);
			System.out.printf("O produto escolhido foi %s e o valor total da conta foi de R$%.2f", item, precoTotal);
			break;
		case 2: 
			nomeItem = "X-Salada";
			precoTotal = (quantidade * 15.0);
			System.out.printf("O produto escolhido foi %s e o valor total da conta foi de R$%.2f", item, precoTotal);
			break;
		case 3:
			nomeItem = "X-Bacon";
			precoTotal = (quantidade * 18.0);
			System.out.printf("O produto escolhido foi %s e o valor total da conta foi de R$%.2f", item, precoTotal);
			break;
		case 4:
			nomeItem = "Bauru";
			precoTotal = (quantidade * 12.0);
			System.out.printf("O produto escolhido foi %s e o valor total da conta foi de R$%.2f", item, precoTotal);
			break;
		case 5:
			nomeItem = "Refrigerante";
			precoTotal = (quantidade * 8.0);
			System.out.printf("O produto escolhido foi %s e o valor total da conta foi de R$%.2f", item, precoTotal);
			break;
		case 6:
			nomeItem = "Suco de Laranja";
			precoTotal = (quantidade * 13.0);
			System.out.printf("O produto escolhido foi %s e o valor total da conta foi de R$%.2f", item, precoTotal);
			break;
		default:
			System.out.println("Opção inválida");
		}
		
		leia.close();
	}

}
