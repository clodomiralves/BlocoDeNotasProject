package org.example;

import javax.swing.*;
import java.util.Scanner;

public class BlocoDeNotasApp {
    public static void main(String[] args) {
        BlocoDeNotas aplicacao = new BlocoDeNotas();
        Scanner sc = new Scanner(System.in);
        System.out.println("""
        Digite a opção que você deseja utilizar:
        1.Criar Anotação: 
        2.Editar Anotação:
        3.Apresentar Anotações
        4.Remover Anotações
        5.Sair""");
        String opcao = sc.next();
        do {
            switch (opcao) {
                case "1":
                    String anota =


                    break;

            }
        }while (!opcao.equals("5"));
    }
}
