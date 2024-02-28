package exerciciosLacosCond;

import java.util.Scanner;

public class ex4Lacos_Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String palavra;
		String vertebrado = "vertebrados";
		String invertebrado = "invertebrados";
		String ave = "ave";
		String mamifero = "mamifero";
		String inseto = "inseto";
		String anelideo = "anelideo";
		String carnivoro = "carnivoro";
		String onivoro = "onivoro";
		String herbivoro = "herbivoro";
		String hematofago = "hematofago";
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("------Para evitar erros evite asentos------");
		System.out.println("Escolha entre:\nVertebrados ou Invertebrados");
		palavra = read.nextLine();
		
		if (vertebrado.equals(palavra)) {
			System.out.println("Escolha entre:\nAve ou Mamífero");
			palavra = read.nextLine();
			if (ave.equals(palavra)) {
				System.out.println("\nEscolha entre:\nCarnivoro ou Onívoro");
				palavra = read.nextLine();
				if (carnivoro.equals(palavra)) {
					System.out.println("\nÁguia");
				}else if (onivoro.equals(palavra)) {
					System.out.println("\nPomba");
				}else {
					System.out.println("Opção inválida");
				}
			}else if(mamifero.equals(palavra)) {
				System.out.println("\nEscolha entre:\nHerbivoro ou Onívoro");
				palavra = read.nextLine();
				if (herbivoro.equals(palavra)) {
					System.out.println("\nVaca");
				}else if (onivoro.equals(palavra)) {
					System.out.println("\nHomem");
				}else {
					System.out.println("Opção inválida");
				}
			}else {
				System.out.println("Opção inválida");
			}
		}else if(invertebrado.equals(palavra)) {
			System.out.println("\nEscolha entre:\nInseto ou Anelídeo");
			palavra = read.nextLine();
			if (inseto.equals(palavra)) {
				System.out.println("\nEscolha entre:\nHematófago ou Herbivoro");
				palavra = read.nextLine();
				if (hematofago.equals(palavra)) {
					System.out.println("\nPulga");
				}else if (herbivoro.equals(palavra)) {
					System.out.println("\nLagarta");
				}else {
					System.out.println("Opção inválida");
				}
			}else if(anelideo.equals(palavra)) {
				System.out.println("\nEscolha entre:\nHematófago ou Onívoro");
				palavra = read.nextLine();
				if (hematofago.equals(palavra)) {
					System.out.println("\nSanguessuga");
				}else if (onivoro.equals(palavra)) {
					System.out.println("\nMinhoca");
				}else {
					System.out.println("Opção inválida");
				}
			}else {
				System.out.println("Opção inválida");
			}
		
		}else {
			System.out.println("Opção inválida");
		}
			
		read.close();
		
	}

}
