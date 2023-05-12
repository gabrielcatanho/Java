
public class TestaCondicional {
	
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 16;
		int quantidadePessoas = 2;
		
		if(idade >= 18) {
			System.out.println("Seja bem-vindo");
		} else if (quantidadePessoas >= 2) {
			System.out.println("Você não é maior de 18 anos, mas está acompanhado, então pode entrar.");
		} else {
			System.out.println("Você não tem permissão para entrar.");
		}
	}
}
