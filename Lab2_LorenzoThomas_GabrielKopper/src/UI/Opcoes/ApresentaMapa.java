package UI.Opcoes;

import Cinema.Assento;
import Cinema.Mapa;
import UI.Menu;

public interface ApresentaMapa extends Menu {
    public static final char ASSENTO_LIVRE = 'L';
    public static final char ASSENTO_OCUPADO = 'X';

    public static void apresentaMapa(Mapa mapa) {
        for (Assento[] assentosColuna : mapa.getAssentos()) {
            for (int i = 0; i < assentosColuna.length; i++) {
                if (i == Mapa.FILEIRAS / 2)
                    System.out.print(" ");
                System.out.print("|");
                System.out.print(assentosColuna[i].isOcupado() ? ApresentaMapa.ASSENTO_OCUPADO : ApresentaMapa.ASSENTO_LIVRE);
                System.out.print("|");
            }
            System.out.println();
        }
    }
}
