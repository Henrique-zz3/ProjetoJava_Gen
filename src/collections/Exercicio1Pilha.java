package collections;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Exercicio1Pilha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcao;
		Queue<String> fila = new LinkedList<String>();
		boolean verific = true;
		Scanner read = new Scanner(System.in);
		
		
		do {
		System.out.println("***********************************************\n");
		System.out.println("	1 - Adicionar cliente na fila\n	2 - Listar todos os Clientes\n	3 - Retirar Clientes da fila\n	0 - Sair");
		System.out.println("\n***********************************************");
		System.out.println("Escolha a opçõa desejada: ");
		
		opcao = read.nextInt();
		
		
			switch(opcao){
			
			case 1:
				System.out.println("Adicione um cliente na lista: ");
				read.skip("\\R?");
				fila.add(read.nextLine());
				
				break;
			case 2:
				System.out.println("\nElementos na fila: "	+ fila);
				
				break;
			case 3:
				System.out.println("Removido o cliente " + fila.poll());		
				
				break;		
			case 0:
				
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
