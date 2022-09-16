
public class Conta {
	private double saldo;
	private String numero, nome;
	
	public Conta(double saldo, String numero) {
		this.saldo = saldo;
		this.numero = numero;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public void depositar(double valor) {
		saldo += valor;
		System.out.println("Operação concluída. Seu novo saldo é: " + saldo);
	}
	
	public void sacar(double valor) {
		if(valor > saldo)
			System.out.println("Você não tem saldo suficiente.");
		else {	
			saldo -= valor;
			System.out.println("Operação concluída. Seu novo saldo é: " + saldo);
		}
	}
	 
	public void Conta(String nome) {
		this.nome = nome;
		System.out.println("Nome da conta setado para: " + this.nome);
	}

	@Override
	public String toString() {
		return "Conta [saldo=" + saldo + "]";
	}
	
	
	
}
