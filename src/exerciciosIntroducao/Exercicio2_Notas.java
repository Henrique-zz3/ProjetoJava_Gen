package exerciciosIntroducao;

import java.util.Scanner;

public class Exercicio2_Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float nota1, nota2, nota3, nota4;
		float media;
		
		Scanner write = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		nota1 = write.nextFloat();
		
		System.out.print("Digite a segunda nota: ");
		nota2 = write.nextFloat();
		
		System.out.print("Digite a terceira nota: ");
		nota3 = write.nextFloat();
		
		System.out.print("Digite a quarta nota: ");
		nota4 = write.nextFloat();
		
		write.close();
		
		media = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.print("A média é: " + media);
		
	}

}
