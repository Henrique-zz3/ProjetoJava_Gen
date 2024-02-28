package exerciciosLacoRepeticao;

import java.util.Scanner;

public class Ex5DoWhile_SomaPositivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float n, soma = 0;
		Scanner read = new Scanner(System.in);
		
		do {
			System.out.println("Digite um número");
			n = read.nextFloat();
			
			if(n>0) {
				soma += n;
			}
			
		}while(n != 0);
		
		System.out.printf("A soma dos números positivos é: %.0f", soma);
		
		read.close();
		
	}

}
