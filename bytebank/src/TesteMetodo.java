
public class TesteMetodo {
	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		boolean conseguiuRetirar = contaDoPaulo.saca(200);
		
		System.out.println(contaDoPaulo.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.saldo = 1000;
		
		contaDaMarcela.transfere(300, contaDoPaulo);
		System.out.println(contaDoPaulo.saldo);
		System.out.println(contaDaMarcela.saldo);
		
	}
}
