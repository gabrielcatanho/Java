import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CalculadoraTeste {

	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();		
		System.out.println(calc.somar(1, 5));
		System.out.println(calc.dividir(10, 5));
	}
	
	@Test
	public void deveriaSomarDoisNumerosPositivos() {
        Calculadora calc = new Calculadora();
        int soma = calc.somar(3, 7);
        
        Assert.assertEquals(10, soma);
	}

}
