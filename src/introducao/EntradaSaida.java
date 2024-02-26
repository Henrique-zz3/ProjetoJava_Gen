package introducao;

import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {
		
		String nome;
		int idade;
		
		// Entrada de dados
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Insira o seu nome:  ");
		nome = leia.next();
		
		System.out.print("Insira asua idade:  ");
		idade = leia.nextInt();
		
		leia.close();
		
		// Contatenação: Juntar o texto com 1 ou mias variaveis/constantes
		// Saída de dados
		System.out.println("Bom dia, " + nome + "\nA sua idade é " + idade + " anos");
		


	}

}
