package Cinema;

public class Mapa {
	public static final int COLUNAS = 12;
	public static final int FILEIRAS = 14;
	private Assento[][] assentos = new Assento[COLUNAS][FILEIRAS];

	public Mapa () {
		for (int i = 0; i < this.assentos.length; i++) {
            for (int j = 0; j < this.assentos[i].length; j++) {
                this.assentos[i][j] = new Assento();
            }
        }
	}

	/**
	 * @return the assentos
	 */
	public Assento[][] getAssentos() {
		return assentos;
	}

	/**
	 * @param assentos the assentos to set
	 */
	public void setAssentos(Assento[][] assentos) {
		this.assentos = assentos;
	}
	
}
