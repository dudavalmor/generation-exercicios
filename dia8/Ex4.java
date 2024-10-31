package dia8;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		int idade, idGenero, dev;
		int totalPessoasBack = 0;
		int totalPessoas = 0;
		int mulheresCisTransFront = 0;
		int homensCisTransDevMobile40 = 0;
		int naoBinariosDevFullStack30 = 0;
		double mediaIdade = 0;
		char continuar = 's';
		
		Scanner leia = new Scanner (System.in);
		
		while(continuar == 's') {
			System.out.println("Digite a sua idade: ");
			idade = leia.nextInt();
			
			System.out.println("\nIdentidade de G�nero");
			System.out.println("1 - Mulher Cis");
			System.out.println("2 - Homem Cis");
			System.out.println("3 - N�o Bin�rio");
			System.out.println("4 - Mulher Trans");
			System.out.println("5 - Homem Trans");
			System.out.println("6 - Outros");
			System.out.println("Qual a sua identidade de G�nero (digite o n�emro)? ");
			idGenero = leia.nextInt();
			
			System.out.println("\nPessoa Desenvolvedora");
			System.out.println("1 - Backend");
			System.out.println("2 - Frontend");
			System.out.println("3 - Mobile");
			System.out.println("4 - Fullstack");
			System.out.println("Qual a sua �rea (digite o n�mero)? ");
			dev = leia.nextInt();
			
			if(dev == 1) {
				totalPessoasBack++;
			} 
			
			if ((idGenero == 1 || idGenero == 4) && (dev == 2)) {
				mulheresCisTransFront++;
			}
			
			if((idGenero == 2 || idGenero == 5) && (dev == 3) && (idade > 40)) {
				homensCisTransDevMobile40++;
			}
			
			if((idGenero == 3) && (dev == 4) && (idade < 30)) {
				naoBinariosDevFullStack30++;
			}
			
			totalPessoas++;
			mediaIdade = mediaIdade + idade; //soma das idades
			
			System.out.println("Deseja continuar?(s/n) ");
			continuar = leia.next().charAt(0);
		}
		
		System.out.println("O n�mero de pessoas desenvolvedoras Backend �: " + totalPessoasBack);
		System.out.println("O n�mero de Mulheres Cis e Trans desenvolvedoras Frontend �: " + mulheresCisTransFront);
		System.out.println("O n�mero de Homens Cis e Trans Desenvolvedores Mobile com mais de 40 anos �: " + homensCisTransDevMobile40);
		System.out.println("O n�mero de N�o Bin�rios desenvolvedores Fullstack com mais de 30 anos �: " + naoBinariosDevFullStack30);
		System.out.println("O total de pessoas que responderam a pesquisa: " + totalPessoas);
		System.out.printf("A m�dia de idade das pessoas que responderam a pesquisa: %.2f", (mediaIdade/totalPessoas));
		
		leia.close();

	}

}
