package dia_6;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		
		float salario, abono, novoSalario;
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("--------CALCULO DO NOVO SALARIO--------");
		
		System.out.println("Digite o sal�rio que deseja ser alterado: ");
		salario = scanner.nextFloat();
		
		System.out.println("Digite o valor do abono que deve ser alterado: ");
		abono = scanner.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.printf("O novo sal�rio �: R$%.0f",novoSalario);
		
		scanner.close();
		

	}

}
