package org.example;

import java.util.ArrayList;

public class BlocoDeNotas {
    ArrayList<Anotacoes> arrayAnotacoes = new ArrayList<>();
    ArrayList<Anotacoes> arrayRemovidos = new ArrayList<>();

    public void adicionaAnotacao(Anotacoes anotacao){
        arrayAnotacoes.add(anotacao);
    }
    public void editaAnotacao(int id, String texto){
        for (int i = 0; i <= arrayAnotacoes.size(); i++){
            int idcoparar = arrayAnotacoes.get(i).getId();

            if (idcoparar == id){
                arrayAnotacoes.get(i).setTexto(texto);
            }
        }
    }
    public void removeAnotacao(Anotacoes anotacao){
        arrayAnotacoes.remove(anotacao);
        arrayRemovidos.add(anotacao);
    }
    public void apresentaAnotacao(){
        for (Anotacoes a: arrayAnotacoes){

            System.out.println(a.getTexto());
        }
    }
}
