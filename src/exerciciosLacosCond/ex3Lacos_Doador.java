package exerciciosLacosCond;

import java.util.Scanner;

public class ex3Lacos_Doador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade;
		String nome;
		boolean doador;
		
		Scanner read = new Scanner(System.in);
		
		System.out.print("Digite o Nome do doador\n");
		nome = read.nextLine();
		
		System.out.print("Digite o idade do doador\n");
		idade = read.nextInt();
		
		System.out.print("Primerira doação de sangue? (true/false)\n");
		doador = read.hasNext();
		
		if(idade >= 18 && idade <= 69) {
			if(idade >=60 && doador != false) {
				System.out.printf(nome + " não está apto para doar sangue!");
		
			}else{
				System.out.printf(nome + " está apto para doar sangue!");
				
			}

		}else {
			System.out.printf(nome + " não está apto para doar sangue!");

		}
		
		read.close();
		
	}

}
