package dia_6;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		
		float salarioBruto, adicionalNoturno, horasExtras, descColaborador, salarioLiquido;
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite o Sal�rio Bruto: ");
		salarioBruto = scanner.nextFloat();
		
		System.out.println("Digite o valor do adicional noturno: ");
		adicionalNoturno = scanner.nextFloat();
		
		System.out.println("Digite a quantidade de horas extras feitas: ");
		horasExtras = scanner.nextFloat();
		
		System.out.println("Digite o desconto de colaborador");
		descColaborador = scanner.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras*5) - descColaborador;
		
		System.out.printf("O sal�rio l�quido � de R$%.2f",salarioLiquido);
		
		scanner.close();
		
	}

}
