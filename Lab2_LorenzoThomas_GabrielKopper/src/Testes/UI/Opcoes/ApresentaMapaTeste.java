package Testes.UI.Opcoes;

import Cinema.Mapa;
import UI.Opcoes.ApresentaMapa;

public class ApresentaMapaTeste {
    public static void main(String[] args) {
        Mapa mapa = new Mapa();
        for (int i = 0; i < mapa.getAssentos().length; i++) {
            for (int j = 0; j < mapa.getAssentos()[i].length; j++) {
                if (j % 3 == 0)
                    mapa.getAssentos()[i][j].setOcupado(true);
            }
        }
        ApresentaMapa.apresentaMapa(mapa);
    }
}
