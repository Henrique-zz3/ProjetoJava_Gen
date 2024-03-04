package collections;

import java.util.Stack;
import java.util.Scanner;

public class Exeercicio2Fila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcao;
		Stack<String> pilha = new Stack<String>();
		boolean verific = true;
		Scanner read = new Scanner(System.in);
		
		
		do {
		System.out.println("***********************************************\n");
		System.out.println("	1 - Adicionar livro na pilha\n	2 - Listar todos os Livros\n	3 - Retirar livro da pilha\n	0 - Sair");
		System.out.println("\n***********************************************");
		System.out.println("Escolha a opçõa desejada: ");
		
		opcao = read.nextInt();
		
		
			switch(opcao){
			
			case 1:
				System.out.println("Adicione um livro na pilha: ");
				read.skip("\\R?");
				pilha.push(read.nextLine());
				
				System.out.println("Livro adicionado!");
				
				break;
			case 2:
				System.out.println("\nElementos na pilha: "	+ pilha);
				
				break;
			case 3:
				System.out.println("Um livro foi retirado da pilha " + pilha.pop());		
				
				break;		
			case 0:
				System.out.println("Programa finalizado");
				verific = false;
				
				break;
			default:
					
					System.out.println("Opão inválida");
					
					break;
			}
			
			
			
			
		}while(verific != false);
		
		read.close();
		
	}

}
