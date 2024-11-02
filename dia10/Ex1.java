package dia10;
import java.util.Scanner;
import java.util.ArrayList;

public class Ex1 {

	public static void main(String[] args) {
		
		ArrayList<String> cores = new ArrayList<String>();
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Pense em 5 cores");
		for (int i = 0; i < 5; i++) {
			String cor;
			System.out.println("\nDigite a " + (i + 1) + "° cor: ");
			cor = entrada.nextLine();
			
			//adicionando a cor na ArrayList cores
			cores.add(cor);
		}
		
		//mostrando as cores adicionadas
		System.out.println("As cores adicionadas foram: ");
		for (String cor : cores) {
			System.out.println(cor);
		}
		
		//ordenar as cores em ordem crescente
		cores.sort(null);
		System.out.println("As cores em ordem crescente: ");
		for (String cor: cores) {
			System.out.println(cor);
		}
		
		entrada.close();
	}

}
