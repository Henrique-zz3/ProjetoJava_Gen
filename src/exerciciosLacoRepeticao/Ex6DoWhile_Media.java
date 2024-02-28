package exerciciosLacoRepeticao;

import java.util.Scanner;

public class Ex6DoWhile_Media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		float n,resto, soma = 0, divisor = 0, media;
		Scanner read = new Scanner(System.in);
		
		do {
			System.out.println("Digite um número");
			n = read.nextFloat();
			resto = n % 3;
			
			if(resto == 0 && n!=0) {
				soma += n;
				divisor++;
				
			}
			
		}while(n != 0);
		
		media = soma/divisor;
		
		System.out.printf("A media de todos os números multiplos de 3 é: %.1f", media);
		
		read.close();
		
	}

}
