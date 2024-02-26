package exerciciosIntroducao;

import java.util.Scanner;

public class Exercicio3_SalarioLiquido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float salBruto, adNoc, hrExtras, descontos, salLiquido;
		
		Scanner write = new Scanner(System.in);
		
		System.out.print("Digite o salário bruto: ");
		salBruto = write.nextFloat();
		
		System.out.print("Digite o valor do adicional noturno: ");
		adNoc = write.nextFloat();
		
		System.out.print("Digite as horas extras: ");
		hrExtras = write.nextFloat();
		
		System.out.print("Digite os descontos: ");
		descontos = write.nextFloat();
		
		write.close();
		
		salLiquido = salBruto + adNoc + (hrExtras * 5) - descontos;
		
		System.out.print("O salario liquido é de: " + salLiquido);
		
	}

}
