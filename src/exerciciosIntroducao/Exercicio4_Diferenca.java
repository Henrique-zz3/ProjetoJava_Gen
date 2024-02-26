package exerciciosIntroducao;

import java.util.Scanner;

public class Exercicio4_Diferenca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float n1, n2, n3, n4, diferenca;
		
		Scanner write = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		n1 = write.nextFloat();
		
		System.out.print("Digite o segundo número: ");
		n2 = write.nextFloat();
		
		System.out.print("Digite o terceiro número: ");
		n3 = write.nextFloat();
		
		System.out.print("Digite o quarto número: ");
		n4 = write.nextFloat();
		
		write.close();
		
		diferenca = (n1 * n2) - (n3 * n4);
		
		System.out.print("A diferença do produto entre o n1 e n2 pelo produto entre o n3 e o n4 é: " + diferenca);
		
	}

}
