package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExemploArrayList {

	public static void main(String[] args) {
		// Criando a collection
		List<Double> notas = new ArrayList<Double>();
		Scanner read = new Scanner(System.in);
		Double numero;
		
		/**
		 * Adiciona algumas Notas. 
		 * Observe que a primeira nota é o Objeto Wrapper Double.
		 */
		notas.add(7.0);
		notas.add(5.0);
		notas.add(4.0);
		notas.add(10.0);
		notas.add(4.0);
		
		
		/**
		 * Mostra na tela todas as notas adicionadas. 
		 * Observe que a nota duplicada foi adicionada duas vezes.
		 */
		System.out.println("\nNotas cadastradas: " + notas);
		
		/**
		 * Mostra a posição (indice) de uma determinada nota. 
		 * Caso existam 2 notas iguais será exibida a posição da primeira nota encontrada.
		 */
		
		System.out.println("Digite o numero que vc quer procurar: ");
		numero = read.nextDouble();
		
		System.out.println("\nA posição da nota é: " + notas.indexOf(numero));
		
		
		read.close();
		
	}

}
