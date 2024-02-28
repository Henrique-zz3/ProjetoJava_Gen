package exerciciosLacosCond;

import java.util.Scanner;

public class ex1Lacos_Comparacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, c, soma;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite o valor de A");
		a = read.nextInt();		
		
		System.out.println("Digite o valor de B");
		b = read.nextInt();		
		
		System.out.println("Digite o valor de C");
		c = read.nextInt();		
		
		soma = a + b;
		
		if(soma > c ) {
			System.out.println("A Soma de A + B é Maior do que C");
		}else if(soma == c) {
			System.out.println("A Soma de A + B é igual do que C");
		}else {
			System.out.println("A Soma de A + B é menor do que C");	
		}
		
		read.close();
		
	}

}
