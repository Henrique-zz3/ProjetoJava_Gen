package ExemploMetodos;

public class Exemplo1Metodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int resultado;
        
        resultado = soma(5, 2);
     
        mensagem();
        
        System.out.println("O Resultado da soma é: " + resultado);
    }
    
    public static int soma(int numero1, int numero2) {
		return numero1 + numero2;
	}
    
    public static void mensagem() {
		System.out.println("Método sem retorno (void)!");
	}
		
	

}
