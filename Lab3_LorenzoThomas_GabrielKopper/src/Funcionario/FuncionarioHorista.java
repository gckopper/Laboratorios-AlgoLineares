package Funcionario;

public class FuncionarioHorista extends Funcionario {
	private int horasTrabalhadas;
	private double salarioHora;

	public FuncionarioHorista(String nome, String cpf, int horasTrabalhadas, double salarioHora) {
		super(nome, cpf);
		this.horasTrabalhadas = horasTrabalhadas;
		this.salarioHora = salarioHora;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getRendimento() {
		if (horasTrabalhadas <= 40)
			return horasTrabalhadas * salarioHora;
		else
			return (horasTrabalhadas * 40) + ((horasTrabalhadas - 40) * 1.5);
	}

}