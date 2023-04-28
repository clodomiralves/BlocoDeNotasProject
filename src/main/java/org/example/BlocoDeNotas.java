package org.example;

import java.util.ArrayList;

public class BlocoDeNotas {
    private ArrayList<Anotacoes> arrayAnotacoes = new ArrayList<>();
    private ArrayList<Anotacoes> arrayRemovidos = new ArrayList<>();


    public ArrayList<Anotacoes> getArrayAnotacoes(){
        return this.arrayAnotacoes;
    }
    public void adicionaAnotacao(Anotacoes anotacao){
        arrayAnotacoes.add(anotacao);
    }
    public Anotacoes getAnotacoes(int id){
        return arrayAnotacoes.get(id-1);


    }
    public void editaAnotacao(int id, String texto){
        Anotacoes anotacao = arrayAnotacoes.get(id-1);
        anotacao.setTexto(texto);

    }

    public void removeAnotacao(int id){
        Anotacoes anotacao = arrayAnotacoes.get(id-1);
        arrayRemovidos.add(anotacao);
        arrayAnotacoes.remove(id-1);

    }
    public StringBuilder apresentaAnotacao(){
        StringBuilder apresentacoes = new StringBuilder();

        for(Anotacoes anotacoes: arrayAnotacoes){
            apresentacoes.append(anotacoes).append("\n");
        }
        return apresentacoes;
    }

}
