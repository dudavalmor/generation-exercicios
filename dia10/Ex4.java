package dia10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex4 {

	public static void main(String[] args) {
		
		Set<Integer> numeros = new HashSet<Integer>();
		int numero;
		int continua = 1;
		Scanner entrada = new Scanner(System.in);
		
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);
		
		while((continua == 1)||(continua != 2)) {
			System.out.println("Digite um número para ser encontrado: ");
			numero = entrada.nextInt();
			
			if(numeros.contains(numero)) {
				System.out.println("Parabéns! O número " + numero + " foi localizado.");
			} else {
				System.out.println("Poxa, você errou :( ");
				System.out.println("\nO número " + numero + " não foi encontrado.");
			}
				
			System.out.println("\nDeseja procurar outro número? ");
			System.out.println("1 - Sim");
			System.out.println("2 - Não");
			continua = entrada.nextInt();
			
			if ((continua != 1) && (continua != 2)) {
				System.out.println("Erro: Entrada inválida");
			}
			
		}
		System.out.println("Finalizando o sistema...");
		System.out.println("Sistema Finalizado.");
		entrada.close();
		
	}

}
