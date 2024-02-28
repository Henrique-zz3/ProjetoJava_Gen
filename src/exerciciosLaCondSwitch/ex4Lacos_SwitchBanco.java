package exerciciosLaCondSwitch;

import java.util.Scanner;

public class ex4Lacos_SwitchBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cod;
		float saldo = 1000;
		float valor;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite qual operação deseja\n[1]Saldo\n[2]Saque\n[3]Depósito");
		cod = read.nextInt();		
		
		switch(cod){
		
		case 1:
			
			System.out.println("Saldo:" + saldo);
			
			break;
			
		case 2:
			
			System.out.println("Digite o valor para Saque");
			valor = read.nextFloat();
			saldo -= valor;
			
			if(saldo < 0) {
				System.out.println("Saldo insuficiente");
				saldo += valor;
			}else {
				System.out.println("Novo saldo:" + saldo);
			}
			
			
			break;
			
		case 3:
	
			System.out.println("Digite o valor para Depósito");
			valor = read.nextFloat();
			saldo += valor;
			System.out.println("Novo saldo:" + saldo);
			
			break;
		
		default:
			System.out.println("Opção inválida!");				
			break;
		}
		read.close();
	}

}
