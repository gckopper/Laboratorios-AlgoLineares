package Funcionario;

public class FuncionarioComissionadoBaseSalario extends FuncionarioComissionado {
	private double salarioBase;

	public FuncionarioComissionadoBaseSalario(String nome, String cpf, double taxaCommissao, double vendasBrutas,
			double salarioBase) {
		super(nome, cpf, taxaCommissao, vendasBrutas);
		this.salarioBase = salarioBase;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	@Override
	public double getRendimento() {
		return super.getRendimento() + salarioBase;
	}

}