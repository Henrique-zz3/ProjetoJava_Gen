package exerciciosLacoRepeticao;

import java.util.Scanner;

public class Ex3While_Idade {

	public static void main(String[] args) {

		int idade=1, menores=0, maiores=0;
		
		Scanner read = new Scanner(System.in);
		
		while(idade>=0) {
			
			System.out.println("Digite uma idade: ");
			idade = read.nextInt();
				if(idade < 21 && idade >= 0) {
					menores++;
				}else if(idade > 50) {
					maiores++;
				}
		}
		
		System.out.println("Total de pessoas menores de 21 anos: " + menores);
		System.out.println("Total de pessoas maiores de 50 anos: " + maiores);
		
		read.close();
		
	}

}
