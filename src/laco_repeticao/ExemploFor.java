package laco_repeticao;

import java.util.Scanner;

public class ExemploFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome1;
		Scanner leia = new Scanner(System.in);

		for(int i=0; i <= 2; i++) {
		System.out.println("Digite o "+ (i+1) +"º nome: ");
		nome1 = leia.nextLine();
		System.out.println("O "+ (i+1) +"º nome é: " + nome1 + "\n");
		}
		
		System.out.println("Fim do loop");
		
		leia.close();
		
	}

}
