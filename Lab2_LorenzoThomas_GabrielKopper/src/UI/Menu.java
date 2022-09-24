package UI;

import java.util.Scanner;

import UI.Opcoes.Opcoes;

public interface Menu {
    public static void menu() {
        for (int i = 0; i < Opcoes.values().length; i++) {
            System.out.println(i + ". " + Opcoes.values()[i]);
        }
        String opcao;
        do {
            opcao = prompt("Qual a opção deseja?");
        } while ();

    }

    abstract void executa();

    public static String prompt(String pergunta) {
        System.out.println(pergunta);
        try (Scanner sc = new Scanner(System.in)) {
            return sc.next();
        }
    }
}
