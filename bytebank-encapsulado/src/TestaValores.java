
public class TestaValores {
	
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		
		Conta conta2 = new Conta(4554, 67986);
		Conta conta3 = new Conta(2345, 65764);
		
		System.out.println(Conta.getTotal());
	}
}
