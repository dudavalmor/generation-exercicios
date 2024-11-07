package dia6;
import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		
		float salario, abono, novoSalario;
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("--------CALCULO DO NOVO SALARIO--------");
		
		System.out.println("Digite o salário que deseja ser alterado: ");
		salario = scanner.nextFloat();
		
		System.out.println("Digite o valor do abono que deve ser alterado: ");
		abono = scanner.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.printf("O novo salário é: R$%.0f",novoSalario);
		
		scanner.close();
		
	}
}
