
public class TestaCondicional2 {
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 16;
		int quantidadePessoas = 1;
		boolean acompanhado = quantidadePessoas >= 2;
		
		System.out.println("valor acompanhado = " + acompanhado);
		
		if(idade >= 18 || acompanhado) {
			System.out.println("Seja bem-vindo");
		} else {
			System.out.println("Voc� n�o tem permiss�o para entrar.");
		}
	}
}
