package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ex1ListArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> cores = new ArrayList<String>();
		Scanner read = new Scanner(System.in);
		
		for(int i = 0; i<5; i++) {
			System.out.println("Digite uma cor:");
			cores.add(read.nextLine());
		}

		Iterator<String>iterator = cores.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		cores.sort(null);
		
		//iterator = cores.iterator();
		
		System.out.println("Cores: ");
		
		iterator = cores.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		read.close();
		
	}

}
