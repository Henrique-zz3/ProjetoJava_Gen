package exerciciosComplementares;
import java.util.Scanner;


public class exComp2_AreaCirc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double pi = 3.14159;
		double area, raio;
		
		Scanner read = new Scanner(System.in);
		
		System.out.print("Digite o valor do raio do circulo: ");
		raio = read.nextDouble();
		
		area = pi * (raio*raio);
		
		System.out.printf("O valor da área é: %.4f", area );
		
		read.close();
		
	}

}
