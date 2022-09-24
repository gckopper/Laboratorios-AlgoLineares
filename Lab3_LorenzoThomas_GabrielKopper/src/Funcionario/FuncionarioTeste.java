package Funcionario;

public class FuncionarioTeste {

	public static void main(String[] args) {

		FuncionarioComissionadoBaseSalario fcbs = new FuncionarioComissionadoBaseSalario("Lorenzo", "1234567890", 100,
				40, 3000);
		FuncionarioComissionado fc = new FuncionarioComissionado("Gabriel", "40028922", 150, 61);
		FuncionarioHorista fh = new FuncionarioHorista("Guilherme", "1122334455", 60, 45);
		FuncionarioAssalariado fa = new FuncionarioAssalariado("Mateus", "9876543210", 900);

		System.out.println(fcbs.getRendimento());
		System.out.println(fc.getRendimento());
		System.out.println(fh.getRendimento());
		System.out.println(fa.getRendimento());
	}

}