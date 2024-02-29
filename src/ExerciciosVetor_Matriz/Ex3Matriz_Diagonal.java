package ExerciciosVetor_Matriz;

import java.util.Scanner;

public class Ex3Matriz_Diagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1[][] = new int [3][3];
		int i,j;
		float somaDP = 0, somaDS = 0;
		
		Scanner read = new Scanner(System.in);
		
		for (i = 0; i < 3; i++) {
			for ( j= 0; j < 3; j++) {
				System.out.println("Digite um número para a posição [" + i +"][" + j + "]"  );
				n1[i][j] = read.nextInt();
			}
		}
		
		System.out.println("Elementos na diagonal Principal");
		
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				if(i == j) {
					System.out.println("Números [" + i +"][" + j + "]" + n1[i][j] );
					somaDP += n1[i][j];
 				}
			}
		}
		
		System.out.println("Elementos na diagonal secundaria");
	
		for (i = 0; i < 3; i++) {
			for (j = 2; j >= 0; j--) {
				
					System.out.println("Números [" + i +"][" + j + "]" + n1[i][j] );
					somaDS += n1[i][j];
					i++;
			}
		}
		
		System.out.println("Soma dos Elementos da Diagonal Principal: " + somaDP);
		System.out.println("Soma dos Elementos da Diagonal Secundaria: " + somaDS);
		
		read.close();
		
	}
	
	}
