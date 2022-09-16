package UI;
import Cinema.Assento;
public class Opcoes {
	
	public void reservar(Assento assento) {
		assento.setOcupado(true);
	}
	
	public void cancelar(Assento assento) {
		assento.setOcupado(false);
	}
	
}
