package exerciciosLacoRepeticao;

import java.util.Scanner;

public class Ex2For_ParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int par = 0, impar = 0, resto, n;

		Scanner read = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			
			System.out.println("Digite o "+ (i+1) +"º do intervalo");
			n = read.nextInt();
			resto = n % 2;
			
			if(resto == 0) {
				par++;
			}else {
				impar++;
			}
			
			
		}

		System.out.println("Total de número pares: " + par + "\nTotal de número impares:" + impar);
		read.close();
	}

}
