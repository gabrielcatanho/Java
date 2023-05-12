
public class CriaConta {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		System.out.println(primeiraConta);
		primeiraConta.saldo = 200;
		primeiraConta.saldo += 100;
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		System.out.println("a primeira conta tem " + primeiraConta.saldo);
		System.out.println("a segunda conta tem " + segundaConta.saldo);
		
		System.out.println(primeiraConta.titular);
	}
}
