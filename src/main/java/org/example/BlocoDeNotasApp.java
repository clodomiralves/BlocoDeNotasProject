package org.example;

import javax.swing.*;
import java.util.Scanner;

public class BlocoDeNotasApp {
    public static void main(String[] args) {
        BlocoDeNotas aplicacao = new BlocoDeNotas();
        Scanner sc = new Scanner(System.in);
        String opcao = "";
        do {
            System.out.println("""
            Digite a opção que você deseja utilizar:
            1.Criar Anotação: 
            2.Editar Anotação:
            3.Apresentar Anotações
            4.Remover Anotações
            5.Sair""");
            opcao = sc.nextLine();
            switch (opcao) {
                case "1":
                    System.out.println("Digite sua anotação: ");
                    String nota = sc.nextLine();
                    Anotacoes novaAnotacao = new Anotacoes(nota, aplicacao.getArrayAnotacoes().size()+1);
                    aplicacao.adicionaAnotacao(novaAnotacao);
                    break;
                case "2":
                    System.out.println("Digite o id da anotação que você deseja editar: ");
                    int editaId = Integer.parseInt(sc.nextLine());
                    Anotacoes editaAnotacao = aplicacao.getAnotacoes(editaId);
                    System.out.println(editaAnotacao.toString());
                    System.out.println("Digite seu novo texto editado: ");
                    String novoTexto = sc.nextLine();
                    aplicacao.editaAnotacao(editaId, novoTexto);
                    break;
                case "3":
                    System.out.println(aplicacao.apresentaAnotacao());
                    break;
                case "4":
                    System.out.println("Digite o id da anotação que você deseja remover: ");
                    int removeId = Integer.parseInt(sc.nextLine());
                    aplicacao.removeAnotacao(removeId);
                    System.out.println("Sua anotação foi removida com sucesso!!");
                    break;
                case "5":
                    break;
                default:
                    System.out.println("Opcão inválida, digite novamente!!");
            }
        }while (!opcao.equals("5"));
    }
}
