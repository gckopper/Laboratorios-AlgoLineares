package Funcionario;

public class FuncionarioComissionado extends Funcionario {
	private double taxaCommissao, vendasBrutas;

	public FuncionarioComissionado(String nome, String cpf, double taxaCommissao, double vendasBrutas) {
		super(nome, cpf);
		this.taxaCommissao = taxaCommissao;
		this.vendasBrutas = vendasBrutas;
	}

	public double getTaxaCommissao() {
		return taxaCommissao;
	}

	public void setTaxaCommissao(double taxaCommissao) {
		this.taxaCommissao = taxaCommissao;
	}

	public double getVendasBrutas() {
		return vendasBrutas;
	}

	public void setVendasBrutas(double vendasBrutas) {
		this.vendasBrutas = vendasBrutas;
	}

	public double getRendimento() {
		return taxaCommissao * vendasBrutas;
	}
}