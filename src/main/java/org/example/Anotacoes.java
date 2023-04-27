package org.example;

import java.time.LocalDate;


public class Anotacoes {
    //Atributos
    private int id;
    private String texto;
    private LocalDate data;

    public String getTexto(){
        return texto;
    }
    public void setTexto(String texto){
        this.texto = texto;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }


}
