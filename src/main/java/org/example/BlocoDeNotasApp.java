package org.example;

import javax.swing.*;

public class BlocoDeNotasApp {
    public static void main(String[] args) {
        BlocoDeNotas aplicacao = new BlocoDeNotas();
        String opcao = "0";
        do {
            opcao = JOptionPane.showInputDialog("""
                    1. Deseja criar uma anotação.
                    2. Deseja editar uma anotação.
                    3. Deseja remover uma anotação.
                    4. Deseja apresentar as anotações.
                    5. Sair do bloco de notas.""");

            switch (opcao) {
                case "1":
                    String anota = JOptionPane.showInputDialog("Digite sua anotação: ");
                    Anotacoes anotacao = new Anotacoes();
                    anotacao.setTexto(anota);
                    anotacao.setId(anotacao.getId());

                    aplicacao.adicionaAnotacao(anotacao);
                    break;
                case "4":
                    aplicacao.apresentaAnotacao( );

            }
        }while (!opcao.equals("5"));
    }
}
