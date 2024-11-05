package dia11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Iterator;

public class Ex1_Fila {

	public static void main(String[] args) {
		
		Queue <String> fila = new LinkedList<>();
		Scanner entrada = new Scanner(System.in);
		int opcao, continua = 1;
		String nome;
		
		while(continua == 1) {
			System.out.println("\n|--------------MENU--------------|");
			System.out.println("| 1 - Adicionar cliente a fila   |");
			System.out.println("| 2 - Listar todos os clientes   |");
			System.out.println("| 3 - Retirar cliente da fila    |");
			System.out.println("| 4 - Sair                       |");
			System.out.println("|________________________________|");
			
			System.out.println("Digite a opção que você deseja: ");
			opcao = entrada.nextInt();
			entrada.nextLine();
			
			switch (opcao) {
			case 1:
				//adicionando os nomes na fila
				System.out.println("\nDigite o nome do cliente: ");
				nome = entrada.nextLine();
				fila.add(nome);
				//ordenando os nomes adicionados na fila
				System.out.println("\nFila:");
				for(String cliente : fila ) {
					System.out.println(cliente);
				}
				System.out.println("\nCliente adicionado à fila!");
				break;
			
			case 2:
				System.out.println("\nClientes na fila de espera: ");
				//verificando se a fila está vazia
				if(fila.isEmpty()) {
					System.out.println("\nA fila está vazia!");
				} else {
					for(String cliente : fila) {
						System.out.println(cliente);
					}
				}
				break;
			
			case 3:
				//retirando os clientes da fila
				if (fila.isEmpty()) {
					System.out.println("\nA fila está vazia, não há o que retirar.");
				} else {
					String retirado = fila.poll();
					System.out.println(fila);
				}
				break;
			
			case 4:
				System.out.println("\nSaindo do sistema....");
				continua = 2;
				entrada.close();
				break;
				
			default:
				System.out.println("\nErro: Opção inválida.");
				break;
			}
		}
		
		System.out.println("Sistema finalizado.");

	}

}
