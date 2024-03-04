package collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Iterator;

public class Ex3SetNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> numero = new HashSet<Integer>();
		Scanner read = new Scanner(System.in);
		
		for(int i = 0; i<10; i++) {
			System.out.println("Digite um numero");
			numero.add(read.nextInt());
				
		}
		
		Iterator<Integer> isetFrutas = numero.iterator();

		while (isetFrutas.hasNext()) {
			System.out.println(isetFrutas.next());
		}
		
		read.close();
	
	}

}
