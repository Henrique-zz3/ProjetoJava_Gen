package exerciciosComplementares;

import java.util.Scanner;

public class exComp3_Formatado {

	public static void main(String[] args) {
	
		int segundos, minutos, horas;
		Scanner read = new Scanner(System.in);
		
		System.out.print("Digite o valor: ");
		segundos= read.nextInt();
		
		horas = segundos/3600;
		segundos %= 3600;
		
		minutos = segundos/60;
		segundos %= 60;
		
		System.out.printf("Valor formatado  %d:%d:%d" , horas, minutos, segundos);
		
		read.close();
		
	}
		
}
