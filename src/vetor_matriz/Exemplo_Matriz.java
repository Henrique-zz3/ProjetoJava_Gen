package vetor_matriz;

public class Exemplo_Matriz {

	public static void main(String[] args) {
		// int[ LINHAS ] [ COLUNAS ] = {{10,15,35},
		//							   {70,120,140}, 
		//							   {50,100,150} };
		
		int numeros[][] = {{10,15,35},{70,120,140}, {50,100,150} };
		int linha, coluna;
		
		//Percorrer as linhas da Matrix
		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
				System.out.println("Números [" + linha +"][" + coluna + "]" + numeros[linha][coluna] );
			}
		}
		
	}

}
