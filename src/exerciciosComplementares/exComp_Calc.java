package exerciciosComplementares;

import java.util.Scanner;

public class exComp_Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float n1, n2, soma, sub, div, mult;
		
		Scanner read = new Scanner (System.in);
		
		System.out.print("Digite o primeiro número: ");
		n1 = read.nextFloat();
		
		System.out.print("Digite o segundo número numero: ");
		n2 = read.nextFloat();
		
		soma = n1 + n2;
		sub = n1 - n2;
		div = n1 / n2;
		mult = n1 * n2;
		
		System.out.print("Soma = " + soma + "\nSubtração = " + sub + "\nDivisão = " + div + "\nMultiplicação = " + mult);
		
		read.close();
		
	}

}
