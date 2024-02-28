package exerciciosLacosCond;

import java.util.Scanner;

public class ex2Lacos_Verific {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float n, num;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite um número");
		n = read.nextFloat();
		
		num = n;
		
		if (n > 0) {
			
			n %= 2;
			
			if (n == 0) {
				System.out.printf("O número %.0f é par e positivo!", num);			
			}else {
				System.out.printf("O número %.0f é impar e positivo!", num);
			}
			
		}else {
			
			if (n == 0) {
				System.out.printf("O número %.0f é par e negativo!", num);			
			}else {
				System.out.printf("O número %.0f é impar e negativo!", num);
			}
			
		}
		
		
		read.close();
		
	}

}
