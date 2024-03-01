package ExerciciosVetor_Matriz;

import java.util.Scanner;

public class Ex4Matriz_Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float nota[][] = new float [10][4];
		float media[] = new float [10];
		int i,j;
		float soma[] = new float[10];
		
		Scanner read = new Scanner(System.in);
		
		for (i = 0; i < 10; i++) {
			for ( j= 0; j < 4; j++) {
				System.out.println("Aluno [" + i +"]  Nota[" + j + "]:  "  );
				nota[i][j] = read.nextFloat();
				soma[i] += nota[i][j];
			}
			
			media [i] = soma[i] / j;
			
		}
		
		
//		for (i = 0; i < 10; i++) {
//			for ( j= 0; j < 4; j++) {
//				System.out.println("Aluno: [" + (i+1) +"]  Nota:[" + (j+1) + "] " + nota[i][j] );
//			}
//			
//		}
		
		for(i = 0; i<10; i++) {
			System.out.printf("\nMedia aluno " + (i+1) +": %.2f", media[i]);
		}
		
	}

}
