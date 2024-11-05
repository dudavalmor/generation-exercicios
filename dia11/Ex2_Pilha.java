package dia11;

import java.util.Stack;
import java.util.Scanner;

public class Ex2_Pilha {

	public static void main(String[] args) {
		
		Stack<String> livros = new Stack<>();
		Scanner entrada = new Scanner(System.in);
		int opcao;
		boolean continua = true;
		
		while(continua) {
			System.out.println("\n|-------------MENU-------------|");
			System.out.println("| 1 - Adicionar livro na pilha |");
			System.out.println("| 2 - Listar todos os livros   |");
			System.out.println("| 3 - Retirar livro da pilha   |");
			System.out.println("| 0 - Sair                     |");
			
			System.out.println("Digite a opção desejada: ");
			opcao = entrada.nextInt();
			entrada.nextLine();
			
			switch(opcao) {
			case 1:
				System.out.println("\nDigite o nome do livro: ");
				String nomeLivro = entrada.nextLine();
				livros.push(nomeLivro);
				
				System.out.println("\nPilha de livros: ");
				for (String livro : livros) {
					System.out.println(livro);
				}
				System.out.println("Livro adicionado a pilha.");
				break;
				
			case 2:
				if(livros.isEmpty()) {
					System.out.println("A pilha de livros está vazia, não há o que mostrar");
				} else {
					System.out.println("\nPilha de livros: ");
					for (String titulos : livros) {
						System.out.println(titulos);
					}
				}
				break;
			
			case 3:
				if(livros.isEmpty()) {
					System.out.println("A pilha de livros está vazia, não há o que retirar.");
				} else {
					String retirado = livros.pop();
					System.out.println("Esse livro foi retirado: " + retirado);
					System.out.println("Pilha atualizada: ");
					for (String titulos1 : livros) {
						System.out.println(titulos1);
					}
				}
				break;
				
			case 0:
				System.out.println("Sistema finalizado.");
				continua = false;
				entrada.close();
				break;
				
			default:
				System.out.println("Erro: Entrada inválida.");
			}
			

		
				
		}
	}

}
