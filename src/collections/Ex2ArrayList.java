package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex2ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero;
		List<Integer> num1 = new ArrayList<Integer>();
		Scanner read = new Scanner(System.in);
		
		num1.add(2);
		num1.add(5);
		num1.add(1);
		num1.add(3);
		num1.add(4);
		num1.add(9);
		num1.add(7);
		num1.add(8);
		num1.add(10);
		num1.add(6);
		
		System.out.println("Digite o numero que vc quer procurar: ");
		numero = read.nextInt();
		
		// Mostra se uma determinada nota existe na lista
		if(num1.contains(numero)) {
			System.out.println("O numero"+ numero +" está localizado na posição "+ num1.indexOf(numero));
		}else {
			System.out.println("O numero"+ numero +" não foi encontrado");
		}
		
		read.close();
		
	}

}
