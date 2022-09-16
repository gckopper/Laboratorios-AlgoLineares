package Cinema;

public class Assento {
	private int fileira, coluna;
	private String nome;
	private boolean ocupado;
	
	public Assento(int fileira, int coluna) {
		this.fileira = fileira;
		this.coluna = coluna;
	}

	public int getFileira() {
		return fileira;
	}

	public void setFileira(int fileira) {
		this.fileira = fileira;
	}

	public int getColuna() {
		return coluna;
	}

	public void setColuna(int coluna) {
		this.coluna = coluna;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}
	
	
	
}
