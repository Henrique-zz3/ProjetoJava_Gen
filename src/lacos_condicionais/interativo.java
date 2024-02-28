package lacos_condicionais;

import java.util.Scanner;

public class interativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner read = new Scanner(System.in);
		
		int x, y;
		
		System.out.println("Digite um valor para X");
		x = read.nextInt();
		
		System.out.println("Digite um valor para X");
		y = read.nextInt();
		
		if(x > y) {
			System.out.print("X maior que Y");
		}else if (x==y) {
			System.out.print("Não tem maior");
		}else {
			System.out.print("X menor que Y");
		}
		
		read.close();
		
	}

}
