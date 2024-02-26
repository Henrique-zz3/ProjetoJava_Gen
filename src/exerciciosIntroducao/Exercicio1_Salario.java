package exerciciosIntroducao;

import java.util.Scanner;

public class Exercicio1_Salario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float salario;
		float abono;
		float novoSalario;
		
		Scanner write = new Scanner(System.in);
		
		System.out.print("Digite o salário:  ");
		salario = write.nextFloat();
		
		System.out.print("Digite o abono:  ");
		abono = write.nextFloat();
		
		write.close();
		
		novoSalario = salario + abono;
		
		System.out.println("Novo salário é " + novoSalario);		
		
	}

}
