
public class TestaCondicional {
	
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 16;
		int quantidadePessoas = 2;
		
		if(idade >= 18) {
			System.out.println("Seja bem-vindo");
		} else if (quantidadePessoas >= 2) {
			System.out.println("Voc� n�o � maior de 18 anos, mas est� acompanhado, ent�o pode entrar.");
		} else {
			System.out.println("Voc� n�o tem permiss�o para entrar.");
		}
	}
}
