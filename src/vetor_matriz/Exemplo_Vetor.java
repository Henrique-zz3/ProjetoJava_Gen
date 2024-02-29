package vetor_matriz;

import java.util.Scanner;

public class Exemplo_Vetor {

	public static void main(String[] args) {
		//vetor
		String cachorro[] = new String[3];
		// int numeros[] = new int[5];
		
		Scanner read = new Scanner(System.in);
		int indice;
		
		// 0["Laika"] - 1["Sandy"] - 2["Spike"]
		
		
		//Guarda os nomes
		for(indice = 0; indice < 3; indice++) {
			
			//sysout e pressionar CTRL + Espaço
			System.out.println("Digite o " + (indice+1) + " nome:");
			cachorro[indice] = read.nextLine();
			
		}
		
		//cachorros.lenght = 3
		
		//Lista os nomes
		for(indice = 0; indice < cachorro.length; indice++) {
			
			//acessar vetor
			System.out.println(cachorro[indice]);
			
		}
		
		read.close();

		
	}

}
