package org.example;

import java.util.ArrayList;

public class BlocoDeNotas {
    ArrayList<Anotacoes> arrayAnotacoes = new ArrayList<>();
    ArrayList<Anotacoes> arrayRemovidos = new ArrayList<>();

    public void adicionaAnotacao(Anotacoes anotacao){
        arrayAnotacoes.add(anotacao);
    }

}
