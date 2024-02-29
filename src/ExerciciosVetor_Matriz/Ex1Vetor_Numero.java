package ExerciciosVetor_Matriz;

import java.util.Scanner;

public class Ex1Vetor_Numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1[] = {2,5,1,3,4,9,7,8,10,6};
		int i,n;
		
		boolean encontrado = false;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite o número que você deseja encontrar:");
		n = read.nextInt();
		
		for(i = 0; i<10; i++) {
			if(n == n1[i]) {
				System.out.println("O número " + n +" está localizado na posição: " + (i));
				encontrado = true;
			}
		}
		
		if(encontrado == false) {
			System.out.println("O número " + n +" não foi encontrado!");
		}
		
		read.close();
	}

}
