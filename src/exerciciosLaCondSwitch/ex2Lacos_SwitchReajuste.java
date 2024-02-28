package exerciciosLaCondSwitch;

import java.util.Scanner;

public class ex2Lacos_SwitchReajuste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome;
		int codCargo;
		double r, newSalary;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite seu nome");
		nome = read.nextLine();
		
		System.out.println("Escolha o número referente ao cargo\n\n[1]   Gerente\n[2]   Vendedor\n[3]   Supervisor\n[4]   Motorista\n[5]   Estoquista\n[6]   Técnico de TI\n");
		codCargo = read.nextInt();
		
		System.out.println("Qual o salário?");
		r = read.nextDouble();
		
		switch(codCargo) {
		
		case 1:
			newSalary = 1.10 * r;
			System.out.printf("\nNome: %s\nCargo: Gerente\nNovo salário: R$ %.2f",nome, newSalary);
			break;
			
		case 2:
			newSalary = 1.07*r;
			System.out.printf("\nNome: %s\nCargo: Vendedor\nNovo salário: R$ %.2f",nome, newSalary);
			break;
			
		case 3:
			newSalary = 1.09*r;
			System.out.printf("\nNome: %s\nCargo: Supervisor\nNovo salário: R$ %.2f",nome, newSalary);
			break;
			
		case 4:
			newSalary = 1.06*r;
			System.out.printf("\nNome: %s\nCargo: Motorista\nNovo salário: R$ %.2f",nome, newSalary);
			break;
			
		case 5:
			newSalary = 1.05*r;
			System.out.printf("\nNome: %s\nCargo: Estoquista\nNovo salário: R$ %.2f",nome, newSalary);
			break;
			
		case 6:
			newSalary = 1.08*r;
			System.out.printf("\nNome: %s\nCargo: Técnico de TI\nNovo salário: R$ %.2f",nome, newSalary);
			break;
		
		default:
			System.out.println("Opção inválida!");
		}
		
		read.close();
			
	}

}