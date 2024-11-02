package dia10;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex3 {

	public static void main(String[] args) {
		
		Set<Integer> numeros = new HashSet<Integer>();
		int numero;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Pense em 10 números (eles não pode ser repetidos).");
		System.out.println("Caso haja números repetidos, eles seram adicionados apenas uma única vez.");
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o " + (i+1) + "° número: ");
			numero = entrada.nextInt();
			numeros.add(numero);
		}
		
		System.out.println("\nNúmeros listados: ");
		
		Iterator<Integer> iNumero = numeros.iterator();
		
		while(iNumero.hasNext()) {
			System.out.println(iNumero.next());
		}
		
		entrada.close();
	}

}
