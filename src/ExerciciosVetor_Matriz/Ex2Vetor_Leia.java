package ExerciciosVetor_Matriz;

import java.util.Scanner;

public class Ex2Vetor_Leia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float n1[] = new float [10];
		int i;
		float soma = 0;
		float media;
		
		Scanner read = new Scanner(System.in);
		
		for(i = 0; i<10; i++) {
		
		System.out.println("Digite o "+ (i+1) + " número");
		n1[i] = read.nextInt();
		
		soma += n1[i];
		
		}
		
		media = soma/10;
		
		System.out.println("Elementos nos índices ímpares:");
		for(i = 1; i < 10; i++) {

			System.out.println(n1[i]);
			i++;
		}
		
		System.out.println("Elementos nos índices pares:");
		for(i = 0; i < 10; i++) {

			System.out.println(n1[i]);
			i++;
		}
		
		System.out.println("Soma: " + soma);
		System.out.printf("Média: " + media);
		
		read.close();
		
	}

}
