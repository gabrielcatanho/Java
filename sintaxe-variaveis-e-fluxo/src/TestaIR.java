
public class TestaIR {
	
	public static void main(String[] args) {
		
		double salario = 3300.0;
		
		if (salario >= 1900.0 && salario <= 2800.0) {
			salario -= 142;
		} else if (salario >= 2800.01 && salario <= 3751.0) {
			salario -= 350;
		} else if (salario >= 3751.01 && salario <= 4664.0) {
			salario -= 636;			
		}
		System.out.println("Salario com desconto de IR: " + salario);
	}
}
