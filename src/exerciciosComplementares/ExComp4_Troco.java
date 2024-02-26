package exerciciosComplementares;

import java.util.Scanner;

public class ExComp4_Troco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int valor, nota100, nota50, nota20, nota10, nota5, nota2, nota1;
		
		Scanner read = new Scanner(System.in);
		
		System.out.print("Digite o valor: ");
		valor = read.nextInt();
		
		nota100 = valor/100;
		valor %= 100;
		
		nota50 = valor/50;
		valor %= 50;
		
		nota20 = valor/20;
		valor %= 20;
		
		nota10 = valor/10;
		valor %= 10;
		
		nota5 = valor/5;
		valor %= 5;
		
		nota2 = valor/2;
		valor %= 2;
		
		nota1 = valor/1;
		valor %= 1;
		
		System.out.printf("%d nota(s) de R$ 100,00\n", nota100);
		
		System.out.printf("%d nota(s) de R$ 50,00\n", nota50);
		
		System.out.printf("%d nota(s) de R$ 20,00\n", nota20);
		
		System.out.printf("%d nota(s) de R$ 10,00\n", nota10);
		
		System.out.printf("%d nota(s) de R$ 5,00\n", nota5);
		
		System.out.printf("%d nota(s) de R$ 2,00\n", nota2);
		
		System.out.printf("%d nota(s) de R$ 1,00\n", nota1);
		
		read.close();
		
	}

}
