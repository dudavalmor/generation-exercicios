package dia_7;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		String nome;
		int idade;
		boolean primeiraDoacao;
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite o seu nome: ");
		nome = scanner.nextLine();
		
		System.out.print("Digite a sua idade: ");
		idade = scanner.nextInt();
		
		if(idade < 18) {
			System.out.printf("%s n�o est� opto(a) para doar sangue.", nome);
		} else if (idade >= 60 && idade <= 69) {
			System.out.printf("Essa � a sua primeira doa��o? escreva true para sim ou escreva false para n�o", nome);
			primeiraDoacao = scanner.nextBoolean();
			if (primeiraDoacao == true) {
				System.out.printf("%s n�o est� opto(a) para doar sangue.", nome);
			} else {
				System.out.printf("%s est� opto(a) para doar sangue.", nome);
			}
		} else if (idade >= 18 && idade < 60){
			System.out.printf("%s est� opto(a) para doar sangue.", nome);
		} else {
			System.out.printf("%s n�o est� opto(a) para doar sangue.", nome);
		}
		
		scanner.close();
	}

}
