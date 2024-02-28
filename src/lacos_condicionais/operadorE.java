package lacos_condicionais;

import java.util.Scanner;

public class operadorE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int idade;
//		boolean carteiraM;
//		
//		Scanner read = new Scanner(System.in);
//		
//		System.out.println("Digite a sua idade: ");
//		idade = read.nextInt();
//		
//		System.out.println("Você tem carteira de habilitação? (true/false) ");
//		carteiraM = read.nextBoolean();
//		
//		if (idade > 18 && carteiraM == true) {
//			System.out.println("Pode dirigir!");
//		}else {
//			System.out.println("Não pode dirigir!");
//		}
//		
//		read.close();

		float nota1, nota2, media;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota");
		nota1 = read.nextFloat();
		
		System.out.println("Digite a segunda nota");
		nota2 = read.nextFloat();
		
		media = (nota1 + nota2)/2;
		
		if(media >= 6) {
			System.out.println("Parabéns, Aprovado!");
		}else if(media >= 5) {
			System.out.println("Está de exame!");
		}else {
			System.out.println("Reprovado!");
		}
		
		read.close();
		
	}

}
