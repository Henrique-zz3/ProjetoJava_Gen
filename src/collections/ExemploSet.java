package collections;

import java.util.HashSet;
import java.util.Set;

public class ExemploSet {

	public static void main(String[] args) {
		// Criando a collection set
		Set<String> setFrutas = new HashSet<String>();

		// Adiciona algumas frutas na Colection Set
		setFrutas.add("Abacate");
		setFrutas.add("Banana");
		setFrutas.add("Jaboticaba");
		setFrutas.add("Kiwi");
		setFrutas.add("Maçã");
		setFrutas.add("Morango");
		setFrutas.add("Pêra");
		setFrutas.add("Jaboticaba");
		setFrutas.add("Kiwi");

		/**
		 * Mostra os dados armazenados na Collection Set Observe que as frutas repetidas
		 * foram inseridos apenas uma vez
		 */
		System.out.println("\nDados da Collection: " + setFrutas);

		// Verifica se um elemento está armazenado na Collection Set
		System.out.println("\nExiste a fruta Kiwi? " + setFrutas.contains("Kiwi"));
		
		// for each
		for (String fruta : setFrutas) {
			if (fruta != null)
				System.out.println("O Hashcode do Elemento " + fruta + " é " + fruta.hashCode());
		}

	}

}
