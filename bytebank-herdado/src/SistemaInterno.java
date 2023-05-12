
public class SistemaInterno {
	
	private int senha = 2222;

	public void autentica(Autenticavel fa) {
		boolean autenticou = fa.autentica(this.senha);
		if(autenticou) {
			System.out.println("Voce pode entrar no sistema!");
		} else {
			System.out.println("Voce nao pode entrar no sistema");
		}
	}
}