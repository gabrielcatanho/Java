package br.com.alura.java.io.teste;

public class Arcobaleno {
	
	public static void main(String[] args) throws Exception {
		
		try {			
			int divisao = 12/6;			
		} catch (ArithmeticException ex) {
			System.out.println(ex + " Não é possível dividir por 0!");
		}
		
		
		
	}
}
