package exerciciosLaCondSwitch;

import java.util.Scanner;

public class ex1Lacos_SwitchMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int codProd, quantidade, valorTotal;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Escolha o número referente ao produto\n\n[1]   Cachorro Quente   R$ 10,00\n[2]   X-Salada   R$ 15,00\n[3]   X-Bacon   R$ 18,00\n[4]   Bauru   R$ 12,00\n[5]   Refrigerante   R$ 8,00\n[6]   Suco de Laranja   R$ 13,00");
		codProd = read.nextInt();
		
		System.out.println("Quantos você quer?");
		quantidade = read.nextInt();
		
		switch(codProd) {
		
		case 1:
			valorTotal = 10*quantidade;
			System.out.printf("Cachorro Quente\nValor total: R$ %d,00", valorTotal);
			break;
			
		case 2:
			valorTotal = 15*quantidade;
			System.out.printf("X-Salada\nValor total: R$ %d,00", valorTotal);
			break;
			
		case 3:
			valorTotal = 18*quantidade;
			System.out.printf("X-Bacon\nValor total: R$ %d,00", valorTotal);
			break;
			
		case 4:
			valorTotal = 12*quantidade;
			System.out.printf("Bauru\nValor total: R$ %d,00", valorTotal);
			break;
			
		case 5:
			valorTotal = 8*quantidade;
			System.out.printf("Refrigerante\nValor total: R$ %d,00", valorTotal);
			break;
			
		case 6:
			valorTotal = 13*quantidade;
			System.out.printf("Suco de laranja\nValor total: R$ %d,00", valorTotal);
			break;
		
		default:
			System.out.println("Opção inválida!");
		}
		
		read.close();
		
	}

}
