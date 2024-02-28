package exerciciosLacoRepeticao;

import java.util.Scanner;

public class Ex1For_Intervalo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float n1, n2, i;

		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número do intervalo");
		n1 = read.nextFloat();

		System.out.println("Digite o segundo número do intervalo");
		n2 = read.nextFloat();
		
		
		read.close();
		
		
		if(n1 < n2) {
			for(i=n1;i<=n2;i++) {
				if(i % 3 == 0 && i % 5 ==0 ) {
					System.out.println(i);
				}
			}
		}else {
			System.out.println("Opção inválida");
		}
		

		
	}

}
