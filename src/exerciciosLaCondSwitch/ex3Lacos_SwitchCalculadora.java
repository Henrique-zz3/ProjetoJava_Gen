package exerciciosLaCondSwitch;

import java.util.Scanner;

public class ex3Lacos_SwitchCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cod;
		float n1, n2, result;
		
		Scanner read = new Scanner (System.in);
		
		System.out.println("Escolha qual operação\n[1] Soma		[2] Subtração\n[3] Multplicação	[4]Divisao");
		cod = read.nextInt();
		
		System.out.println("Digite o valor do primeiro número");
		n1 = read.nextFloat();
		
		System.out.println("Digite o valor do segundo número");
		n2 = read.nextFloat();
		
		switch(cod) {
		case 1:
			result = n1 + n2;
			System.out.printf("%.2f + %.2f = %.2f ", n1, n2, result );
			System.out.printf("O resultado da soma é %.2f", result );
			break;
		case 2:
			result = n1 - n2;
			System.out.printf("%.2f - %.2f = %.2f ", n1, n2, result );
			System.out.printf("O resultado da subtração é %.2f", result );
			break;
		case 3:
			result = n1 * n2;
			System.out.printf("%.2f * %.2f = %.2f ", n1, n2, result );
			System.out.printf("\nO resultado da multiplicação é %.2f", result );
			break;
		case 4:
			result = n1 / n2;
			System.out.printf("%.2f / %.2f = %.2f ", n1, n2, result );
			System.out.printf("O resultado da divisão é %.2f", result );
			break;
			
		default:
			System.out.println("Opção inválida!");
			break;
		}
		
		read.close();
		
	}

}
