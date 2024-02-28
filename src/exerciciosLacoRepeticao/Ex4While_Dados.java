package exerciciosLacoRepeticao;

import java.util.Scanner;

public class Ex4While_Dados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade,genero,dev,somaIdade = 0,hMobile=0,mFront=0,nbFull=0;
		int i = 0;
		
		int back=0;
		int front=0;
		int mobile=0;
		int full=0;
		
		int mc=0;
		int hc=0;
		int nb=0;				
		int mt=0;
		int ht=0;
		int outros=0;
		
		String add="s";
		
		Scanner read = new Scanner(System.in);

		while(!add.equals("N")) {
			
			System.out.println("Digite a idade:");
			idade = read.nextInt();
			
			somaIdade += idade;
			
			System.out.println("Digite o número refente ao gênero:\n1 - Mulher Cis\n2 - Homem Cis\n3 - Não Binário\n4 - Mulher Trans\n5 - Homem Trans\n6 - Outros");
			genero = read.nextInt();
			
			switch(genero) {
			case 1:

				mc++;
				mFront++;
				
				break;
				
			case 2:

				hc++;
				if(idade>40) {
					hMobile++;
				}			
				
				break;		
			
			case 3:

				nb++;
				if(idade<30) {
					nbFull++;
				}
				
				break;
				
			case 4:

				mt++;
				mFront++;
				
				break;
	
			case 5:

				ht++;
				if(idade>40) {
					hMobile++;
				}
				
				break;
	
			case 6:

				outros++;
				
				break;
				
			default:
				System.out.println("Opção inválida!");
				
				break;
				
			}
				
			System.out.println("Digite o número refente ao setor de dev:\n1 - Backend\n2 - Frontend\n3 - Mobile\n4 - FullStack");
			dev = read.nextInt();
			
			switch(dev) {
			case 1:

				back++;
				
				break;
				
			case 2:
				
				front++;
				
				break;		
			
			case 3:
				
				mobile++;
				
				break;
				
			case 4:
				
				full++;
				
				break;
				
			default:
				System.out.println("Opção inválida!");
				
				break;
				
			}
			
			
			i++;
			
			System.out.println("Deseja continuar a leitura de dados? (S/N)");
			read.skip("\\R");
			add = read.nextLine();

			
		}
	
		int media;
		media = somaIdade / i;
		
		System.out.println("O número de pessoas desenvolvedoras Backend:" + back);
		System.out.println("O número de mulheres csi e trans desenvolvedoras Frontend:" + mFront);
		System.out.println("O número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos:" + hMobile);
		System.out.println("O número de Não Binários desenvolvedores FullStack menores de 30 anos:" + nbFull);
		System.out.println("O número total de pessoas que responderam à pesquisa:" + i);
		System.out.println("A média de idade das pessoas que responderam à pesquisa:" + media);
		
		read.close();
		
	}

}

